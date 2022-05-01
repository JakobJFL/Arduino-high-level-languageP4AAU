package com.tests;

import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.SymbolTbl.Symbols.Symbol;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static com.compiler.Main.compile;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ScopeVarTests {
    private static String setUpLoop = "proc setup() {} proc loop() {}";

    private static Stream<Arguments> varsInEachLocalScope() {
        return Stream.of(
                arguments("Num var00; proc fun10() { proc fun20(){} proc fun21(){} Num var10;}Num var01;"
                        , "var00,var01|var10|none|none"),

                arguments("Num var00;Num var01;proc fun1() {proc fun2(){Pwm var20;}func Pwm fun3() {}func Pwm fun4() {}Bool var10;proc fun5() {Num var50;}Num var11;}proc fun6() {Num var60;}\n"
                        , "var00,var01|var10,var11|var20|none|none|var50|var60"),

                arguments("Num var00;proc fun1() {Num var10 = 5;proc fun2(){Num var20;proc fun3(){Num var30;}Num var21;proc fun4(){Num var40;proc fun5(){Num var50;}Num var41;}}Num var11;proc fun6() {Num var60;}}Num var01;",
                        "var00,var01|var10,var11|var20,var21|var30|var40,var41|var50|var60")
        );
    }

    @ParameterizedTest
    @MethodSource("varsInEachLocalScope")
    public void compile_testCodeAndExpected_varsInEachLocalScope(String testCode, String expected) {
        SymbolTblListener symbolTable = compile(setUpLoop + testCode);
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
        assertTrue(result.equals(expected));
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
                arguments("Num var00;  proc fun11() { proc fun12(){} proc fun13(){} Num var10;}Num var01;"
                        , "var00,var01|var00,var01,var10|var00,var01,var10|var00,var01,var10"),

                arguments("Num var00;Num var01;proc fun1() {proc fun2(){Pwm var20;}func Pwm fun3() {}func Pwm fun4() {}Bool var10;proc fun5() {Num var50;}Num var11;}proc fun6() {Num var60;}"
                        , "var00,var01|var00,var01,var10,var11|var00,var01,var10,var11,var20|var00,var01,var10,var11|var00,var01,var10,var11|var00,var01,var10,var11,var50|var00,var01,var60"),

                arguments("Num var00;proc fun1() {Num var10 = 5;proc fun2(){Num var20;proc fun3(){Num var30;}Num var21;proc fun4(){Num var40;proc fun5(){Num var50;}Num var41;}}Num var11;proc fun6() {Num var60;}}Num var01;",
                        "var00,var01|var00,var01,var10,var11|var00,var01,var10,var11,var20,var21|var00,var01,var10,var11,var20,var21,var30|var00,var01,var10,var11,var20,var21,var40,var41|var00,var01,var10,var11,var20,var21,var40,var41,var50|var00,var01,var10,var11,var60")
        );
    }

    @ParameterizedTest
    @MethodSource("varsAccessibleInEachScope")
    public void compile_testCodeAndExpected_varsAccessibleInEachScope(String testCode, String expected) {
        SymbolTblListener symbolTable = compile(setUpLoop + testCode);
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
        assertTrue(result.equals(expected));
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