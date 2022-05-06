package com.compiler;

import com.compiler.HlmpParser.*;

import java.util.List;

public class ArduinoGenVisitor extends HlmpBaseVisitor<String> {
    public ArduinoGenVisitor() {

    }

    private String setupContext = "";

    private void addSetupContext(String str) {
        setupContext += str;
    }
    @Override
    protected String defaultResult() {
        return "";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate+nextResult;
    }

    @Override // måske ikke noget der er nødving.
    public String visitProgram(ProgramContext ctx) {
        String str = visit(ctx.setupDef());
        str += visit(ctx.loopDef());
        for (ContentContext c : ctx.content()) {
            str += visit(c);
        }
        return str;
    }

    @Override
    public String visitFuncDefinition(FuncDefinitionContext ctx) {
        String result = visit(ctx.funcHead());
        result += visit(ctx.body());
        result += "}";
        return result;
    }

    @Override
    public String visitProcDefinition(ProcDefinitionContext ctx) {
        String result = visit(ctx.procHead());
        result += visit(ctx.procBody());
        result += "}";
        return result;
    }

    @Override
    public String visitFuncHead(FuncHeadContext ctx) {
        return makeFuncProcHead(ctx.type(), ctx.id(), ctx.parameter());
    }

    @Override
    public String visitProcHead(ProcHeadContext ctx) {
        return makeFuncProcHead(null, ctx.id(), ctx.parameter());
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
    public String visitVarDeclaration(VarDeclarationContext ctx) {
        return visit(ctx.type()) + " " + visit(ctx.id()) + ";";
    }

    @Override
    public String visitVarDeclarationAssign(VarDeclarationAssignContext ctx) {
        return visit(ctx.type()) + " " + visit(ctx.id()) + "=" + visit(ctx.expr()) + ";";
    }

    @Override
    public String visitPinLiteralDef(PinLiteralDefContext ctx) {
        String pinmode = switch (ctx.pinmode().getRuleIndex()) {
            case HlmpLexer.OUT -> "OUTPUT";
            case HlmpLexer.IN -> "INPUT";
            default -> "";
        };
        addSetupContext("pinMode(" + ctx.PINNUMBER() + "," + pinmode + ");");
        return "int " + visit(ctx.id()) + " = " + ctx.PINNUMBER() + ";";
    }

    @Override
    public String visitWriteFuncDef(WriteFuncDefContext ctx) {
        String result = visit(ctx.val());
        result += "(";
        result += ctx.val();
        result += ")";
        return result;
    }

    @Override
    public String visitLoopDefinition(LoopDefinitionContext ctx) {
        String result = "void ";
        result += "loop";
        result += "() {";
        result += visit(ctx.procBody());
        result += "}";
        return result;
    }

    private String makeFuncProcHead(TypeContext typeCtx, IdContext idCtx, List<ParameterContext> parameters) {
        String result = "void ";
        if (typeCtx != null) {
            result = visit(typeCtx);
        }
        result += visit(idCtx);
        result += "(";
        if (parameters.size() > 0) {
            result += visit(parameters.get(0));
            for (int i = 1; i < parameters.size(); i++) {
                result += ",";
                result += visit(parameters.get(i));
            }
        }
        result += ") {";

        return result;
    }

    @Override
    public String visitFunctionCall(FunctionCallContext ctx) {
        return ctx.id().getText() + "(" + visit(ctx.args()) + ")";
    }

    @Override
    public String visitSetupDefinition(SetupDefinitionContext ctx) {
        String result = "void ";
        result += "setup";
        result += "() {";
        result += visit(ctx.procBody());
        result += "}";
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
