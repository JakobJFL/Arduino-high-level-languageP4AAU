import Contents.Content;
import Contents.Operand;
import Contents.SInt;

import static org.antlr.v4.parse.ANTLRLexer.INT;

public class AntlrToAhll extends AhllBaseVisitor<Content> {
    @Override
    public Content visitContent(AhllParser.ContentContext ctx) {
        return super.visitContent(ctx);
    }

    @Override
    public Content visitFuncDef(AhllParser.FuncDefContext ctx) {
        return super.visitFuncDef(ctx);
    }

    @Override
    public Content visitHead(AhllParser.HeadContext ctx) {
        return super.visitHead(ctx);
    }

    @Override
    public Content visitParameters(AhllParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public Content visitParameter(AhllParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Content visitBody(AhllParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Content visitStmt(AhllParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Content visitVarDecl(AhllParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Content visitOperandExpr(AhllParser.OperandExprContext ctx) {
        return super.visitOperandExpr(ctx);
    }

    @Override
    public Content visitReadFuncExpr(AhllParser.ReadFuncExprContext ctx) {
        return super.visitReadFuncExpr(ctx);
    }

    @Override
    public Content visitParensOpExpr(AhllParser.ParensOpExprContext ctx) {
        return super.visitParensOpExpr(ctx);
    }

    @Override
    public Content visitArrayExpr(AhllParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public Content visitOperand(AhllParser.OperandContext ctx) {
        String op = ctx.getChild(0).getText();
        int inter = Integer.parseInt(op);
        if (inter == INT)
            return new SInt(inter);
        return null;
    }

    @Override
    public Content visitOperator(AhllParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public Content visitReadFunc(AhllParser.ReadFuncContext ctx) {
        return super.visitReadFunc(ctx);
    }

    @Override
    public Content visitArrayStmt(AhllParser.ArrayStmtContext ctx) {
        return super.visitArrayStmt(ctx);
    }

    @Override
    public Content visitValue(AhllParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Content visitPinLiteral(AhllParser.PinLiteralContext ctx) {
        return super.visitPinLiteral(ctx);
    }

    @Override
    public Content visitArrayDef(AhllParser.ArrayDefContext ctx) {
        return super.visitArrayDef(ctx);
    }

    @Override
    public Content visitAssign(AhllParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public Content visitReturnExpr(AhllParser.ReturnExprContext ctx) {
        return super.visitReturnExpr(ctx);
    }

    @Override
    public Content visitFuncCall(AhllParser.FuncCallContext ctx) {
        return super.visitFuncCall(ctx);
    }

    @Override
    public Content visitCall(AhllParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    @Override
    public Content visitArgs(AhllParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Content visitWriteFunc(AhllParser.WriteFuncContext ctx) {
        return super.visitWriteFunc(ctx);
    }

    @Override
    public Content visitVal(AhllParser.ValContext ctx) {
        return super.visitVal(ctx);
    }

    @Override
    public Content visitIfStmt(AhllParser.IfStmtContext ctx) {
        return super.visitIfStmt(ctx);
    }

    @Override
    public Content visitElseStmt(AhllParser.ElseStmtContext ctx) {
        return super.visitElseStmt(ctx);
    }

    @Override
    public Content visitWhileExpr(AhllParser.WhileExprContext ctx) {
        return super.visitWhileExpr(ctx);
    }

    @Override
    public Content visitSetupDef(AhllParser.SetupDefContext ctx) {
        return super.visitSetupDef(ctx);
    }

    @Override
    public Content visitLoopDef(AhllParser.LoopDefContext ctx) {
        return super.visitLoopDef(ctx);
    }

    @Override
    public Content visitComment(AhllParser.CommentContext ctx) {
        return super.visitComment(ctx);
    }
}
