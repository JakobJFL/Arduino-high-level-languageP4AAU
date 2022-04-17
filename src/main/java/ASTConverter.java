import Contents.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ASTConverter extends AhllBaseVisitor<Node> {

    @Override
    public Node visitContent(AhllParser.ContentContext ctx) {
        System.out.println("d");
        Content con = new Content();
        for (ParseTree t: ctx.children) {
             Node child = t.accept(this);
             // Det er klasserne der er lort - vi ved ikke noget om klasser
             if (child instanceof VarDecl) {
                 con.addVarDecl((VarDecl) child);
             }
             else if (child instanceof LoopDef) {
                con.setLoopDef((LoopDef) child);
             }
             else if (child instanceof SetupDef) {
                 con.setSetupDef((SetupDef) child);
             }
             else if (child instanceof FuncDef) {
                con.addFuncDefs((FuncDef) child);
             }
             else if (child instanceof Content) {
                 con.addContent((Content) child);
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
                def.setHead((Head) child);
            }
            else if (child instanceof Body) {
                def.setBody((Body) child);
            }
        }
        return def;
    }

    @Override
    public Node visitHead(AhllParser.HeadContext ctx) {
        Head head = new Head();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if (child instanceof Parameter) {
                head.addParameter((Parameter) child);
            }
        }
        return head;
    }

    @Override
    public Node visitParameter(AhllParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if(child instanceof Parameter) {
                parameter.setParameter((Parameter) child);
            }
        }
        return parameter;
    }

    @Override
    public Node visitBody(AhllParser.BodyContext ctx) {
        Body body = new Body();
        if (ctx.children == null)
            return null;
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if (child instanceof Stmt) {
                body.addStmt((Stmt) child);
            }
            else if (child instanceof FuncDef) {
                body.addFuncDef((FuncDef) child);
            }

        }
        return body;
    }

    @Override
    public Node visitStmt(AhllParser.StmtContext ctx) {
        Stmt stmt = new Stmt();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if (child instanceof IfStmt) {
                stmt.setIfStmt((IfStmt) child);
            }
            else if (child instanceof ReturnExpr) {
                stmt.setReturnExpr((ReturnExpr) child);
            }
            else if (child instanceof ReadFunc) {
                stmt.setReadFunc((ReadFunc) child);
            }
            else if (child instanceof WriteFunc) {
                stmt.setWriteFunc((WriteFunc) child);
            }
            else if (child instanceof FuncCall) {
                stmt.setFuncCall((FuncCall) child);
            }
            else if (child instanceof Assign) {
                stmt.setAssign((Assign) child);
            }
            else if (child instanceof VarDecl) {
                stmt.setVarDecl((VarDecl) child);
            }
            else if (child instanceof WhileExpr) {
                stmt.setWhileExpr((WhileExpr) child);
            }
        }
        return stmt;
    }

    @Override
    public Node visitVarDecl(AhllParser.VarDeclContext ctx) {
        VarDecl varDecl = new VarDecl();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Expr) {
                varDecl.setExpr((Expr) child);
            }
            else if (child instanceof PinLiteral) {
                varDecl.setPinLiteral((PinLiteral) child);
            }
            else if (child instanceof ArrayDef) {
                varDecl.setArrayDef((ArrayDef) child);
            }
        }
        return varDecl;
    }

    @Override
    public Node visitExpr(AhllParser.ExprContext ctx) {
        Expr expr = new Expr();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Operand) {
                expr.setOperand((Operand) child);
            }
            else if (child instanceof Operator) {
                expr.setOperator((Operator) child);
            }
            else if (child instanceof ReadFunc) {
                expr.setReadFunc((ReadFunc) child);
            }
            else if (child instanceof ArrayStmt) {
                expr.setArrayStmt((ArrayStmt) child);
            }
        }
        return expr;
    }

    @Override
    public Node visitOperand(AhllParser.OperandContext ctx) {
        Operand operand = new Operand();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof FuncCall) {
                operand.setFuncCall((FuncCall) child);
            }
            else if (child instanceof SInt) {
                operand.setSInt((SInt) child);
            }
            else if (child instanceof Id) {
                operand.setId((Id) child);
            }
            else if (child instanceof Bool) {
                operand.setBool((Bool) child);
            }
        }
        return operand;
    }

    @Override
    public Node visitSInt(AhllParser.SIntContext ctx) {
        /*
        if (ctx.children != null) {
            for (ParseTree t : ctx.children) {
                Node child = t.accept(this);
                try {
                    return new SInt(Integer.parseInt(child.toString()));
                } catch (NumberFormatException ex) {
                    return null;
                }
            }
        }
        */

        return null;
    }

    @Override
    public Node visitOperator(AhllParser.OperatorContext ctx) {
        Operator operator = new Operator();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Arithmetic) {
                operator.addArithmetic((Arithmetic) child);
            }
            else if (child instanceof SInt) {
                operator.addRelational((Relational) child);
            }
            else if (child instanceof Id) {
                operator.addLogical((Logical) child);
            }
        }
        return operator;
    }

    @Override
    public Node visitReadFunc(AhllParser.ReadFuncContext ctx) {
        ReadFunc readFunc = new ReadFunc();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof ReadPwm) {
                readFunc.setReadPwm((ReadPwm) child);
            }
            else if (child instanceof ReadAnalog) {
                readFunc.setReadAnalog((ReadAnalog) child);
            }
            else if (child instanceof ReadDigital) {
                readFunc.setReadDigital((ReadDigital) child);
            }
            else if (child instanceof Id) {
                readFunc.setId((Id) child);
            }
        }
        return readFunc;
    }

    @Override
    public Node visitArrayStmt(AhllParser.ArrayStmtContext ctx) {
        ArrayStmt arrayStmt = new ArrayStmt();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Value) {
                arrayStmt.setValue((Value) child);
            }
            else if (child instanceof Id) {
                arrayStmt.setId((Id) child);
            }

        }
        return arrayStmt;
    }

    @Override
    public Node visitValue(AhllParser.ValueContext ctx) {
        Value value = new Value();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof SInt) {
                value.setSInt((SInt) child);
            }
            else if (child instanceof Id) {
                value.setId((Id) child);
            }
        }
        return value;
    }

    @Override
    public Node visitPinLiteral(AhllParser.PinLiteralContext ctx) {
        ArrayStmt arrayStmt = new ArrayStmt();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Value) {
                arrayStmt.setValue((Value) child);
            }
            else if (child instanceof Id) {
                arrayStmt.setId((Id) child);
            }

        }
        return arrayStmt;
    }

    @Override
    public Node visitArrayDef(AhllParser.ArrayDefContext ctx) {
        ArrayDef arrayDef = new ArrayDef();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof SInt) {
                arrayDef.setSize((SInt) child);
            }
            else if (child instanceof Type) {
                arrayDef.setType((Type) child);
            }
            else if (child instanceof Id) {
                arrayDef.setId((Id) child);
            }

        }
        return arrayDef;
    }

    @Override
    public Node visitAssign(AhllParser.AssignContext ctx) {
        Assign assign = new Assign();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Expr) {
                assign.setExpr((Expr) child);
            }
            else if (child instanceof Id) {
                assign.setId((Id) child);
            }

        }
        return assign;

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
