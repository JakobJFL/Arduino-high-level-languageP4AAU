// Generated from C:/Users/kaspe/Documents/GitHub/Arduino-high-level-languageP4AAU/src/main/java\Hlmp.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by the {@code cntFuncDef}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntFuncDef(HlmpParser.CntFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardFunc}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardFunc(HlmpParser.StandardFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cntvarDecl}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntvarDecl(HlmpParser.CntvarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cntComment}
	 * labeled alternative in {@link HlmpParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCntComment(HlmpParser.CntCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDefinition}
	 * labeled alternative in {@link HlmpParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(HlmpParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlmpParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(HlmpParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link HlmpParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(HlmpParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code params}
	 * labeled alternative in {@link HlmpParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(HlmpParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link HlmpParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(HlmpParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aType}
	 * labeled alternative in {@link HlmpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAType(HlmpParser.ATypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyStmt}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyStmt(HlmpParser.BodyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyFuncDef}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFuncDef(HlmpParser.BodyFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bodyComment}
	 * labeled alternative in {@link HlmpParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyComment(HlmpParser.BodyCommentContext ctx);
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
	 * Visit a parse tree produced by the {@code stmtReturnExpr}
	 * labeled alternative in {@link HlmpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturnExpr(HlmpParser.StmtReturnExprContext ctx);
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
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(HlmpParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclPinLiteral}
	 * labeled alternative in {@link HlmpParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclPinLiteral(HlmpParser.VarDeclPinLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOperand}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOperand(HlmpParser.ExprOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprReadFunc}
	 * labeled alternative in {@link HlmpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReadFunc(HlmpParser.ExprReadFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandId}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandId(HlmpParser.OperandIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandSInt}
	 * labeled alternative in {@link HlmpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandSInt(HlmpParser.OperandSIntContext ctx);
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
	 * Visit a parse tree produced by the {@code opRelational}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRelational(HlmpParser.OpRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorArithmetic}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorArithmetic(HlmpParser.OperatorArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatorLog}
	 * labeled alternative in {@link HlmpParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorLog(HlmpParser.OperatorLogContext ctx);
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
	 * Visit a parse tree produced by the {@code pinLiteralDef}
	 * labeled alternative in {@link HlmpParser#pinLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPinLiteralDef(HlmpParser.PinLiteralDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HlmpParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(HlmpParser.AssignExprContext ctx);
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
	 * Visit a parse tree produced by the {@code fCall}
	 * labeled alternative in {@link HlmpParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCall(HlmpParser.FCallContext ctx);
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
	 * Visit a parse tree produced by the {@code ifStmtDef}
	 * labeled alternative in {@link HlmpParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtDef(HlmpParser.IfStmtDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseSTtmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSTtmt(HlmpParser.ElseSTtmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseIfStmt}
	 * labeled alternative in {@link HlmpParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(HlmpParser.ElseIfStmtContext ctx);
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
}