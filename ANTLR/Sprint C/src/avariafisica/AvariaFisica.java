package Sprint C/src/avariafisica;

import eapli.base.formGrammar.avariafisica.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;


public class AvariaFisica {
    public static void main(String[] args) throws IOException {
        System.out.println("Result with Visitor : \n");
        System.out.println("Please insert the data in this format:\n" +
                "Description (optional) in lower case: -> desc <-\n" +
                "Local in upper case: -> LOCAL <-\n" +
                "Equipment in upper case: -> EQUIPMENT <-\n" +
                "Date with the format dd/mm/yyyy\n");
        System.out.println("All the parameters must me separated with ;\n");
        System.out.println("Final example: desc ; LOCAL ; EQUIPMENT ; 01/01/2020\n");
        parseWithVisitor();
    }

    public static void parseWithVisitor() throws IOException {
        AvariaFisicaLexer lexer = new AvariaFisicaLexer(CharStreams.fromFileName("C:\\Users\\Miguel Panda\\Documents\\lei20_21_s4_2df_03\\avariaFisica.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);//FIXME alterar o path acima
        AvariaFisicaParser parser = new AvariaFisicaParser(tokens);
        ParseTree tree = parser.inicio(); // parse
        EvalVisitor eval = new EvalVisitor();
        String value = eval.visit(tree);
        System.out.println(value); // print the result
    }
}
