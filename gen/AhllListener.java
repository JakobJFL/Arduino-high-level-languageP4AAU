// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Ahll.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code OperandExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperandExpr(AhllParser.OperandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperandExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperandExpr(AhllParser.OperandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadFuncExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadFuncExpr(AhllParser.ReadFuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadFuncExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadFuncExpr(AhllParser.ReadFuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensOpExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensOpExpr(AhllParser.ParensOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensOpExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensOpExpr(AhllParser.ParensOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(AhllParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link AhllParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(AhllParser.ArrayExprContext ctx);
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
	 * Enter a parse tree produced by {@link AhllParser#sInt}.
	 * @param ctx the parse tree
	 */
	void enterSInt(AhllParser.SIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#sInt}.
	 * @param ctx the parse tree
	 */
	void exitSInt(AhllParser.SIntContext ctx);
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
	 * Enter a parse tree produced by {@link AhllParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFunc(AhllParser.ReadFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFunc(AhllParser.ReadFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#arrayStmt}.
	 * @param ctx the parse tree
	 */
	void enterArrayStmt(AhllParser.ArrayStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#arrayStmt}.
	 * @param ctx the parse tree
	 */
	void exitArrayStmt(AhllParser.ArrayStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AhllParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AhllParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link AhllParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void enterArrayDef(AhllParser.ArrayDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void exitArrayDef(AhllParser.ArrayDefContext ctx);
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
	 * Enter a parse tree produced by {@link AhllParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(AhllParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(AhllParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(AhllParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(AhllParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(AhllParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(AhllParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AhllParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AhllParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void enterWriteFunc(AhllParser.WriteFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void exitWriteFunc(AhllParser.WriteFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(AhllParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(AhllParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AhllParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AhllParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(AhllParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(AhllParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(AhllParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(AhllParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void enterSetupDef(AhllParser.SetupDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void exitSetupDef(AhllParser.SetupDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void enterLoopDef(AhllParser.LoopDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void exitLoopDef(AhllParser.LoopDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AhllParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(AhllParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AhllParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(AhllParser.CommentContext ctx);
}