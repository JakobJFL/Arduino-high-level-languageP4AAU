import Contents.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ASTConverter extends AhllBaseVisitor<Node> {

    @Override
    public Node visitContent(AhllParser.ContentContext ctx) {
        Content con = new Content();
        for (ParseTree t: ctx.children) {
             Node child = t.accept(this);
             if (child instanceof VarDecl) {
                 con.addVarDecl((VarDecl) child);
             }
        }
        return con;
    }

    @Override
    public Node visitFuncDef(AhllParser.FuncDefContext ctx) {
        FuncDef def = new FuncDef();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if (child instanceof Head) {
                def.addHead((Head) child);
            }
            else if (child instanceof Body) {
                def.addBody((Body) child);
            }
        }
        return def;
    }

    @Override
    public Node visitHead(AhllParser.HeadContext ctx) {
        return super.visitHead(ctx);
    }

    @Override
    public Node visitParameters(AhllParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public Node visitParameter(AhllParser.ParameterContext ctx) {
        return super.visitParameter(ctx);
    }

    @Override
    public Node visitBody(AhllParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Node visitStmt(AhllParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Node visitVarDecl(AhllParser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Node visitOperandExpr(AhllParser.OperandExprContext ctx) {
        return super.visitOperandExpr(ctx);
    }

    @Override
    public Node visitReadFuncExpr(AhllParser.ReadFuncExprContext ctx) {
        return super.visitReadFuncExpr(ctx);
    }

    @Override
    public Node visitParensOpExpr(AhllParser.ParensOpExprContext ctx) {
        return super.visitParensOpExpr(ctx);
    }

    @Override
    public Node visitArrayExpr(AhllParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public Node visitOperand(AhllParser.OperandContext ctx) {
        return super.visitOperand(ctx);
    }

    @Override
    public Node visitOperator(AhllParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }

    @Override
    public Node visitReadFunc(AhllParser.ReadFuncContext ctx) {
        return super.visitReadFunc(ctx);
    }

    @Override
    public Node visitArrayStmt(AhllParser.ArrayStmtContext ctx) {
        return super.visitArrayStmt(ctx);
    }

    @Override
    public Node visitValue(AhllParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Node visitPinLiteral(AhllParser.PinLiteralContext ctx) {
        return super.visitPinLiteral(ctx);
    }

    @Override
    public Node visitArrayDef(AhllParser.ArrayDefContext ctx) {
        ArrayDef def = new ArrayDef();
        String inter = ctx.INT().getSymbol().getText();
        def.size = Integer.parseInt(inter);
        Node node = def;
        return node;
    }

    @Override
    public Node visitAssign(AhllParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public Node visitReturnExpr(AhllParser.ReturnExprContext ctx) {
        return super.visitReturnExpr(ctx);
    }

    @Override
    public Node visitFuncCall(AhllParser.FuncCallContext ctx) {
        return super.visitFuncCall(ctx);
    }

    @Override
    public Node visitCall(AhllParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    @Override
    public Node visitArgs(AhllParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Node visitWriteFunc(AhllParser.WriteFuncContext ctx) {
        return super.visitWriteFunc(ctx);
    }

    @Override
    public Node visitVal(AhllParser.ValContext ctx) {
        return super.visitVal(ctx);
    }

    @Override
    public Node visitIfStmt(AhllParser.IfStmtContext ctx) {
        return super.visitIfStmt(ctx);
    }

    @Override
    public Node visitElseStmt(AhllParser.ElseStmtContext ctx) {
        return super.visitElseStmt(ctx);
    }

    @Override
    public Node visitWhileExpr(AhllParser.WhileExprContext ctx) {
        return super.visitWhileExpr(ctx);
    }

    @Override
    public Node visitSetupDef(AhllParser.SetupDefContext ctx) {
        return super.visitSetupDef(ctx);
    }

    @Override
    public Node visitLoopDef(AhllParser.LoopDefContext ctx) {
        return super.visitLoopDef(ctx);
    }

    @Override
    public Node visitComment(AhllParser.CommentContext ctx) {
        return super.visitComment(ctx);
    }
}
