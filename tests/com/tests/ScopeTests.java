package com.tests;

import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.SymbolTbl.Symbols.Symbol;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class ScopeTests {
    private static String setUpLoop = "proc setup() {} proc loop() {}";

    @Test
    public void getSymbolTest() {
        String testInput = setUpLoop + " proc fun11() {func Num fun21() {proc fun3() {}}func Num fun22() {}proc fun23() {proc fun41() {}proc fun42() {proc fun5() {}}}} func Pwm fun12() {}";
        CharStream stream = CharStreams.fromString(testInput);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

        List<String> test = new ArrayList<>();
        test.add("fun11");
        test.add("fun21");
        test.add("fun22");
        test.add("fun12");
        test.add("fun23");
        test.add("fun3");
        test.add("fun41");
        test.add("fun42");
        test.add("fun5");

        Scope scope = symbolTable.symbolTbl.globalScope;
        String result = getSymbolHelper(scope, test);
        Assertions.assertEquals(";fun11,fun12,;fun21,fun22,fun23,;fun3,;fun41,fun42,;fun5,", result);
    }

    private String getSymbolHelper(Scope scope, List<String> test) {
        String output = "";
        for (String key : test) {
            if (scope.getSymbol(key) != null) {
                output += scope.getSymbol(key).getId() + ",";
                System.out.println(scope.getSymbol(key).getId());
            }
            else
                System.out.println("n");
        }
        if (scope.getSubScopes() != null) {
            for (Scope s : scope.getSubScopes()) {
                System.out.println("new");

                output += ";" + getSymbolHelper(s, test);
            }
        }
        return output;
    }

    @Test
    public void varTest() {
        String testInput = setUpLoop + " Num var11 = 0;func Num fun11() {Num var21;proc fun21() {func Bool fun3() {}Num var3;}proc fun22() {}Num var22;proc fun23() {func Pwm fun41() {}proc fun42() {}}}func Num fun12() {}Num var12;";
        CharStream stream = CharStreams.fromString(testInput);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

        List<String> test = new ArrayList<>();
        test.add("var11");
        test.add("var12");
        test.add("var21");
        test.add("var22");
        test.add("var3");

        Scope scope = symbolTable.symbolTbl.globalScope;
        String result = getSymbolHelper(scope, test);
        System.out.println(result);
    }
}
