// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code cntFuncDef}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCntFuncDef(HlmpParser.CntFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cntFuncDef}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCntFuncDef(HlmpParser.CntFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardFunc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterStandardFunc(HlmpParser.StandardFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardFunc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitStandardFunc(HlmpParser.StandardFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cntvarDecl}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCntvarDecl(HlmpParser.CntvarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cntvarDecl}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCntvarDecl(HlmpParser.CntvarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cntComment}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCntComment(HlmpParser.CntCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cntComment}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCntComment(HlmpParser.CntCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDefinition}
	 * labeled alternative in {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDefinition}
	 * labeled alternative in {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
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
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HlmpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HlmpParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code params}
	 * labeled alternative in {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParams(HlmpParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code params}
	 * labeled alternative in {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParams(HlmpParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParam(HlmpParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParam(HlmpParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aType}
	 * labeled alternative in {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAType(HlmpParser.ATypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aType}
	 * labeled alternative in {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAType(HlmpParser.ATypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyStmt}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyStmt(HlmpParser.BodyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyStmt}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyStmt(HlmpParser.BodyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyFuncDef}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyFuncDef(HlmpParser.BodyFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyFuncDef}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyFuncDef(HlmpParser.BodyFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyComment}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyComment(HlmpParser.BodyCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyComment}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyComment(HlmpParser.BodyCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarDecl(HlmpParser.StmtVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarDecl(HlmpParser.StmtVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(HlmpParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(HlmpParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReturnExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturnExpr(HlmpParser.StmtReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReturnExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturnExpr(HlmpParser.StmtReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtFuncCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtFuncCall(HlmpParser.StmtFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtFuncCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtFuncCall(HlmpParser.StmtFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWriteFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWriteFunc(HlmpParser.StmtWriteFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWriteFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWriteFunc(HlmpParser.StmtWriteFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtReadFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtReadFunc(HlmpParser.StmtReadFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtReadFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtReadFunc(HlmpParser.StmtReadFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIfStmt(HlmpParser.StmtIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIfStmt(HlmpParser.StmtIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWhileExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhileExpr(HlmpParser.StmtWhileExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhileExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhileExpr(HlmpParser.StmtWhileExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(HlmpParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(HlmpParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclExpr}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclExpr(HlmpParser.VarDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclExpr}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclExpr(HlmpParser.VarDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOperand}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOperand(HlmpParser.ExprOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOperand}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOperand(HlmpParser.ExprOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprReadFunc}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReadFunc(HlmpParser.ExprReadFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprReadFunc}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReadFunc(HlmpParser.ExprReadFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandId}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandId(HlmpParser.OperandIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandId}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandId(HlmpParser.OperandIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandSInt}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandSInt(HlmpParser.OperandSIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandSInt}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandSInt(HlmpParser.OperandSIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandBool}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandBool(HlmpParser.OperandBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandBool}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandBool(HlmpParser.OperandBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operandFuncCall}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandFuncCall(HlmpParser.OperandFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandFuncCall}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandFuncCall(HlmpParser.OperandFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRelational}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOpRelational(HlmpParser.OpRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRelational}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOpRelational(HlmpParser.OpRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorArithmetic}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArithmetic(HlmpParser.OperatorArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorArithmetic}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArithmetic(HlmpParser.OperatorArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatorLog}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperatorLog(HlmpParser.OperatorLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorLog}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperatorLog(HlmpParser.OperatorLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readFuncPWM}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readFuncPWM}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readFuncAnal}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readFuncAnal}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readFuncDig}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFuncDig(HlmpParser.ReadFuncDigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readFuncDig}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFuncDig(HlmpParser.ReadFuncDigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pinLiteralDef}
	 * labeled alternative in {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPinLiteralDef(HlmpParser.PinLiteralDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pinLiteralDef}
	 * labeled alternative in {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(HlmpParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(HlmpParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(HlmpParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(HlmpParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HlmpParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HlmpParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fCall}
	 * labeled alternative in {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 */
	void enterFCall(HlmpParser.FCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fCall}
	 * labeled alternative in {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 */
	void exitFCall(HlmpParser.FCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HlmpParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HlmpParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeFuncDef}
	 * labeled alternative in {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void enterWriteFuncDef(HlmpParser.WriteFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeFuncDef}
	 * labeled alternative in {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 */
	void exitWriteFuncDef(HlmpParser.WriteFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code value}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValue(HlmpParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code value}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValue(HlmpParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtDef}
	 * labeled alternative in {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtDef(HlmpParser.IfStmtDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtDef}
	 * labeled alternative in {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtDef(HlmpParser.IfStmtDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseSTtmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseSTtmt(HlmpParser.ElseSTtmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseSTtmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseSTtmt(HlmpParser.ElseSTtmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseIfStmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmt(HlmpParser.ElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseIfStmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmt(HlmpParser.ElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileExprDef}
	 * labeled alternative in {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExprDef(HlmpParser.WhileExprDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileExprDef}
	 * labeled alternative in {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExprDef(HlmpParser.WhileExprDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setupDefinition}
	 * labeled alternative in {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void enterSetupDefinition(HlmpParser.SetupDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setupDefinition}
	 * labeled alternative in {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 */
	void exitSetupDefinition(HlmpParser.SetupDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopDefinition}
	 * labeled alternative in {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void enterLoopDefinition(HlmpParser.LoopDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopDefinition}
	 * labeled alternative in {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 */
	void exitLoopDefinition(HlmpParser.LoopDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentDel}
	 * labeled alternative in {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterCommentDel(HlmpParser.CommentDelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentDel}
	 * labeled alternative in {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitCommentDel(HlmpParser.CommentDelContext ctx);
}