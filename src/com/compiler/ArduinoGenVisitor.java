package com.compiler;

import com.compiler.HlmpParser.*;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTbl;
import com.compiler.SymbolTbl.Symbols.Symbol;
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
    private String topContent = "";


    List<Tuple> refVars = new ArrayList<>();

    List<String> deRefVars = new ArrayList<>();

    List<String> whileWaitsAdded = new ArrayList<>();

    private void addSetupContent(String str) {
        setupContent += str;
    }
    private void addTopContent(String str) {
        topContent += str;
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
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.standardProc().loopDef()));
        for (ContentContext c : ctx.content()) {
            sb.append(visit(c));
        }
        sb.append(visit(ctx.standardProc().setupDef()));
        sb.append(globalContent);
        sb.insert(0, topContent+"\n");
        return sb.toString();
    }

    private void exitScope() {
        refVars = new ArrayList<>();
        if (deRefVars.size() > 0) {
            deRefVars.remove(deRefVars.size()-1);
        }
    }

    @Override
    public String visitWhileWait(WhileWaitContext ctx) {
        String id = ctx.id().getText();
        if (!whileWaitsAdded.contains(id)) {
            String str = "bool "+symbolTbl.idProperty.get(ctx)+"WhileWait(int delayTime) {" +
                         "unsigned long startTime = millis();" +
                         "while (millis() < startTime+delayTime) {" +
                         "if (!"+symbolTbl.getSymbol(id).getUniqueId()+"()) {" +
                         "return true;}}return false;}";
            addGlobalContent(str);
            whileWaitsAdded.add(id);
        }
        return symbolTbl.idProperty.get(ctx)+"WhileWait(" + visit(ctx.expr()) + ");";
    }

    @Override
    public String visitWait(WaitContext ctx) {
        return "delay(" + visit(ctx.expr()) + ");";
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
        //System.out.println(symbolTbl.scopesProperty.get(ctx).);
        String result = visit(ctx.procHead());
        result += visit(ctx.procBody());
        result += "}\n";
        exitScope();
        return result;
    }

    @Override
    public String visitFuncHead(FuncHeadContext ctx) {
        Scope scope = symbolTbl.scopesProperty.get(ctx.parent);
        return makeFuncProcHead(ctx.type(), symbolTbl.idProperty.get(ctx), ctx.parameter(), scope);
    }

    @Override
    public String visitProcHead(ProcHeadContext ctx) {
        Scope scope = symbolTbl.scopesProperty.get(ctx.parent);
        return makeFuncProcHead(null, symbolTbl.idProperty.get(ctx), ctx.parameter(), scope);
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
    public String visitStmtFuncCall(StmtFuncCallContext ctx) {
        return super.visitStmtFuncCall(ctx) + ";";
    }

    @Override
    public String visitVarDeclaration(VarDeclarationContext ctx) {
        String type = visit(ctx.type());
        String id = visit(ctx.id());
        //refVars.add(new Tuple(type, id));
        return type + id + ";";
    }

    @Override
    public String visitVarDeclarationAssign(VarDeclarationAssignContext ctx) {
        String type = visit(ctx.type());
        String id = visit(ctx.id());
        //refVars.add(new Tuple(type, id));
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
        addTopContent("int " + ctx.id().getText() + " = " + pinNum + ";");
        return defaultResult();
    }

    @Override
    public String visitReturnExpression(ReturnExpressionContext ctx) {
        return "return " + visit(ctx.expr()) + ";";
    }

    @Override
    public String visitWriteFuncDef(WriteFuncDefContext ctx) {
        String result = switch (ctx.val().start.getType()) {
            case HlmpLexer.TRUE -> "digitalWrite("+ctx.id().getText()+","+ "HIGH" +");";
            case HlmpLexer.FALSE -> "digitalWrite("+ctx.id().getText()+","+ "LOW" +");";
            case HlmpLexer.SFLOAT -> "analogWrite("+ctx.id().getText()+","+ ctx.val().getText() +");";
            case HlmpLexer.TOGGLE -> "digitalWrite("+ctx.id().getText()+","+ "!digitalRead("+ ctx.id().getText() +"));";
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

    private String makeFuncProcHead(TypeContext typeCtx, String idCtx, List<ParameterContext> parameters, Scope scope) {
        String result = "void ";
        if (typeCtx != null) {
            result = visit(typeCtx);
        }
        refVars = new ArrayList<>();
        deRefVars = new ArrayList<>();
        symbolTbl.currentScope = scope;
        Symbol kat = symbolTbl.getSymbol("counter");
        if (kat != null) {
            Tuple tuple = new Tuple("byte " ,kat.getId());
            if (!refVars.contains(tuple))
                refVars.add(tuple);
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
        //refVars.add(new Tuple(type, id));
        return type + id;
    }

    @Override
    public String visitFunctionCall(FunctionCallContext ctx) {
        return symbolTbl.idProperty.get(ctx)+ "(" + visit(ctx.args()) + ")";
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