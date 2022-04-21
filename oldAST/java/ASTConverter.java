import Contents.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTConverter extends AhllBaseVisitor<Node> {

    @Override
    public Node visitId(AhllParser.IdContext ctx) {
        Id id = new Id();
        for (ParseTree t: ctx.children) {
            Node child = t.accept(this);
            if (child instanceof Id) {
                id.setId((Id) child);
                System.out.println(child);
            }
        }
        return id;
    }

    @Override
    public Node visitParameters(AhllParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public Node visitContent(AhllParser.ContentContext ctx) {
        Content con = new Content();
        for (ParseTree t: ctx.children) {
             Node child = t.accept(this);
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
                 con.addContent((Content) (child));
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
            if(child instanceof Type) {
                parameter.setType((Type) child);
            }
            else if(child instanceof Id) {
                parameter.setId((Id) child);
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
    public Node visitRelational(AhllParser.RelationalContext ctx) {
        Relational relational = new Relational();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            switch (ctx.RELATIONAL()) {
                case AhllLexer.GREATERTHAN: relational.setStrVal((Relational) child);
                case AhllLexer.LESSTHAN:

                break;

            }
        }
        return relational;
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
        PinLiteral pinLiteral = new PinLiteral();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);
            if (child instanceof Id) {
                pinLiteral.setId((Id) child);
            }

        }
        return pinLiteral;
    }

    @Override
    public Node visitArrayDef(AhllParser.ArrayDefContext ctx) {
        ArrayDef arrayDef = new ArrayDef();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof int) {
                arrayDef.setSize((int) child);
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
        ReturnExpr returnExpr = new ReturnExpr();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Expr) {
                returnExpr.setExpr((Expr) child);
            }
        }
        return returnExpr;
    }

    @Override
    public Node visitFuncCall(AhllParser.FuncCallContext ctx) {
        FuncCall funcCall = new FuncCall();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof FuncCall) {
                funcCall.setFuncCall((FuncCall) child);
            }
            if (child instanceof Call) {
                funcCall.setCall((Call) child);
            }
        }
        return funcCall;
    }

    @Override
    public Node visitCall(AhllParser.CallContext ctx) {
        Call call = new Call();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Args) {
                call.setArgs((Args) child);
            }
        }
        return call;
    }

    @Override
    public Node visitArgs(AhllParser.ArgsContext ctx) {
        Args args = new Args();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Expr) {
                args.addExpr((Expr) child);
            }
        }
        return args;
    }

    @Override
    public Node visitWriteFunc(AhllParser.WriteFuncContext ctx) {
        WriteFunc writeFunc = new WriteFunc();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Val) {
                writeFunc.setVal((Val) child);
            }
        }
        return writeFunc;
    }

    @Override
    public Node visitVal(AhllParser.ValContext ctx) { // ik færdig
        Val val = new Val();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Id) {
                val.setId((Id) child);
            }
        }
        return val;
    }

    @Override
    public Node visitIfStmt(AhllParser.IfStmtContext ctx) {
        IfStmt ifStmt = new IfStmt();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Body) {
                ifStmt.setBody((Body) child);
            }
            else if (child instanceof ElseStmt) {
                ifStmt.setElseStmt((ElseStmt) child);
            }
        }
        return ifStmt;
    }

    @Override
    public Node visitElseStmt(AhllParser.ElseStmtContext ctx) {
        ElseStmt elseStmt = new ElseStmt();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Body) {
                elseStmt.setBody((Body) child);
            }
            else if (child instanceof IfStmt) {
                elseStmt.setIfStmt((IfStmt) child);
            }
        }
        return elseStmt;
    }

    @Override
    public Node visitWhileExpr(AhllParser.WhileExprContext ctx) {
        WhileExpr whileExpr = new WhileExpr();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Expr) {
                whileExpr.setExpr((Expr) child);
            }
            else if (child instanceof Body) {
                whileExpr.setBody((Body) child);
            }
        }
        return whileExpr;
    }

    @Override
    public Node visitSetupDef(AhllParser.SetupDefContext ctx) {
        SetupDef setupDef = new SetupDef();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Body) {
                setupDef.setBody((Body) child);
            }
        }
        return setupDef;
    }

    @Override
    public Node visitLoopDef(AhllParser.LoopDefContext ctx) {
        LoopDef loopDef = new LoopDef();
        for (ParseTree t : ctx.children) {
            Node child = t.accept(this);

            if (child instanceof Body) {
                loopDef.setBody((Body) child);
            }
        }
        return loopDef;
    }
}
