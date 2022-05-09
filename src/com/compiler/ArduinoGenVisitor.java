package com.compiler;

import com.compiler.HlmpParser.*;
import com.compiler.SymbolTbl.SymbolTbl;
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

    private List<String> scopeParameters = new ArrayList<>();

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

    @Override
    public String visitFuncDefinition(FuncDefinitionContext ctx) {
        String result = visit(ctx.funcHead());
        result += visit(ctx.body());
        result += "}\n";
        scopeParameters.remove(scopeParameters.size()-1);
        return result;
    }

    @Override
    public String visitProcDefinition(ProcDefinitionContext ctx) {
        String result = visit(ctx.procHead());
        result += visit(ctx.procBody());
        result += "}\n";
        scopeParameters.remove(scopeParameters.size()-1);
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
    public String visitParam(ParamContext ctx) {
        return visit(ctx.type()) + visit(ctx.id());
    }

    @Override
    public String visitType(TypeContext ctx) {
        return switch (ctx.start.getType()) {
            case HlmpLexer.NUMTYPE -> "float ";
            case HlmpLexer.BOOLTYPE -> "bool ";
            case HlmpLexer.PWMTYPE -> "byte ";
            default -> "";
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
    public String visitVarDeclaration(VarDeclarationContext ctx) {
        return visit(ctx.type()) + " " + symbolTbl.idProperty.get(ctx) + ";";
    }

    @Override
    public String visitVarDeclarationAssign(VarDeclarationAssignContext ctx) {
        return visit(ctx.type()) + symbolTbl.idProperty.get(ctx) + "=" + visit(ctx.expr())+ ";";
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
            default -> "";
        };
        return visit(ctx.left) + operator + visit(ctx.right);
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
            default -> "";
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
            default -> "";
        };
        return str;
    }

    @Override
    public String visitPinLiteralDef(PinLiteralDefContext ctx) {
        String pinmode = switch (ctx.pinmode().start.getType()) {
            case HlmpLexer.OUT -> "OUTPUT";
            case HlmpLexer.IN -> "INPUT";
            default -> "";
        };
        String pinNum = "";
        if (ctx.PINNUMBER().getText().charAt(0) == 'A') {
            pinNum += 'A';
        }
        pinNum += ctx.PINNUMBER().getText().substring(1);
        addSetupContent("pinMode(" + pinNum + "," + pinmode + ");");
        return "int " + symbolTbl.idProperty.get(ctx) + " = " + pinNum + ";";
    }

    @Override
    public String visitWriteFuncDef(WriteFuncDefContext ctx) {
        String result = symbolTbl.idProperty.get(ctx);
        result += "(";
        result += visit(ctx.val());
        result += ")";
        return result;
    }

    @Override
    public String visitReadFuncPWM(ReadFuncPWMContext ctx) {
        String result = symbolTbl.idProperty.get(ctx);
        result += ".ReadPwm()";
        return result;
    }

    @Override
    public String visitReadFuncAnal(ReadFuncAnalContext ctx) {
        String result = symbolTbl.idProperty.get(ctx);
        result += ".ReadAnalog()";
        return result;
    }

    @Override
    public String visitReadFuncDig(ReadFuncDigContext ctx) {
        String result = visit(ctx.id());
        result += ".ReadDigital()";
        return result;
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
        if (parameters.size() > 0) {
            for (ParameterContext p : parameters) {
                scopeParameters.add(visit(p));
            }
            result += scopeParameters.get(0);
            for (int i = 1; i < scopeParameters.size(); i++) {
                result += ", ";
                result += scopeParameters.get(i);
            }
        }
        result += ") {";

        return result;
    }

    @Override
    public String visitFunctionCall(FunctionCallContext ctx) {
        return symbolTbl.idProperty.get(ctx)+ "(" + visit(ctx.args()) + ");";
    }

    @Override
    public String visitArguments(ArgumentsContext ctx) {
        String result = "";
        if (ctx.expr().size() > 0) {
            result += visit(ctx.expr().get(0));
            for (int i = 1; i < ctx.expr().size(); i++) {
                result += ",";
                result += visit(ctx.expr().get(i));
            }
        }
        return result;
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
        String result = "else {";
        result += visit(ctx.body());
        result += "}";
        return result;
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