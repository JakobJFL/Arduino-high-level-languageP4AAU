// Generated from C:/Users/Jakob/Documents/GitHub/Arduino-high-level-languageP4AAU/src/com/compiler\Hlmp.g4 by ANTLR 4.10.1
package com.compiler;
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
	 * Visit a parse tree produced by the {@code cntFuncProc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntFuncProc(HlmpParser.CntFuncProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cntvarDecl}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntvarDecl(HlmpParser.CntvarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cntComment}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntComment(HlmpParser.CntCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDefinition}
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procDefinition}
	 * labeled alternative in {@link HlmpParser#funcProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDefinition(HlmpParser.ProcDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#funcHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncHead(HlmpParser.FuncHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#procHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcHead(HlmpParser.ProcHeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(HlmpParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HlmpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyFuncProc}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFuncProc(HlmpParser.BodyFuncProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyStmt}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyStmt(HlmpParser.BodyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyComment}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyComment(HlmpParser.BodyCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyReturn}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyReturn(HlmpParser.BodyReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procBodyFuncProc}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcBodyFuncProc(HlmpParser.ProcBodyFuncProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procBodyStmt}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcBodyStmt(HlmpParser.ProcBodyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procBodyComment}
	 * labeled alternative in {@link HlmpParser#procBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcBodyComment(HlmpParser.ProcBodyCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtVarDecl}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVarDecl(HlmpParser.StmtVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAssign}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(HlmpParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFuncCall}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFuncCall(HlmpParser.StmtFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWriteFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWriteFunc(HlmpParser.StmtWriteFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtReadFunc}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReadFunc(HlmpParser.StmtReadFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIfStmt}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIfStmt(HlmpParser.StmtIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhileExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhileExpr(HlmpParser.StmtWhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pinLiteralDef}
	 * labeled alternative in {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(HlmpParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclarationAssign}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationAssign(HlmpParser.VarDeclarationAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParenthesised}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesised(HlmpParser.ExprParenthesisedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBinaryFloat}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinaryFloat(HlmpParser.ExprBinaryFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBinaryLog}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinaryLog(HlmpParser.ExprBinaryLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOperand}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOperand(HlmpParser.ExprOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBinaryBool}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinaryBool(HlmpParser.ExprBinaryBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprReadFunc}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReadFunc(HlmpParser.ExprReadFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnaryNeg}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryNeg(HlmpParser.ExprUnaryNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBinaryBoolEqual}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinaryBoolEqual(HlmpParser.ExprBinaryBoolEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandId}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandId(HlmpParser.OperandIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandSFloat}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandSFloat(HlmpParser.OperandSFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandBool}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandBool(HlmpParser.OperandBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandFuncCall}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandFuncCall(HlmpParser.OperandFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readFuncPWM}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFuncPWM(HlmpParser.ReadFuncPWMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readFuncAnal}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFuncAnal(HlmpParser.ReadFuncAnalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readFuncDig}
	 * labeled alternative in {@link HlmpParser#readFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFuncDig(HlmpParser.ReadFuncDigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link HlmpParser#returnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(HlmpParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link HlmpParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HlmpParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arguments}
	 * labeled alternative in {@link HlmpParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(HlmpParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeFuncDef}
	 * labeled alternative in {@link HlmpParser#writeFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFuncDef(HlmpParser.WriteFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code value}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HlmpParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueId}
	 * labeled alternative in {@link HlmpParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueId(HlmpParser.ValueIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtDef}
	 * labeled alternative in {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtDef(HlmpParser.IfStmtDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStmtDef}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmtDef(HlmpParser.ElseStmtDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileExprDef}
	 * labeled alternative in {@link HlmpParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExprDef(HlmpParser.WhileExprDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setupDefinition}
	 * labeled alternative in {@link HlmpParser#setupDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupDefinition(HlmpParser.SetupDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopDefinition}
	 * labeled alternative in {@link HlmpParser#loopDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopDefinition(HlmpParser.LoopDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentDel}
	 * labeled alternative in {@link HlmpParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentDel(HlmpParser.CommentDelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#pinmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinmode(HlmpParser.PinmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HlmpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HlmpParser.IdentifierContext ctx);
}