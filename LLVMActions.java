import java.util.HashMap;
import java.util.Stack;

class Value {
    public String name;
    public String type;
    public int length;

    public boolean isArray;
    public int arraySize;

    public Value(String name, String type, int length) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isArray = false;
        this.arraySize = 0;
    }

    public Value(String name, String type, int length, boolean isArray, int arraySize) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isArray = isArray;
        this.arraySize = arraySize;
    }
}


public class LLVMActions extends LangXBaseListener {
    HashMap<String, Value> variables = new HashMap<>(); 
    Stack<Value> stack = new Stack<>();
    Stack<Integer> brStack = new Stack<>();
    
    static int BUFFER_SIZE = 256; 

    private String getCastedValueReg(String expectedType, Value val, int line) {
        if (expectedType.equals(val.type)) {
            return val.name;
        }
        
        if (expectedType.equals("SmallDivine") && val.type.equals("Divine")) {
            return LLVMGenerator.double_to_float(val.name);
        } else if (expectedType.equals("Divine") && val.type.equals("SmallDivine")) {
            return LLVMGenerator.float_to_double(val.name);
        } else if (expectedType.equals("Dogma") && val.type.equals("Mortal")) {
            return mortal_to_dogma(val, line);
        }
        
        System.err.println("Semantic error (line " + line + "): Cannot assign " + val.type + " to " + expectedType + ".");
        System.exit(1);
        return "";
    }

    private String mortal_to_dogma(Value val, int line) {
        if (val.name.equals("0")) return "false";
        if (val.name.equals("1")) return "true";

        System.err.println(
            "Semantic error (line " + line + "): Dogma can be assigned only Heaven, Hell, 0 or 1."
        );
        System.exit(1);
        return "";
    }

    @Override
    public void exitProg(LangXParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        
        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declared!");
            System.exit(1);
        }
        
        Value val = stack.pop();
        String finalValueReg = getCastedValueReg(type, val, ctx.getStart().getLine());

        variables.put(ID, new Value(ID, type, val.length));
        LLVMGenerator.declare(ID, type);
        LLVMGenerator.assign("%" + ID, finalValueReg, type);
    }

    @Override
    public void exitDeclare(LangXParser.DeclareContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        
        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declared!");
            System.exit(1);
        }
        
        variables.put(ID, new Value(ID, type, BUFFER_SIZE));
        LLVMGenerator.declare(ID, type);
    }

    @Override
    public void exitAssign(LangXParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " does not exist!");
            System.exit(1);
        }
        Value var = variables.get(ID);
        if (var.isArray) {
            System.err.println("Semantic error: Cannot assign to whole array " + ID + ". Use " + ID + "[index].");
            System.exit(1);
        }
        Value val = stack.pop();
        
        String finalValueReg = getCastedValueReg(var.type, val, ctx.getStart().getLine());
        
        var.length = val.length; 
        LLVMGenerator.assign("%" + ID, finalValueReg, var.type);
    }

    @Override
    public void exitTrueConst(LangXParser.TrueConstContext ctx) {
        stack.push(new Value("true", "Dogma", 0));
    }

    @Override
    public void exitFalseConst(LangXParser.FalseConstContext ctx) {
        stack.push(new Value("false", "Dogma", 0));
    }

    @Override
    public void exitWrite(LangXParser.WriteContext ctx) {
        Value val = stack.pop();
        LLVMGenerator.print(val.name, val.type);
    }

    @Override
    public void exitRead(LangXParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " does not exist!");
            System.exit(1);
        }
        Value var = variables.get(ID);
        if (var.isArray) {
            System.err.println("Semantic error: Cannot Confess whole array " + ID + ". Use " + ID + "[index].");
            System.exit(1);
        }
        LLVMGenerator.read(ID, var.type, var.length);
    }

    @Override
    public void exitIntConst(LangXParser.IntConstContext ctx) {
        stack.push(new Value(ctx.INT().getText(), "Mortal", 0));
    }

    @Override
    public void exitRealConst(LangXParser.RealConstContext ctx) {
        stack.push(new Value(ctx.REAL().getText(), "Divine", 0));
    }

    @Override
    public void exitStringConst(LangXParser.StringConstContext ctx) {
        String raw = ctx.STRING().getText();
        String content = raw.substring(1, raw.length() - 1);
        String ptrReg = LLVMGenerator.constant_string(content);
        stack.push(new Value(ptrReg, "Eternal", content.length()));
    }

    @Override
    public void exitVar(LangXParser.VarContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value not declared " + ID);
            System.exit(1);
        }
        Value var = variables.get(ID);
        if (var.isArray) {
            System.err.println("Semantic error: Array " + ID + " requires index.");
            System.exit(1);
        }
        LLVMGenerator.load("%" + ID, var.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), var.type, var.length));
    }

    private void handleMathOperation(Value v1, Value v2, String op, int line) {
        if (v1.type.equals("Mortal") && v2.type.equals("Mortal")) {
            LLVMGenerator.arithmetic(op, v1.name, v2.name, "Mortal");
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Mortal", 0));
        } else if (v1.type.equals("Divine") && v2.type.equals("Divine")) {
            LLVMGenerator.arithmetic(op, v1.name, v2.name, "Divine");
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Divine", 0));
        } else if (v1.type.equals("SmallDivine") && v2.type.equals("SmallDivine")) {
            LLVMGenerator.arithmetic(op, v1.name, v2.name, "SmallDivine");
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), "SmallDivine", 0));
        } else if (v1.type.equals("SmallDivine") && v2.type.equals("Divine")) {
            String extendedV1 = LLVMGenerator.float_to_double(v1.name);
            LLVMGenerator.arithmetic(op, extendedV1, v2.name, "Divine");
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Divine", 0));
        } else if (v1.type.equals("Divine") && v2.type.equals("SmallDivine")) {
            String extendedV2 = LLVMGenerator.float_to_double(v2.name);
            LLVMGenerator.arithmetic(op, v1.name, extendedV2, "Divine");
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Divine", 0));
        } else if (op.equals("+") && (v1.type.equals("Eternal") || v2.type.equals("Eternal"))) {
            Value str1 = stringify(v1);
            Value str2 = stringify(v2);
            if (str1 == null || str2 == null) {
                System.err.println("Semantic error (line " + line + "): Cannot combine " + v1.type + " and " + v2.type + ".");
                System.exit(1);
            }
            String res = LLVMGenerator.add_string(str1.name, str1.length, str2.name, str2.length);
            stack.push(new Value(res, "Eternal", str1.length + str2.length));
        } else {
            System.err.println("Semantic error (line " + line + "): Operator " + op + " not supported for types " + v1.type + " and " + v2.type + ".");
            System.exit(1);
        }
    }

    @Override
    public void exitAddSub(LangXParser.AddSubContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        String op = ctx.op.getText();

        handleMathOperation(v1, v2, op, ctx.getStart().getLine());   
    }

    @Override
    public void exitMulDiv(LangXParser.MulDivContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        String op = ctx.op.getText();
        
        handleMathOperation(v1, v2, op, ctx.getStart().getLine());
    }

    private Value stringify(Value v) {
        if (v.type.equals("Eternal")) return v;
        if (v.type.equals("Mortal")) {
            return new Value(LLVMGenerator.int_to_string(v.name, 16), "Eternal", 16);
        }
        if (v.type.equals("Divine")) {
            return new Value(LLVMGenerator.double_to_string(v.name, 32), "Eternal", 32);
        }
        if (v.type.equals("SmallDivine")) {
            return new Value(LLVMGenerator.float_to_string(v.name, 32), "Eternal", 32);
        }
        if (v.type.equals("Dogma")) {
            return new Value(LLVMGenerator.dogma_to_string(v.name), "Eternal", 6);
        }
        
        return null;
    }


    @Override
    public void exitAndOp(LangXParser.AndOpContext ctx) {
        Value v1 = stack.pop();
        if (!v1.type.equals("Dogma")) {
            System.err.println("Semantic error: AND requires Dogma on LHS.");
            System.exit(1);
        }
        int currentBr = LLVMGenerator.br++;
        brStack.push(currentBr);
        LLVMGenerator.startAnd(v1.name, currentBr);
    }

    @Override
    public void exitLogicAnd(LangXParser.LogicAndContext ctx) {
        Value v2 = stack.pop();
        if (!v2.type.equals("Dogma")) {
            System.err.println("Semantic error: AND requires Dogma on RHS.");
            System.exit(1);
        }
        int currentBr = brStack.pop();
        LLVMGenerator.endAnd(v2.name, currentBr);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Dogma", 0));
    }

    @Override
    public void exitOrOp(LangXParser.OrOpContext ctx) {
        Value v1 = stack.pop();
        if (!v1.type.equals("Dogma")) {
            System.err.println("Semantic error: OR requires Dogma on LHS.");
            System.exit(1);
        }
        int currentBr = LLVMGenerator.br++;
        brStack.push(currentBr);
        LLVMGenerator.startOr(v1.name, currentBr);
    }

    @Override
    public void exitLogicOr(LangXParser.LogicOrContext ctx) {
        Value v2 = stack.pop();
        if (!v2.type.equals("Dogma")) {
            System.err.println("Semantic error: OR requires Dogma on RHS.");
            System.exit(1);
        }
        int currentBr = brStack.pop();
        LLVMGenerator.endOr(v2.name, currentBr);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Dogma", 0));
    }

    @Override
    public void exitLogicXor(LangXParser.LogicXorContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if (!v1.type.equals("Dogma") || !v2.type.equals("Dogma")) {
            System.err.println("Semantic error: XOR requires Dogma and Dogma.");
            System.exit(1);
        }
        LLVMGenerator.main_text += "    %" + LLVMGenerator.reg + " = xor i1 " + v1.name + ", " + v2.name + "\n";
        stack.push(new Value("%" + (LLVMGenerator.reg++), "Dogma", 0));
    }

    @Override
    public void exitUnaryMinus(LangXParser.UnaryMinusContext ctx) {
        Value v = stack.pop();
        
        if (!v.type.equals("Mortal") && !v.type.equals("Divine") && !v.type.equals("SmallDivine")) {
            System.err.println("Semantic error: Unary minus (-) requires a numeric type (Mortal, Divine or SmallDivine).");
            System.exit(1);
        }
        
        LLVMGenerator.unaryMinus(v.name, v.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), v.type, 0));
    }

    @Override
    public void exitLogicNeg(LangXParser.LogicNegContext ctx) {
        Value v = stack.pop();

        if (!v.type.equals("Dogma")) {
            System.err.println("Semantic error: NEG requires Dogma.");
            System.exit(1);
        }

        LLVMGenerator.logicNeg(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Dogma", 0));
    }

    private void checkArrayIndexIfConst(String ID, Value arr, Value index, int line) {
        if (index.name.matches("-?\\d+")) {
            int idx = Integer.parseInt(index.name);
            if (idx < 0 || idx >= arr.arraySize) {
                System.err.println(
                    "Semantic error (line " + line + "): Array index out of bounds: "
                    + ID + "[" + idx + "]. Valid range is 0.." + (arr.arraySize - 1) + "."
                );
                System.exit(1);
            }
        }
    }

    @Override
    public void exitDeclareArray(LangXParser.DeclareArrayContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        int size = Integer.parseInt(ctx.INT().getText());

        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declared!");
            System.exit(1);
        }
        if (type.equals("Eternal")) {
            System.err.println("Semantic error: Eternal arrays are not supported yet.");
            System.exit(1);
        }
        if (size <= 0) {
            System.err.println("Semantic error: Array size must be greater than 0.");
            System.exit(1);
        }
        variables.put(ID, new Value(ID, type, 0, true, size));
        LLVMGenerator.declareArray(ID, type, size);
    }

    @Override
    public void exitArrayElem(LangXParser.ArrayElemContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        Value index = stack.pop();
        if (!index.type.equals("Mortal")) {
            System.err.println("Semantic error: Array index must be Mortal.");
            System.exit(1);
        }
        checkArrayIndexIfConst(ID, arr, index, ctx.getStart().getLine());
        String address = LLVMGenerator.getArrayElementAddress(ID, arr.type, arr.arraySize, index.name);
        LLVMGenerator.load(address, arr.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), arr.type, 0));
    }

    @Override
    public void exitAssignArrayElem(LangXParser.AssignArrayElemContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        Value val = stack.pop();
        Value index = stack.pop();
        if (!index.type.equals("Mortal")) {
            System.err.println("Semantic error: Array index must be Mortal.");
            System.exit(1);
        }
        checkArrayIndexIfConst(ID, arr, index, ctx.getStart().getLine());
        String finalValueReg = getCastedValueReg(arr.type, val, ctx.getStart().getLine());
       
        String address = LLVMGenerator.getArrayElementAddress(ID, arr.type, arr.arraySize, index.name);
        LLVMGenerator.assign(address, finalValueReg, arr.type);
    }

    @Override
    public void exitWriteId(LangXParser.WriteIdContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " does not exist!");
            System.exit(1);
        }
        Value val = variables.get(ID);
        if (val.isArray) {
            LLVMGenerator.printArray(ID, val.type, val.arraySize);
        } else {
            LLVMGenerator.load("%" + ID, val.type);
            LLVMGenerator.print("%" + (LLVMGenerator.reg - 1), val.type);
        }
    }

    @Override
    public void exitWriteArrayRange(LangXParser.WriteArrayRangeContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        int start = Integer.parseInt(ctx.INT(0).getText());
        int end = Integer.parseInt(ctx.INT(1).getText());
        if (start < 0 || end >= arr.arraySize || start > end) {
            System.err.println("Semantic error: Invalid array range " + ID + "[" + start + ":" + end + "].");
            System.exit(1);
        }
        LLVMGenerator.printArrayRange(ID, arr.type, arr.arraySize, start, end);
    }

    @Override
    public void exitWriteArrayFrom(LangXParser.WriteArrayFromContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        int start = Integer.parseInt(ctx.INT().getText());
        int end = arr.arraySize - 1;
        if (start < 0 || start >= arr.arraySize) {
            System.err.println("Semantic error: Invalid array range " + ID + "[" + start + ":].");
            System.exit(1);
        }
        LLVMGenerator.printArrayRange(ID, arr.type, arr.arraySize, start, end);
    }

    @Override
    public void exitWriteArrayTo(LangXParser.WriteArrayToContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        int start = 0;
        int end = Integer.parseInt(ctx.INT().getText());
        if (end < 0 || end >= arr.arraySize) {
            System.err.println("Semantic error: Invalid array range " + ID + "[:" + end + "].");
            System.exit(1);
        }
        LLVMGenerator.printArrayRange(ID, arr.type, arr.arraySize, start, end);
    }

    @Override
    public void exitReadArrayElem(LangXParser.ReadArrayElemContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }
        Value index = stack.pop();
        if (!index.type.equals("Mortal")) {
            System.err.println("Semantic error: Array index must be Mortal.");
            System.exit(1);
        }
        checkArrayIndexIfConst(ID, arr, index, ctx.getStart().getLine());
        String address = LLVMGenerator.getArrayElementAddress(ID, arr.type, arr.arraySize, index.name);
        LLVMGenerator.readArrayElement(address, arr.type);
    }
}