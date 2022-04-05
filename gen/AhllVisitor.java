// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AhllParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AhllVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AhllParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AhllParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(AhllParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#setupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupDef(AhllParser.SetupDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#loopDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDef(AhllParser.LoopDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(AhllParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(AhllParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AhllParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AhllParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(AhllParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(AhllParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(AhllParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AhllParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(AhllParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(AhllParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AhllParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#arrayDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDef(AhllParser.ArrayDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#writeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFunc(AhllParser.WriteFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(AhllParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#readFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFunc(AhllParser.ReadFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AhllParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AhllParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AhllParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(AhllParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AhllParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AhllParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(AhllParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(AhllParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(AhllParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(AhllParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteral(AhllParser.PinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#sInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSInt(AhllParser.SIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#uInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUInt(AhllParser.UIntContext ctx);
}