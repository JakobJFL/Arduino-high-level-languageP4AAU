package com.compiler;

import com.compiler.HlmpParser.*;

import java.util.List;

public class ArduinoGenVisitor extends HlmpBaseVisitor<String> {
    public ArduinoGenVisitor() {

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
        return super.visitFuncDefinition(ctx);
    }

    @Override
    public String visitProcDefinition(ProcDefinitionContext ctx) {
        return super.visitProcDefinition(ctx);
    }

    @Override
    public String visitFuncHead(FuncHeadContext ctx) {
        makeFuncProcHead(ctx.type(), ctx.id(), ctx.parameter());
    }

    @Override
    public String visitProcHead(ProcHeadContext ctx) {
        makeFuncProcHead(null, ctx.id(), ctx.parameter());
    }

    private String makeFuncProcHead(TypeContext typeCtx, IdContext idCtx, List<ParameterContext> parameters) {
        String result = "void ";
        if (typeCtx != null) {
            result = visit(typeCtx) + " ";
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

}
