// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/AHLLanguage/Grammars\Ahll.g4 by ANTLR 4.9.2
package AHLLanguage.Grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainGParser}.
 */
public interface MainGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainGParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainGParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainGParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(MainGParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(MainGParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MainGParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MainGParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(MainGParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(MainGParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MainGParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MainGParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MainGParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MainGParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MainGParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MainGParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MainGParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MainGParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MainGParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MainGParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MainGParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MainGParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MainGParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MainGParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(MainGParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(MainGParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MainGParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MainGParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(MainGParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(MainGParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MainGParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MainGParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MainGParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MainGParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MainGParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MainGParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPinLiteral(MainGParser.PinLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPinLiteral(MainGParser.PinLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#pinName}.
	 * @param ctx the parse tree
	 */
	void enterPinName(MainGParser.PinNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#pinName}.
	 * @param ctx the parse tree
	 */
	void exitPinName(MainGParser.PinNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#pinNumber}.
	 * @param ctx the parse tree
	 */
	void enterPinNumber(MainGParser.PinNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#pinNumber}.
	 * @param ctx the parse tree
	 */
	void exitPinNumber(MainGParser.PinNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGParser#pinType}.
	 * @param ctx the parse tree
	 */
	void enterPinType(MainGParser.PinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGParser#pinType}.
	 * @param ctx the parse tree
	 */
	void exitPinType(MainGParser.PinTypeContext ctx);
}