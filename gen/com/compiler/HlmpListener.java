// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/com/compiler\Hlmp.g4 by ANTLR 4.10.1
package com.compiler;
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
	 * Enter a parse tree produced by {@link HlmpParser#standardProc}.
	 * @param ctx the parse tree
	 */
	void enterStandardProc(HlmpParser.StandardProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#standardProc}.
	 * @param ctx the parse tree
	 */
	void exitStandardProc(HlmpParser.StandardProcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cntFuncProc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCntFuncProc(HlmpParser.CntFuncProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cntFuncProc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCntFuncProc(HlmpParser.CntFuncProcContext ctx);
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
	 * Enter a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
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
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDefinition}
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procDefinition}
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 */
	void enterProcDefinition(HlmpParser.ProcDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procDefinition}
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 */
	void exitProcDefinition(HlmpParser.ProcDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void enterFuncHead(HlmpParser.FuncHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#funcHead}.
	 * @param ctx the parse tree
	 */
	void exitFuncHead(HlmpParser.FuncHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#procHead}.
	 * @param ctx the parse tree
	 */
	void enterProcHead(HlmpParser.ProcHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#procHead}.
	 * @param ctx the parse tree
	 */
	void exitProcHead(HlmpParser.ProcHeadContext ctx);
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
	 * Enter a parse tree produced by {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HlmpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HlmpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bodyFuncProc}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyFuncProc(HlmpParser.BodyFuncProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyFuncProc}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyFuncProc(HlmpParser.BodyFuncProcContext ctx);
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
	 * Enter a parse tree produced by the {@code bodyReturn}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBodyReturn(HlmpParser.BodyReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bodyReturn}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBodyReturn(HlmpParser.BodyReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procBodyFuncProc}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void enterProcBodyFuncProc(HlmpParser.ProcBodyFuncProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procBodyFuncProc}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void exitProcBodyFuncProc(HlmpParser.ProcBodyFuncProcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procBodyStmt}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void enterProcBodyStmt(HlmpParser.ProcBodyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procBodyStmt}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void exitProcBodyStmt(HlmpParser.ProcBodyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procBodyComment}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void enterProcBodyComment(HlmpParser.ProcBodyCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procBodyComment}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 */
	void exitProcBodyComment(HlmpParser.ProcBodyCommentContext ctx);
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
	 * Enter a parse tree produced by the {@code stmtWhileWaitCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhileWaitCall(HlmpParser.StmtWhileWaitCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWhileWaitCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhileWaitCall(HlmpParser.StmtWhileWaitCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtWaitCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWaitCall(HlmpParser.StmtWaitCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtWaitCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWaitCall(HlmpParser.StmtWaitCallContext ctx);
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
	 * Enter a parse tree produced by the {@code varDeclarationAssign}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationAssign(HlmpParser.VarDeclarationAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationAssign}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationAssign(HlmpParser.VarDeclarationAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParenthesised}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesised(HlmpParser.ExprParenthesisedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParenthesised}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesised(HlmpParser.ExprParenthesisedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBinaryFloat}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBinaryFloat(HlmpParser.ExprBinaryFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBinaryFloat}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBinaryFloat(HlmpParser.ExprBinaryFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBinaryLog}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBinaryLog}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx);
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
	 * Enter a parse tree produced by the {@code exprBinaryBool}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBinaryBool}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx);
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
	 * Enter a parse tree produced by the {@code exprUnaryNeg}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryNeg(HlmpParser.ExprUnaryNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnaryNeg}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryNeg(HlmpParser.ExprUnaryNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBinaryBoolEqual}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBinaryBoolEqual(HlmpParser.ExprBinaryBoolEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBinaryBoolEqual}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBinaryBoolEqual(HlmpParser.ExprBinaryBoolEqualContext ctx);
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
	 * Enter a parse tree produced by the {@code operandSFloat}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperandSFloat(HlmpParser.OperandSFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operandSFloat}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperandSFloat(HlmpParser.OperandSFloatContext ctx);
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
	 * Enter a parse tree produced by the {@code whileWait}
	 * labeled alternative in {@link HlmpParser#whileWaitCall}.
	 * @param ctx the parse tree
	 */
	void enterWhileWait(HlmpParser.WhileWaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileWait}
	 * labeled alternative in {@link HlmpParser#whileWaitCall}.
	 * @param ctx the parse tree
	 */
	void exitWhileWait(HlmpParser.WhileWaitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wait}
	 * labeled alternative in {@link HlmpParser#waitCall}.
	 * @param ctx the parse tree
	 */
	void enterWait(HlmpParser.WaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wait}
	 * labeled alternative in {@link HlmpParser#waitCall}.
	 * @param ctx the parse tree
	 */
	void exitWait(HlmpParser.WaitContext ctx);
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
	 * Enter a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValueFloat(HlmpParser.ValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValueFloat(HlmpParser.ValueFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueId}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void enterValueId(HlmpParser.ValueIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueId}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 */
	void exitValueId(HlmpParser.ValueIdContext ctx);
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
	 * Enter a parse tree produced by the {@code elseStmtDef}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmtDef(HlmpParser.ElseStmtDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStmtDef}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmtDef(HlmpParser.ElseStmtDefContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HlmpParser#pinmode}.
	 * @param ctx the parse tree
	 */
	void enterPinmode(HlmpParser.PinmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#pinmode}.
	 * @param ctx the parse tree
	 */
	void exitPinmode(HlmpParser.PinmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(HlmpParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(HlmpParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlmpParser#sfloat}.
	 * @param ctx the parse tree
	 */
	void enterSfloat(HlmpParser.SfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlmpParser#sfloat}.
	 * @param ctx the parse tree
	 */
	void exitSfloat(HlmpParser.SfloatContext ctx);
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
}