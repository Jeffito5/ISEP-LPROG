import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.sql.SQLOutput;

/**
 * @author Luís Araújo
 */
public class SyntaxError extends BaseErrorListener {
    public static final SyntaxError INSTANCE = new SyntaxError();

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        System.out.println("NotOK");
        throw new ParseCancellationException("Linha " + line + " no " + (charPositionInLine + 1) + "º caracter");
    }
}

