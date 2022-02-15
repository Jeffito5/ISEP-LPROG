package avariafisica;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author Luís Araújo
 */
public class EvalVisitor extends AvariaFisicaBaseVisitor<String> {
    @Override
    public String visitInicio(AvariaFisicaParser.InicioContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDescLocEquipData(AvariaFisicaParser.DescLocEquipDataContext ctx) {
        String descricao = visit(ctx.a), local = visit(ctx.b), equipamento = visit(ctx.c), data = visit(ctx.d);

        String s1 = "Avaria Física: reportar acontecimento:\n" + descricao + ";" + local + ";" + equipamento + ";" + data;
        //VERIFICA SE O QUE FOI INTRODUZIDO NÃO É NULO, VAZIO OU SE ESTÁ EM MAIÚSCULAS OU MINÚSCULAS
        if (descricao == null || local == null || equipamento == null || data == null || descricao.isEmpty() ||
                local.isEmpty() || equipamento.isEmpty() || data.isEmpty()) {
            System.out.println("Dados incompletos ou errados. Tente novamente.");
        } else {
            return s1;
        }
        return "Erro. Tente novamente.";
    }

    @Override
    public String visitlocEquipData(AvariaFisicaParser.locEquipDataContext ctx) {
        String local = visit(ctx.b), equipamento = visit(ctx.c), data = visit(ctx.d);
        String s1 = "Avaria Física: reportar acontecimento:\n" + local + ";" + equipamento + ";" + data;
        //VERIFICA SE O QUE FOI INTRODUZIDO NÃO É NULO, VAZIO OU SE ESTÁ EM MAIÚSCULAS OU MINÚSCULAS
        if (local == null || equipamento == null || data == null ||
                local.isEmpty() || equipamento.isEmpty() || data.isEmpty()) {
            System.out.println("Dados incompletos ou errados. Tente novamente.");
        } else {
            return s1;
        }
        return "Erro. Tente novamente.";
    }

    @Override
    public String visitData(AvariaFisicaParser.DataContext ctx) {
        return null;
    }

    @Override
    public String visitMes(AvariaFisicaParser.MesContext ctx) {
        return null;
    }

    @Override
    public String visitDia(AvariaFisicaParser.DiaContext ctx) {
        return null;
    }

    @Override
    public String visitLoc_equip(AvariaFisicaParser.Loc_equipContext ctx) {
        return null;
    }

    @Override
    public String visitDesc(AvariaFisicaParser.DescContext ctx) {
        return null;
    }

    //@Override
    //public String visitPrintFound(AvariaFisicaParser ctx) {
    //  return null;
    //}

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

