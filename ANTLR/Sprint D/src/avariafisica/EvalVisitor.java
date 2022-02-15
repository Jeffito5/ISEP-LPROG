package avariafisica;

import avariafisica.AvariaFisicaBaseVisitor;
import avariafisica.AvariaFisicaParser;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author Luís Araújo
 */
public class EvalVisitor extends AvariaFisicaBaseVisitor<String> implements ANTLRErrorStrategy {
    @Override
    public String visitInicio(AvariaFisicaParser.InicioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDescLocEquipData(AvariaFisicaParser.DescLocEquipDataContext ctx) {
        String descricao = visit(ctx.a), local = visit(ctx.b), equipamento = visit(ctx.c), data = visit(ctx.d.dia()) + visit((ParseTree) ctx.d.SEPARATOR()) + visit(ctx.d.mes()) + visit((ParseTree) ctx.d.SEPARATOR()) + visit(ctx.d.ano());
        String s1 = descricao + ";" + local + ";" + equipamento + ";" + data;
        return s1;
    }

    @Override
    public String visitLocEquipData(AvariaFisicaParser.LocEquipDataContext ctx) {
        String local = visit(ctx.b), equipamento = visit(ctx.c), data = visit(ctx.d.dia()) + visit((ParseTree) ctx.d.SEPARATOR()) + visit(ctx.d.mes()) + visit((ParseTree) ctx.d.SEPARATOR()) + visit(ctx.d.ano());
        String s1 = local + ";" + equipamento + ";" + data;
        return s1;
    }

    @Override
    public String visitErro(AvariaFisicaParser.ErroContext ctx){
        System.out.println("Erro");
        return "Erro";
    }
    
    @Override
    public String visitAno(AvariaFisicaParser.AnoContext ctx){
        return ctx.getText();
    }
    
    @Override
    public String visitData(AvariaFisicaParser.DataContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMes(AvariaFisicaParser.MesContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDia(AvariaFisicaParser.DiaContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLoc_equip(AvariaFisicaParser.Loc_equipContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDesc(AvariaFisicaParser.DescContext ctx) {
        return ctx.getText();
    }

    //@Override
    //public String visitPrintFound(AvariaFisicaParser ctx) {
    //  return null;
    //}

    @Override
    public String visit(ParseTree parseTree) {
        return "Avaria Física: reportar acontecimento:\n" + parseTree.getText();
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return ruleNode.getText();
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return terminalNode.getText();
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return errorNode.getText();
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

    }
}

