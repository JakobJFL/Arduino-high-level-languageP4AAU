package com.compiler;

import com.compiler.HlmpParser.*;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.Tuple;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ArduinoGenVisitor extends HlmpBaseVisitor<String> {
    private SymbolTbl symbolTbl;

    public ArduinoGenVisitor(SymbolTbl symbolTbl) {
        this.symbolTbl = symbolTbl;
    }

    private String setupContent = "";
    private String globalContent = "";

    List<Tuple> refVars = new ArrayList<>();

    List<String> deRefVars = new ArrayList<>();

    private void addSetupContent(String str) {
        setupContent += str;
    }

    private void addGlobalContent(String str) {
        globalContent += str;
    }

    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate+nextResult;
    }

    @Override
    public String visitProgram(ProgramContext ctx) {
        String str = visit(ctx.loopDef());
        for (ContentContext c : ctx.content()) {
            str += visit(c);
        }
        str += visit(ctx.setupDef());
        str += globalContent;
        return str;
    }

    private void exitScope() {
        refVars = new ArrayList<>();
        if (deRefVars.size() > 0) {
            deRefVars.remove(deRefVars.size()-1);
        }
    }

    @Override
    public String visitFuncDefinition(FuncDefinitionContext ctx) {
        String result = visit(ctx.funcHead());
        result += visit(ctx.body());
        result += "}\n";
        exitScope();
        return result;
    }

    @Override
    public String visitProcDefinition(ProcDefinitionContext ctx) {
        String result = visit(ctx.procHead());
        result += visit(ctx.procBody());
        result += "}\n";
        exitScope();
        return result;
    }

    @Override
    public String visitFuncHead(FuncHeadContext ctx) {
        return makeFuncProcHead(ctx.type(), symbolTbl.idProperty.get(ctx), ctx.parameter());
    }

    @Override
    public String visitProcHead(ProcHeadContext ctx) {
        return makeFuncProcHead(null, symbolTbl.idProperty.get(ctx), ctx.parameter());
    }

    @Override
    public String visitIdentifier(IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitType(TypeContext ctx) {
        return switch (ctx.start.getType()) {
            case HlmpLexer.NUMTYPE -> "float ";
            case HlmpLexer.BOOLTYPE -> "bool ";
            case HlmpLexer.PWMTYPE -> "byte ";
            default -> defaultResult();
        };
    }

    @Override
    public String visitBodyFuncProc(BodyFuncProcContext ctx) {
        addGlobalContent(super.visitBodyFuncProc(ctx));
        return defaultResult();
    }

    @Override
    public String visitProcBodyFuncProc(ProcBodyFuncProcContext ctx) {
        addGlobalContent(super.visitProcBodyFuncProc(ctx));
        return defaultResult();
    }

    @Override
    public String visitStmtAssign(StmtAssignContext ctx) {
        String id = ctx.id().getText();
        return shouldDeRef(id) + id + "=" + visit(ctx.expr())+ ";";
    }

    @Override
    public String visitVarDeclaration(VarDeclarationContext ctx) {
        String type = visit(ctx.type());
        String id = visit(ctx.id());
        if (ctx.parent instanceof StmtVarDeclContext) {
           refVars.add(new Tuple(type, id));
        }
        return type + id + ";";
    }

    @Override
    public String visitVarDeclarationAssign(VarDeclarationAssignContext ctx) {
        String type = visit(ctx.type());
        String id = visit(ctx.id());
        if (ctx.parent instanceof StmtVarDeclContext) {
            refVars.add(new Tuple(type, id));
        }
        return type + id + "=" + visit(ctx.expr())+ ";";
    }

    @Override
    public String visitExprParenthesised(ExprParenthesisedContext ctx) {
        return "("+visit(ctx.expr())+")";
    }

    @Override
    public String visitExprBinaryFloat(ExprBinaryFloatContext ctx) {
        String operator = switch (ctx.op.getType()) {
            case HlmpLexer.PLUS -> "+";
            case HlmpLexer.MINUS -> "-";
            case HlmpLexer.MULT -> "*";
            case HlmpLexer.DIVIDE -> "/";
            case HlmpLexer.MODULU -> "%";
            default -> defaultResult();
        };

        return getVal(ctx.left) + operator + getVal(ctx.right);
    }

    private String getVal(ExprContext ctx) {
        String result = "";
        result += visit(ctx);
        return result;
    }

    @Override
    public String visitExprBinaryLog(ExprBinaryLogContext ctx) {
        String operator = switch (ctx.op.getType()) {
            case HlmpLexer.LOGAND -> "&&";
            case HlmpLexer.LOGOR -> "||";
            default -> "";
        };
        return visit(ctx.left) + operator + visit(ctx.right);
    }

    @Override
    public String visitExprOperand(ExprOperandContext ctx) {
        return shouldDeRef(ctx.getText()) + super.visitExprOperand(ctx);
    }

    private String shouldDeRef(String id) {
        if (deRefVars.contains(id)) {
            return "*";
        }
        return defaultResult();
    }

    @Override
    public String visitExprBinaryBool(ExprBinaryBoolContext ctx) {
        String operator = switch (ctx.op.getType()) {
            case HlmpLexer.LESSTHAN -> "<";
            case HlmpLexer.GREATERTHAN -> ">";
            default -> "";
        };
        return visit(ctx.left) + operator + visit(ctx.right);
    }

    @Override
    public String visitExprReadFunc(ExprReadFuncContext ctx) {
        return super.visitExprReadFunc(ctx);
    }

    @Override
    public String visitExprUnaryNeg(ExprUnaryNegContext ctx) {
        return "!" + visit(ctx.expr());
    }

    @Override
    public String visitExprBinaryBoolEqual(ExprBinaryBoolEqualContext ctx) {
        String operator = switch (ctx.op.getTokenIndex()) {
            case HlmpLexer.EQUAL -> "==";
            case HlmpLexer.NOTEQUAL -> "!=";
            default -> defaultResult();
        };
        return visit(ctx.left) + operator + visit(ctx.right);
    }

    @Override
    public String visitOperandSFloat(OperandSFloatContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperandBool(OperandBoolContext ctx) {
        String str = switch (ctx.bool().start.getType()) {
            case HlmpLexer.TRUE -> "true";
            case HlmpLexer.FALSE -> "false";
            default -> defaultResult();
        };
        return str;
    }

    @Override
    public String visitPinLiteralDef(PinLiteralDefContext ctx) {
        String pinmode = switch (ctx.pinmode().start.getType()) {
            case HlmpLexer.OUT -> "OUTPUT";
            case HlmpLexer.IN -> "INPUT";
            default -> defaultResult();
        };
        String pinNum = "";
        if (ctx.PINNUMBER().getText().charAt(0) == 'A') {
            pinNum += 'A';
        }
        pinNum += ctx.PINNUMBER().getText().substring(1);
        addSetupContent("pinMode(" + pinNum + "," + pinmode + ");");
        return "int " + ctx.id().getText() + " = " + pinNum + ";";
    }

    @Override
    public String visitReturnExpression(ReturnExpressionContext ctx) {
        return "return " + visit(ctx.expr()) + ";";
    }

    @Override
    public String visitWriteFuncDef(WriteFuncDefContext ctx) {
        return "analogWrite("+ctx.id().getText()+","+ visit(ctx.val()) +");";
    }

    @Override
    public String visitValue(ValueContext ctx) {
        String result = switch (ctx.start.getType()) {
            case HlmpLexer.TRUE -> "255";
            case HlmpLexer.FALSE -> "0";
            case HlmpLexer.SFLOAT -> ctx.getText();
            case HlmpLexer.TOGGLE -> "!digitalRead("+ ctx.parent.getChild(0).getText() +")";
            default -> defaultResult();
        };
        return result;
    }

    @Override
    public String visitValueId(ValueIdContext ctx) {
        return shouldDeRef(ctx.id().getText()) + super.visitValueId(ctx);
    }



    @Override
    public String visitReadFuncPWM(ReadFuncPWMContext ctx) {
        return "map(analogRead(" + ctx.id().getText() + "), 0, 1023, 0, 255)";
    }

    @Override
    public String visitReadFuncAnal(ReadFuncAnalContext ctx) {
        return "analogRead(" + ctx.id().getText() + ")";
    }

    @Override
    public String visitReadFuncDig(ReadFuncDigContext ctx) {
        String result = visit(ctx.id());
        result += ".ReadDigital()";
        return "digitalRead(" + ctx.id().getText() + ")";
    }

    @Override
    public String visitLoopDefinition(LoopDefinitionContext ctx) {
        String result = "void ";
        result += "loop";
        result += "() {";
        result += visit(ctx.procBody());
        result += "}\n";
        return result;
    }

    private String makeFuncProcHead(TypeContext typeCtx, String idCtx, List<ParameterContext> parameters) {
        String result = "void ";
        if (typeCtx != null) {
            result = visit(typeCtx);
        }
        result += idCtx;
        result += "(";
        if (refVars.size() > 0) {
            result += addWithPointer(0);
            deRefVars.add(refVars.get(0).id);
            for (int i = 1; i < refVars.size(); i++) {
                result += ", ";
                result += addWithPointer(i);
                deRefVars.add(refVars.get(i).id);
            }
        }
        result += addCommaSeparated(parameters);
        result += ") {";
        return result;
    }

    private String addWithPointer(int index) {
        String result = refVars.get(index).type;
        result += "*";
        result += refVars.get(index).id;
        return result;
    }

    private <T> String addCommaSeparated(List<T> list) {
        if (list.size() == 0) {
            return defaultResult();
        }
        String result = "";
        if (refVars.size() > 0) {
            result += ", ";
        }
        result += visit((ParseTree) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            result += ", ";
            result += visit((ParseTree) list.get(i));
        }
        return result;
    }

    @Override
    public String visitArguments(ArgumentsContext ctx) {
        String result = "";
        if (refVars.size() > 0) {
            result += "&" + refVars.get(0).id;
            for (int i = 1; i < refVars.size(); i++) {
                result += ", ";
                result += "&"+ refVars.get(i).id;
            }
        }
        result += addCommaSeparated(ctx.expr());
        return result;
    }

    @Override
    public String visitParam(ParamContext ctx) {
        String type = visit(ctx.type());
        String id = visit(ctx.id());
        refVars.add(new Tuple(type, id));
        return type + id;
    }

    @Override
    public String visitFunctionCall(FunctionCallContext ctx) {
        return symbolTbl.idProperty.get(ctx)+ "(" + visit(ctx.args()) + ");";
    }

    @Override
    public String visitSetupDefinition(SetupDefinitionContext ctx) {
        String result = "void ";
        result += "setup";
        result += "() {";
        result += setupContent;
        result += visit(ctx.procBody());
        result += "}\n";
        return result;
    }

    @Override
    public String visitIfStmtDef(IfStmtDefContext ctx) {
        String result = "if (";
        result += visit(ctx.expr());
        result += ") {";
        result += visit(ctx.body());
        result += "}";
        return result;
    }

    @Override
    public String visitElseStmtDef(ElseStmtDefContext ctx) {
        if (ctx.body() != null) {
            String result = "else {";
            result += visit(ctx.body());
            result += "}";
            return result;
        }
        return defaultResult();
    }

    @Override
    public String visitWhileExprDef(WhileExprDefContext ctx) {
        String result = "while (";
        result += visit(ctx.expr());
        result += ") {";
        result += visit(ctx.body());
        result += "}";
        return result;
    }
}