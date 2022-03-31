// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AhllParser}.
 */
public interface AhllListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AhllParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AhllParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AhllParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(AhllParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(AhllParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(AhllParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(AhllParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(AhllParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(AhllParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AhllParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AhllParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AhllParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AhllParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(AhllParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(AhllParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AhllParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AhllParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AhllParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AhllParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AhllParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AhllParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AhllParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AhllParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(AhllParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(AhllParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(AhllParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(AhllParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(AhllParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(AhllParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(AhllParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(AhllParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AhllParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AhllParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AhllParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AhllParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPinLiteral(AhllParser.PinLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPinLiteral(AhllParser.PinLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#pinName}.
	 * @param ctx the parse tree
	 */
	void enterPinName(AhllParser.PinNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#pinName}.
	 * @param ctx the parse tree
	 */
	void exitPinName(AhllParser.PinNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#pinNumber}.
	 * @param ctx the parse tree
	 */
	void enterPinNumber(AhllParser.PinNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#pinNumber}.
	 * @param ctx the parse tree
	 */
	void exitPinNumber(AhllParser.PinNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#pinType}.
	 * @param ctx the parse tree
	 */
	void enterPinType(AhllParser.PinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#pinType}.
	 * @param ctx the parse tree
	 */
	void exitPinType(AhllParser.PinTypeContext ctx);
}