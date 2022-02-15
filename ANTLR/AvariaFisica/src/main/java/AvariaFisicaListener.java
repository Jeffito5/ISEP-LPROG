// Generated from C:/ANTLR/AvariaFisica/src/main/java\AvariaFisica.g4 by ANTLR 4.9.1
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AvariaFisicaParser}.
 */
public interface AvariaFisicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(AvariaFisicaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(AvariaFisicaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descLocEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDescLocEquipData(AvariaFisicaParser.DescLocEquipDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descLocEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDescLocEquipData(AvariaFisicaParser.DescLocEquipDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocEquipData(AvariaFisicaParser.LocEquipDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocEquipData(AvariaFisicaParser.LocEquipDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code erro}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterErro(AvariaFisicaParser.ErroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code erro}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitErro(AvariaFisicaParser.ErroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(AvariaFisicaParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(AvariaFisicaParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#mes}.
	 * @param ctx the parse tree
	 */
	void enterMes(AvariaFisicaParser.MesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#mes}.
	 * @param ctx the parse tree
	 */
	void exitMes(AvariaFisicaParser.MesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#dia}.
	 * @param ctx the parse tree
	 */
	void enterDia(AvariaFisicaParser.DiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#dia}.
	 * @param ctx the parse tree
	 */
	void exitDia(AvariaFisicaParser.DiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#ano}.
	 * @param ctx the parse tree
	 */
	void enterAno(AvariaFisicaParser.AnoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#ano}.
	 * @param ctx the parse tree
	 */
	void exitAno(AvariaFisicaParser.AnoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#loc_equip}.
	 * @param ctx the parse tree
	 */
	void enterLoc_equip(AvariaFisicaParser.Loc_equipContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#loc_equip}.
	 * @param ctx the parse tree
	 */
	void exitLoc_equip(AvariaFisicaParser.Loc_equipContext ctx);
	/**
	 * Enter a parse tree produced by {@link AvariaFisicaParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(AvariaFisicaParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link AvariaFisicaParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(AvariaFisicaParser.DescContext ctx);
}