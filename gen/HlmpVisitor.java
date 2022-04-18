// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HlmpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HlmpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HlmpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HlmpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(HlmpParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(HlmpParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(HlmpParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HlmpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HlmpParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(HlmpParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HlmpParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HlmpParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(HlmpParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HlmpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(HlmpParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#sInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSInt(HlmpParser.SIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(HlmpParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(HlmpParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFunc(HlmpParser.ReadFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteral(HlmpParser.PinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HlmpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(HlmpParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(HlmpParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HlmpParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HlmpParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFunc(HlmpParser.WriteFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(HlmpParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(HlmpParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(HlmpParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(HlmpParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupDef(HlmpParser.SetupDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDef(HlmpParser.LoopDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(HlmpParser.CommentContext ctx);
}