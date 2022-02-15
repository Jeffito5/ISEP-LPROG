// Generated from C:/ANTLR/AvariaFisica/src/main/java\AvariaFisica.g4 by ANTLR 4.9.1
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AvariaFisicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AvariaFisicaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(AvariaFisicaParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descLocEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescLocEquipData(AvariaFisicaParser.DescLocEquipDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locEquipData}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocEquipData(AvariaFisicaParser.LocEquipDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code erro}
	 * labeled alternative in {@link AvariaFisicaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErro(AvariaFisicaParser.ErroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(AvariaFisicaParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#mes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMes(AvariaFisicaParser.MesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#dia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDia(AvariaFisicaParser.DiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#ano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAno(AvariaFisicaParser.AnoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#loc_equip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc_equip(AvariaFisicaParser.Loc_equipContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvariaFisicaParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(AvariaFisicaParser.DescContext ctx);
}