import java.util.HashMap;
import java.util.Stack;

public class LLVMActions extends LangXBaseListener {
    HashMap<String, String> variables = new HashMap<>(); 
    Stack<String> valueStack = new Stack<>();
    Stack<String> typeStack = new Stack<>();


    @Override
    public void exitProg(LangXParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitDeclareAndAssign(LangXParser.DeclareAndAssignContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        
        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declareted!");
            System.exit(1);
        }
        
        variables.put(ID, type);
        LLVMGenerator.declare(ID, type);
        
        String val = valueStack.pop();
        String valType = typeStack.pop(); 
        
        LLVMGenerator.assign(ID, val, type);
    }

    @Override
    public void exitDeclare(LangXParser.DeclareContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        
        if (variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declareted!");
            System.exit(1);
        }
        
        variables.put(ID, type);
        LLVMGenerator.declare(ID, type);
    }

    @Override
    public void exitAssign(LangXParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " is already declareted!");
            System.exit(1);
        }
        String type = variables.get(ID);
        String val = valueStack.pop();
        typeStack.pop();
        
        LLVMGenerator.assign(ID, val, type);
    }

    @Override
    public void exitWrite(LangXParser.WriteContext ctx) {
        String val = valueStack.pop();
        String type = typeStack.pop();
        LLVMGenerator.print(val, type);
    }

    @Override
    public void exitRead(LangXParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value " + ID + " does not exist!");
            System.exit(1);
        }
        String type = variables.get(ID);
        LLVMGenerator.read(ID, type);
    }

    @Override
    public void exitIntConst(LangXParser.IntConstContext ctx) {
        valueStack.push(ctx.INT().getText());
        typeStack.push("skromny");
    }

    @Override
    public void exitRealConst(LangXParser.RealConstContext ctx) {
        valueStack.push(ctx.REAL().getText());
        typeStack.push("boski");
    }

    @Override
    public void exitVar(LangXParser.VarContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            System.err.println("Semantic error: Value not declared " + ID);
            System.exit(1);
        }
        String type = variables.get(ID);
        LLVMGenerator.load(ID, type);
        valueStack.push("%" + (LLVMGenerator.reg - 1));
        typeStack.push(type);
    }

    @Override
    public void exitAddSub(LangXParser.AddSubContext ctx) {
        String val2 = valueStack.pop();
        String type2 = typeStack.pop();
        String val1 = valueStack.pop();
        String type1 = typeStack.pop();
        
        LLVMGenerator.arithmetic(ctx.op.getText(), val1, val2, type1);
        valueStack.push("%" + (LLVMGenerator.reg - 1));
        typeStack.push(type1);
    }

    @Override
    public void exitMulDiv(LangXParser.MulDivContext ctx) {
        String val2 = valueStack.pop();
        String type2 = typeStack.pop();
        String val1 = valueStack.pop();
        String type1 = typeStack.pop();
        
        LLVMGenerator.arithmetic(ctx.op.getText(), val1, val2, type1);
        valueStack.push("%" + (LLVMGenerator.reg - 1));
        typeStack.push(type1);
    }
}