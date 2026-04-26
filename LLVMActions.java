import java.util.HashMap;
import java.util.Stack;

class Value {
    public String name;
    public String type;
    public int length;
    public boolean isArray;
    public int arraySize;

    public boolean isMatrix;
    public int rows;
    public int cols;

    public Value(String name, String type, int length) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isArray = false;
        this.arraySize = 0;
        this.isMatrix = false;
        this.rows = 0;
        this.cols = 0;
    }

    public Value(String name, String type, int length, boolean isArray, int arraySize) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isArray = isArray;
        this.arraySize = arraySize;
         this.isMatrix = false;
        this.rows = 0;
        this.cols = 0;
    }

     public Value(String name, String type, int length, boolean isMatrix, int rows, int cols) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.isArray = false;
        this.arraySize = 0;
        this.isMatrix = isMatrix;
        this.rows = rows;
        this.cols = cols;
    }
}

public class LLVMActions extends LangXBaseListener {
    HashMap<String, Value> variables = new HashMap<>(); 
    Stack<Value> stack = new Stack<>();
    Stack<Integer> brStack = new Stack<>();
    
    static int BUFFER_SIZE = 256; 

    @Override
    public void exitProg(LangXParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
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
                finalValueReg = LLVMGenerator.mortal_to_dogma(val, ctx.getStart().getLine());
            } else {
                System.err.println("Semantic error: Cannot assign " + val.type + " to array of " + arr.type + ".");
                System.exit(1);
            }
        }
        String address = LLVMGenerator.getArrayElementAddress(ID, arr.type, arr.arraySize, index.name);
        LLVMGenerator.assignArrayElement(address, finalValueReg, arr.type);
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

    @Override
    public void exitWriteId(LangXParser.WriteIdContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " does not exist!");
            System.exit(1);
        }
        Value val = variables.get(ID);
        if (val.isMatrix) {
            LLVMGenerator.printMatrix(ID, val.type, val.rows, val.cols);
        } else if (val.isArray) {
            LLVMGenerator.printArray(ID, val.type, val.arraySize);
        } else {
            LLVMGenerator.load(ID, val.type);
            LLVMGenerator.print("%" + (LLVMGenerator.reg - 1), val.type);
        }
    }

    @Override
    public void exitWriteArrayRange(LangXParser.WriteArrayRangeContext ctx) {
        String ID = ctx.ID().getText();
        int start = Integer.parseInt(ctx.INT(0).getText());
        int end = Integer.parseInt(ctx.INT(1).getText());
        printArraySlice(ID, start, end, "[" + start + ":" + end + "]");
    }

    @Override
    public void exitWriteArrayFrom(LangXParser.WriteArrayFromContext ctx) {
        String ID = ctx.ID().getText();
        int start = Integer.parseInt(ctx.INT().getText());
        printArraySlice(ID, start, null, "[" + start + ":]");
    }

    @Override
    public void exitWriteArrayTo(LangXParser.WriteArrayToContext ctx) {
        String ID = ctx.ID().getText();
        int end = Integer.parseInt(ctx.INT().getText());
        printArraySlice(ID, null, end, "[:" + end + "]");
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
                finalValueReg = LLVMGenerator.mortal_to_dogma(val, ctx.getStart().getLine());
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
        if (var.isArray || var.isMatrix) {
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
                finalValueReg = LLVMGenerator.mortal_to_dogma(val, ctx.getStart().getLine());
            } else {
                System.err.println("Semantic error: Cannot assign " + val.type + " to " + var.type + ".");
                System.exit(1);
            }
        }
        
        var.length = val.length; 
        LLVMGenerator.assign(ID, finalValueReg, var.type);
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
        if (var.isArray || var.isMatrix) {
            System.err.println("Semantic error: Cannot Confess whole array " + ID + ". Use " + ID + "[index].");
            System.exit(1);
        }
        LLVMGenerator.read(ID, var.type, var.length);
    }

    @Override
    public void exitUnaryMinus(LangXParser.UnaryMinusContext ctx) {
        Value v = stack.pop();
        if (!v.type.equals("Mortal") && !v.type.equals("Divine") && !v.type.equals("SmallDivine")) {
            System.err.println("Semantic error: Unary minus (-) requires a numeric type (Mortal, Divine or SmallDivine).");
            System.exit(1);
        }
        if (v.name.matches("\\d+(\\.\\d+)?")) {
            stack.push(new Value("-" + v.name, v.type, 0));
        } else {
            LLVMGenerator.unaryMinus(v.name, v.type);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1), v.type, 0));
        }
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
        } else if (op.equals("+") && (v1.type.equals("Eternal") || v2.type.equals("Eternal"))) {
            Value str1 = stringify(v1);
            Value str2 = stringify(v2);
            if (str1 == null || str2 == null) {
                System.err.println("Semantic error: Cannot combine " + v1.type + " and " + v2.type + ".");
                System.exit(1);
            }
            String res = LLVMGenerator.add_string(str1.name, str1.length, str2.name, str2.length);
            stack.push(new Value(res, "Eternal", str1.length + str2.length));
        } else {
            System.err.println("Semantic error: Operator " + op + " not supported for types " + v1.type + " and " + v2.type + ".");
            System.exit(1);
        }
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
    public void exitTrueConst(LangXParser.TrueConstContext ctx) {
        stack.push(new Value("true", "Dogma", 0));
    }

    @Override
    public void exitFalseConst(LangXParser.FalseConstContext ctx) {
        stack.push(new Value("false", "Dogma", 0));
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
        if (var.isArray || var.isMatrix) {
            System.err.println("Semantic error: Array " + ID + " requires index.");
            System.exit(1);
        }
        LLVMGenerator.load(ID, var.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), var.type, var.length));
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

    private void printArraySlice(String ID, Integer startParam, Integer endParam, String rangeText) {

        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Array " + ID + " does not exist!");
            System.exit(1);
        }
        Value arr = variables.get(ID);
        if (!arr.isArray) {
            System.err.println("Semantic error: " + ID + " is not an array.");
            System.exit(1);
        }

        int start = (startParam != null) ? startParam : 0;
        int end = (endParam != null) ? endParam : (arr.arraySize - 1);

        if (start < 0 || end >= arr.arraySize || start > end) {
            System.err.println("Semantic error: Invalid array range " + ID + rangeText + ".");
            System.exit(1);
        }
        
        LLVMGenerator.printArrayRange(ID, arr.type, arr.arraySize, start, end);
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

    private Value getMatrixOrDie(String ID, int line) {
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error (line " + line + "): Matrix " + ID + " does not exist!");
            System.exit(1);
        }
        Value matrix = variables.get(ID);
        if (!matrix.isMatrix) {
            System.err.println("Semantic error (line " + line + "): " + ID + " is not a matrix.");
            System.exit(1);
        }
        return matrix;
    }

    private void checkMatrixIndexIfConst(String ID, Value matrix, Value row, Value col, int line) {
        if (row.name.matches("-?\\d+")) {
            int r = Integer.parseInt(row.name);
            if (r < 0 || r >= matrix.rows) {
                System.err.println( "Semantic error (line " + line + "): Matrix row out of bounds: " + ID + "[" + r + "][...]. Valid rows are 0.." + (matrix.rows - 1) + ".");
                System.exit(1);
            }
        }
        if (col.name.matches("-?\\d+")) {
            int c = Integer.parseInt(col.name);
            if (c < 0 || c >= matrix.cols) {
                System.err.println("Semantic error (line " + line + "): Matrix column out of bounds: "+ ID + "[...][" + c + "]. Valid columns are 0.." + (matrix.cols - 1) + ".");
                System.exit(1);
            }
        }
    }

    @Override
    public void exitDeclareMatrix(LangXParser.DeclareMatrixContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        int rows = Integer.parseInt(ctx.INT(0).getText());
        int cols = Integer.parseInt(ctx.INT(1).getText());
        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declared!");
            System.exit(1);
        }
        if (type.equals("Eternal") || type.equals("Dogma")) {
            System.err.println("Semantic error: Only numeric matrices are supported.");
            System.exit(1);
        }
        if (rows <= 0 || cols <= 0) {
            System.err.println("Semantic error: Matrix dimensions must be greater than 0.");
            System.exit(1);
        }
        variables.put(ID, new Value(ID, type, 0, true, rows, cols));
        LLVMGenerator.declareMatrix(ID, type, rows, cols);
    }

    @Override
    public void exitMatrixElem(LangXParser.MatrixElemContext ctx) {
        String ID = ctx.ID().getText();
        Value matrix = getMatrixOrDie(ID, ctx.getStart().getLine());
        Value col = stack.pop();
        Value row = stack.pop();
        if (!row.type.equals("Mortal") || !col.type.equals("Mortal")) {
            System.err.println("Semantic error: Matrix indexes must be Mortal.");
            System.exit(1);
        }
        checkMatrixIndexIfConst(ID, matrix, row, col, ctx.getStart().getLine());
        String address = LLVMGenerator.getMatrixElementAddress(ID, matrix.type, matrix.rows,matrix.cols,row.name, col.name);
        LLVMGenerator.loadArrayElement(address, matrix.type);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), matrix.type, 0));
    }

    @Override
    public void exitAssignMatrixElem(LangXParser.AssignMatrixElemContext ctx) {
        String ID = ctx.ID().getText();
        Value matrix = getMatrixOrDie(ID, ctx.getStart().getLine());
        Value val = stack.pop();
        Value col = stack.pop();
        Value row = stack.pop();
        if (!row.type.equals("Mortal") || !col.type.equals("Mortal")) {
            System.err.println("Semantic error: Matrix indexes must be Mortal.");
            System.exit(1);
        }
        checkMatrixIndexIfConst(ID, matrix, row, col, ctx.getStart().getLine());
        String finalValueReg = val.name;
        if (!matrix.type.equals(val.type)) {
            if (matrix.type.equals("SmallDivine") && val.type.equals("Divine")) {
                finalValueReg = LLVMGenerator.double_to_float(val.name);
            } else if (matrix.type.equals("Divine") && val.type.equals("SmallDivine")) {
                finalValueReg = LLVMGenerator.float_to_double(val.name);
            } else {
                System.err.println("Semantic error: Cannot assign " + val.type + " to matrix of " + matrix.type + ".");
                System.exit(1);
            }
        }
        String address = LLVMGenerator.getMatrixElementAddress(ID, matrix.type, matrix.rows, matrix.cols, row.name,col.name);
        LLVMGenerator.assignArrayElement(address, finalValueReg, matrix.type);
    }

    @Override
    public void exitReadMatrixElem(LangXParser.ReadMatrixElemContext ctx) {
        String ID = ctx.ID().getText();
        Value matrix = getMatrixOrDie(ID, ctx.getStart().getLine());
        Value col = stack.pop();
        Value row = stack.pop();
        if (!row.type.equals("Mortal") || !col.type.equals("Mortal")) {
            System.err.println("Semantic error: Matrix indexes must be Mortal.");
            System.exit(1);
        }
        checkMatrixIndexIfConst(ID, matrix, row, col, ctx.getStart().getLine());
        String address = LLVMGenerator.getMatrixElementAddress( ID,matrix.type,matrix.rows, matrix.cols,row.name,col.name);
        LLVMGenerator.readArrayElement(address, matrix.type);
    }

    @Override
    public void exitWriteMatrixRow(LangXParser.WriteMatrixRowContext ctx) {
        String ID = ctx.ID().getText();
        Value matrix = getMatrixOrDie(ID, ctx.getStart().getLine());
        int row = Integer.parseInt(ctx.INT().getText());
        if (row < 0 || row >= matrix.rows) {
            System.err.println(
                "Semantic error: Matrix row out of bounds: "
                + ID + "[" + row + "]. Valid rows are 0.." + (matrix.rows - 1) + "."
            );
            System.exit(1);
        }
        LLVMGenerator.printMatrixRow(ID, matrix.type, matrix.rows, matrix.cols, row);
    }

    @Override
    public void exitWriteMatrixColumn(LangXParser.WriteMatrixColumnContext ctx) {
        String ID = ctx.ID().getText();
        Value matrix = getMatrixOrDie(ID, ctx.getStart().getLine());
        int col = Integer.parseInt(ctx.INT().getText());
        if (col < 0 || col >= matrix.cols) {
            System.err.println(
                "Semantic error: Matrix column out of bounds: "
                + ID + "[" + col + "]. Valid columns are 0.." + (matrix.cols - 1) + "."
            );
            System.exit(1);
        }
        LLVMGenerator.printMatrixColumn(ID, matrix.type, matrix.rows, matrix.cols, col);
    }
 
}