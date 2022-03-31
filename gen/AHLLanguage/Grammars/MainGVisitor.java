// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/AHLLanguage/Grammars\Ahll.g4 by ANTLR 4.9.2
package AHLLanguage.Grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainGParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainGParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(MainGParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(MainGParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(MainGParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MainGParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MainGParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MainGParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MainGParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MainGParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(MainGParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MainGParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(MainGParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MainGParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(MainGParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(MainGParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MainGParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MainGParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteral(MainGParser.PinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#pinName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinName(MainGParser.PinNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#pinNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinNumber(MainGParser.PinNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGParser#pinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinType(MainGParser.PinTypeContext ctx);
}