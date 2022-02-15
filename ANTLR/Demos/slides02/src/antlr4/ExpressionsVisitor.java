// Generated from Expressions.g4 by ANTLR 4.9.2
package expressions.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpressionsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExprMulDiv}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExprMulDiv(ExpressionsParser.OpExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExprSumDif}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExprSumDif(ExpressionsParser.OpExprSumDifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ExpressionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ExpressionsParser.AtomExprContext ctx);
}