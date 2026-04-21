import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        LangXLexer lexer = new LangXLexer(input);
        
        BaseErrorListener errorListener = new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Error (line " + line + ":" + charPositionInLine + ") -> " + msg);
                System.exit(1);
            }
        };

        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangXParser parser = new LangXParser(tokens);
        
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        LLVMActions listener = new LLVMActions();
        walker.walk(listener, tree);
    }
}