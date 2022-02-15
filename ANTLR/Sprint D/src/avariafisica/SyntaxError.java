package avariafisica;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.*;

import java.util.*;

/**
 * @author Luís Araújo
 */
public class SyntaxError extends BaseErrorListener {
    private boolean error;

    public SyntaxError(){
        super();
        error = false;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        this.error = true;
    }
    public boolean isError() {
        return this.error;
    }
}
