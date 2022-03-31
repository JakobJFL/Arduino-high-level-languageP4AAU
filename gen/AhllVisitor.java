// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link AhllParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(AhllParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AhllParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(AhllParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(AhllParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AhllParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AhllParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteral(AhllParser.PinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#pinName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinName(AhllParser.PinNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#pinNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinNumber(AhllParser.PinNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AhllParser#pinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinType(AhllParser.PinTypeContext ctx);
}