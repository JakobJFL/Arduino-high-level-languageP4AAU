package com.tests.IntegrationTest;

import com.compiler.Contextual.Scope;
import com.compiler.Contextual.SymbolTblListener;
import com.compiler.Contextual.Symbols.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.compiler.Main.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ScopeTests {
    private static String setUpLoop = "proc setup() {} proc loop() {}";

    private static Stream<Arguments> varsInEachLocalScope() {
        return Stream.of(
                arguments("Num var00; proc fun10() { proc fun20(){} proc fun21(){} Num var10;}Num var01;",
                        "var00,var01|none|none|var10|none|none"),

                arguments("Num var00;Num var01;proc fun1() {proc fun2(){Pwm var20;}func Pwm fun3() { return 0; }func Pwm fun4() { Pwm retVar; return retVar; }Bool var10;proc fun5() {Num var50;}Num var11;}proc fun6() {Num var60;}",
                        "var00,var01|none|none|var10,var11|var20|none|none|var50|var60"),

                arguments("Num var00;proc fun1() {Num var10 = 5;proc fun2(){Num var20;proc fun3(){Num var30;}Num var21;proc fun4(){Num var40;proc fun5(){Num var50;}Num var41;}}Num var11;proc fun6() {Num var60;}}Num var01;",
                        "var00,var01|none|none|var10,var11|var20,var21|var30|var40,var41|var50|var60"),

                arguments("proc fun10() { Num var10; if (true) {Num var20;} }",
                        "none|none|none|var10|var20|none"),

                arguments("proc fun10() { Num var10; if (true) {Num var20;} else {Num var30;} }",
                        "none|none|none|var10|var20|var30"),

                arguments("proc fun10() { if (true) {Num var20;} else {Num var30;} }",
                        "none|none|none|none|var20|var30"),

                arguments("proc fun10() { Num var10; while (true) {Num var20;} }",
                        "none|none|none|var10|var20")
        );
    }

    @ParameterizedTest
    @MethodSource("varsInEachLocalScope")
    public void compile_testCodeAndExpected_varsInEachLocalScope(String testCode, String expected) {
        ParseTree tree = DoSyntax(setUpLoop + testCode);
        SymbolTblListener symbolTable = DoContextual(tree);
        List<String> test = new ArrayList<>();
        test.add("var00");
        test.add("var01");
        test.add("var10");
        test.add("var11");
        test.add("var20");
        test.add("var21");
        test.add("var30");
        test.add("var40");
        test.add("var41");
        test.add("var50");
        test.add("var60");
        Scope scope = symbolTable.symbolTbl.globalScope;
        String result = getSymbolsInScope(scope, test);
        assertEquals(expected,result);
    }

    private String getSymbolsInScope(Scope scope, List<String> symbolsKeys) {
        StringBuilder sb = new StringBuilder();
        String none = "none";
        for (String key : symbolsKeys) {
            Symbol symbol = scope.getThisSymbol(key);
            if (symbol != null) {
                none = "";
                sb.append(symbol.getId());
                sb.append(",");
            }
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length()-1);
        sb.append(none);
        if (scope.getSubScopes() != null) {
            for (Scope s : scope.getSubScopes()) {
                sb.append("|");
                sb.append(getSymbolsInScope(s, symbolsKeys));
            }
        }
        return sb.toString();
    }

    private static Stream<Arguments> varsAccessibleInEachScope() {
        return Stream.of(
                arguments("Num var00;  proc fun11() { proc fun12(){} proc fun13(){} Num var10;}Num var01;",
                        "var00,var01|var00,var01|var00,var01|var00,var01,var10|var00,var01,var10|var00,var01,var10"),

                arguments("Num var00;Num var01;proc fun1() {proc fun2(){Pwm var20;}func Pwm fun3() { return 0; }func Pwm fun4() { return 0; }Bool var10;proc fun5() {Num var50;}Num var11;}proc fun6() {Num var60;}",
                        "var00,var01|var00,var01|var00,var01|var00,var01,var10,var11|var00,var01,var10,var11,var20|var00,var01,var10,var11|var00,var01,var10,var11|var00,var01,var10,var11,var50|var00,var01,var60"),

                arguments("Num var00;proc fun1() {Num var10 = 5;proc fun2(){Num var20;proc fun3(){Num var30;}Num var21;proc fun4(){Num var40;proc fun5(){Num var50;}Num var41;}}Num var11;proc fun6() {Num var60;}}Num var01;",
                        "var00,var01|var00,var01|var00,var01|var00,var01,var10,var11|var00,var01,var10,var11,var20,var21|var00,var01,var10,var11,var20,var21,var30|var00,var01,var10,var11,var20,var21,var40,var41|var00,var01,var10,var11,var20,var21,var40,var41,var50|var00,var01,var10,var11,var60"),

                arguments("proc fun10() { Num var10; if (true) {Num var20;} }",
                        "none|none|none|var10|var10,var20|var10"),

                arguments("proc fun10() { Num var10; if (true) {Num var20;} else {Num var30;} }",
                        "none|none|none|var10|var10,var20|var10,var30"),

                arguments("proc fun10() { if (true) {Num var20;} else {Num var30;} }",
                        "none|none|none|none|var20|var30"),

                arguments("proc fun10() { Num var10; while (true) {Num var20;} }",
                        "none|none|none|var10|var10,var20")
        );
    }

    @ParameterizedTest
    @MethodSource("varsAccessibleInEachScope")
    public void compile_testCodeAndExpected_varsAccessibleInEachScope(String testCode, String expected) {
        ParseTree tree = DoSyntax(setUpLoop + testCode);
        SymbolTblListener symbolTable = DoContextual(tree);
        List<String> test = new ArrayList<>();
        test.add("var00");
        test.add("var01");
        test.add("var10");
        test.add("var11");
        test.add("var20");
        test.add("var21");
        test.add("var30");
        test.add("var40");
        test.add("var41");
        test.add("var50");
        test.add("var60");
        Scope scope = symbolTable.symbolTbl.globalScope;
        String result = getAccessibleSymbols(scope, symbolTable, test);
        assertEquals(expected, result);
    }

    private String getAccessibleSymbols(Scope scope, SymbolTblListener symbolTable, List<String> symbolsKeys) {
        symbolTable.symbolTbl.currentScope = scope;
        StringBuilder sb = new StringBuilder();
        String none = "none";
        for (String key : symbolsKeys) {
            Symbol symbol = symbolTable.symbolTbl.getSymbol(key);
            if (symbolTable.symbolTbl.getSymbol(key) != null) {
                none = "";
                sb.append(symbol.getId());
                sb.append(",");
            }
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length()-1);
        sb.append(none);
        if (scope.getSubScopes() != null) {
            for (Scope s : scope.getSubScopes()) {
                sb.append("|");
                sb.append(getAccessibleSymbols(s, symbolTable, symbolsKeys));
            }
        }
        return sb.toString();
    }
}
