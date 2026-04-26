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
    
    static int BUFFER_SIZE = 256; 

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
        String finalValueReg = val.name;

        if (!type.equals(val.type)) {
            if (type.equals("SmallDivine") && val.type.equals("Divine")) {
                finalValueReg = LLVMGenerator.double_to_float(val.name);
            } else if (type.equals("Divine") && val.type.equals("SmallDivine")) {
                finalValueReg = LLVMGenerator.float_to_double(val.name);
            } else if (type.equals("Dogma") && val.type.equals("Mortal")) {
                finalValueReg = mortal_to_dogma(val, ctx.getStart().getLine());
            }else {
                System.err.println("Semantic error (line " + ctx.getStart().getLine() + "): Cannot assign " + val.type + " to " + type + ".");
                System.exit(1);
            }
        }

        variables.put(ID, new Value(ID, type, val.length));
        LLVMGenerator.declare(ID, type);
        LLVMGenerator.assign(ID, finalValueReg, type);
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
        
        String finalValueReg = val.name;
        if (!var.type.equals(val.type)) {
            if (var.type.equals("SmallDivine") && val.type.equals("Divine")) {
                finalValueReg = LLVMGenerator.double_to_float(val.name);
            } else if (var.type.equals("Divine") && val.type.equals("SmallDivine")) {
                finalValueReg = LLVMGenerator.float_to_double(val.name);
            } else if (var.type.equals("Dogma") && val.type.equals("Mortal")) {
                finalValueReg = mortal_to_dogma(val, ctx.getStart().getLine());
            } else {
                System.err.println("Semantic error: Cannot assign " + val.type + " to " + var.type + ".");
                System.exit(1);
            }
        }
        
        var.length = val.length; 
        LLVMGenerator.assign(ID, finalValueReg, var.type);
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
        LLVMGenerator.load(ID, var.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), var.type, var.length));
    }

    @Override
    public void exitAddSub(LangXParser.AddSubContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        String op = ctx.op.getText();
        
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
        } else if (op.equals("+")) {
            if (v1.type.equals("Eternal") && v2.type.equals("Eternal")) {
                String res = LLVMGenerator.add_string(v1.name, v1.length, v2.name, v2.length);
                stack.push(new Value(res, "Eternal", v1.length + v2.length));
            } else if (v1.type.equals("Eternal") && v2.type.equals("Mortal")) {
                String v2str = LLVMGenerator.int_to_string(v2.name, 16);
                String res = LLVMGenerator.add_string(v1.name, v1.length, v2str, 16);
                stack.push(new Value(res, "Eternal", v1.length + 16));
            } else if (v1.type.equals("Eternal") && v2.type.equals("Divine")) {
                String v2str = LLVMGenerator.double_to_string(v2.name, 32); // Więcej miejsca na miejsca po przecinku!
                String res = LLVMGenerator.add_string(v1.name, v1.length, v2str, 32);
                stack.push(new Value(res, "Eternal", v1.length + 32));
            } else if (v1.type.equals("Eternal") && v2.type.equals("SmallDivine")) {
                String v2str = LLVMGenerator.float_to_string(v2.name, 32); 
                String res = LLVMGenerator.add_string(v1.name, v1.length, v2str, 32);
                stack.push(new Value(res, "Eternal", v1.length + 32));
            }
            else if (v1.type.equals("Mortal") && v2.type.equals("Eternal")) {
                String v1str = LLVMGenerator.int_to_string(v1.name, 16);
                String res = LLVMGenerator.add_string(v1str, 16, v2.name, v2.length);
                stack.push(new Value(res, "Eternal", 16 + v2.length));
            } else if (v1.type.equals("Divine") && v2.type.equals("Eternal")) {
                String v1str = LLVMGenerator.double_to_string(v1.name, 32);
                String res = LLVMGenerator.add_string(v1str, 32, v2.name, v2.length);
                stack.push(new Value(res, "Eternal", 32 + v2.length));
           } else if (v1.type.equals("SmallDivine") && v2.type.equals("Eternal")) {
                String v1str = LLVMGenerator.float_to_string(v1.name, 32);
                String res = LLVMGenerator.add_string(v1str, 32, v2.name, v2.length);
                stack.push(new Value(res, "Eternal", 32 + v2.length));
            }else {
                System.err.println("Semantic error: Cannot combine " + v1.type + " and " + v2.type + ".");
                System.exit(1);
            }
        } else {
            System.err.println("Semantic error: Operator " + op + " not supported for these types.");
            System.exit(1);
        }
    }

    @Override
    public void exitMulDiv(LangXParser.MulDivContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        String op = ctx.op.getText();
        
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
        } else {
            System.err.println("Semantic error: Cannot multiply/divide " + v1.type + " and " + v2.type + ".");
            System.exit(1);
        }
    }

    @Override
    public void exitLogicAnd(LangXParser.LogicAndContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();

        if (!v1.type.equals("Dogma") || !v2.type.equals("Dogma")) {
            System.err.println("Semantic error: AND requires Dogma and Dogma.");
            System.exit(1);
        }

        LLVMGenerator.logic("AND", v1.name, v2.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Dogma", 0));
    }

    @Override
    public void exitLogicOr(LangXParser.LogicOrContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();

        if (!v1.type.equals("Dogma") || !v2.type.equals("Dogma")) {
            System.err.println("Semantic error: OR requires Dogma and Dogma.");
            System.exit(1);
        }

        LLVMGenerator.logic("OR", v1.name, v2.name);
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

        LLVMGenerator.logic("XOR", v1.name, v2.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), "Dogma", 0));
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
        LLVMGenerator.loadArrayElement(address, arr.type);
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
        String finalValueReg = val.name;
        if (!arr.type.equals(val.type)) {
            if (arr.type.equals("SmallDivine") && val.type.equals("Divine")) {
                finalValueReg = LLVMGenerator.double_to_float(val.name);
            } else if (arr.type.equals("Divine") && val.type.equals("SmallDivine")) {
                finalValueReg = LLVMGenerator.float_to_double(val.name);
            } else if (arr.type.equals("Dogma") && val.type.equals("Mortal")) {
                finalValueReg = mortal_to_dogma(val, ctx.getStart().getLine());
            } else {
                System.err.println("Semantic error: Cannot assign " + val.type + " to array of " + arr.type + ".");
                System.exit(1);
            }
        }
        String address = LLVMGenerator.getArrayElementAddress(ID, arr.type, arr.arraySize, index.name);
        LLVMGenerator.assignArrayElement(address, finalValueReg, arr.type);
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
            LLVMGenerator.load(ID, val.type);
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