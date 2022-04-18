// Generated from C:/Users/JFL/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HlmpParser}.
 */
public interface HlmpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HlmpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HlmpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HlmpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HlmpParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HlmpParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(HlmpParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(HlmpParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(HlmpParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(HlmpParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(HlmpParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(HlmpParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(HlmpParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(HlmpParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HlmpParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HlmpParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HlmpParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HlmpParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HlmpParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HlmpParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(HlmpParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(HlmpParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HlmpParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HlmpParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(HlmpParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(HlmpParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#sInt}.
	 * @param ctx the parse tree
	 */
	void enterSInt(HlmpParser.SIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#sInt}.
	 * @param ctx the parse tree
	 */
	void exitSInt(HlmpParser.SIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(HlmpParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(HlmpParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(HlmpParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(HlmpParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFunc(HlmpParser.ReadFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFunc(HlmpParser.ReadFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPinLiteral(HlmpParser.PinLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPinLiteral(HlmpParser.PinLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HlmpParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HlmpParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(HlmpParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(HlmpParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(HlmpParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(HlmpParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HlmpParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HlmpParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HlmpParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HlmpParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void enterWriteFunc(HlmpParser.WriteFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void exitWriteFunc(HlmpParser.WriteFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(HlmpParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(HlmpParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(HlmpParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(HlmpParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(HlmpParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(HlmpParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(HlmpParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(HlmpParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void enterSetupDef(HlmpParser.SetupDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void exitSetupDef(HlmpParser.SetupDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void enterLoopDef(HlmpParser.LoopDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void exitLoopDef(HlmpParser.LoopDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HlmpParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HlmpParser.CommentContext ctx);
}