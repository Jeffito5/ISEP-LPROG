import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class AvariaFisica implements ANTLRErrorStrategy {
    public static boolean flag = false;

    public static void main(String[] args) throws IOException {
        System.out.println("Result with Visitor : \n");
        System.out.println("Please insert the data in this format:\n" +
                "Description (optional) in lower case: -> desc <-\n" +
                "Local in upper case: -> LOCAL <-\n" +
                "Equipment in upper case: -> EQUIPMENT <-\n" +
                "Date with the format dd/mm/yyyy\n");
        System.out.println("All the parameters must me separated with ;\n");
        System.out.println("Final example 1: desc ; LOCAL ; EQUIPMENT ; 01/01/2020\n");
        System.out.println("Final example 2: LOCAL ; EQUIPMENT ; 01/01/2020\n");
        System.out.println("\n");
        parseWithVisitor();
    }

    public static void parseWithVisitor() throws IOException {
        flag = false;
        AvariaFisicaLexer lexer = new AvariaFisicaLexer(CharStreams.fromFileName("src/main/java/avariaFisica.txt"));
        lexer.removeErrorListeners();
        lexer.addErrorListener(SyntaxError.INSTANCE);

        AvariaFisicaParser parser = new AvariaFisicaParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(SyntaxError.INSTANCE);

        ParseTree tree = parser.inicio(); // parse
        EvalVisitor eval = new EvalVisitor();
        String value = eval.visit(tree);
        if (flag) {
            System.out.println("NotOK");
        } else {
            System.out.println(value); // print the result
        }
    }

    @Override
    public void reset(Parser parser) {

    }

    @Override
    public Token recoverInline(Parser parser) throws RecognitionException {
        return null;
    }

    @Override
    public void recover(Parser parser, RecognitionException e) throws RecognitionException {

    }

    @Override
    public void sync(Parser parser) throws RecognitionException {

    }

    @Override
    public boolean inErrorRecoveryMode(Parser parser) {
        return false;
    }

    @Override
    public void reportMatch(Parser parser) {

    }

    @Override
    public void reportError(Parser parser, RecognitionException e) {
        flag = true;
    }
}
