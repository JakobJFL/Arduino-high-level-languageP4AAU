package com.tests;

import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTblListener;
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
    private static String setUpLoop = "func setup() {} func loop() {}";
    @Test
    public void getSymbolTest() {
        String testInput = setUpLoop+" func fun11() {func fun21() {func fun3() {}}func fun22() {}func fun23() {func fun41() {}func fun42() {}}} func fun12() {}";
        CharStream stream = CharStreams.fromString(testInput);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        //SymbolTbl.SymbolTbl.Symbol table generation
        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);
        System.out.println("===============TEST======================");

        Scope scope = symbolTable.symbolTbl.globalScope;
        getSymbolTestHelper(scope);
        //Assertions.assertTrue(1==1);
    }

    private void getSymbolTestHelper(Scope scope) {
        List<String> test = new ArrayList<>();
        test.add("fun11");
        test.add("fun21");
        test.add("fun22");
        test.add("fun12");
        test.add("fun23");
        test.add("fun3");
        test.add("fun41");
        test.add("fun42");


        for (String key : test) {
            if (scope.getSymbol(key) != null)
                System.out.println(scope.getSymbol(key).getId());
        }
        if (scope.getSubScopes() != null) {
            for (Scope s : scope.getSubScopes()) {
                System.out.println("---New Scope---");
                getSymbolTestHelper(s);
            }
        }
    }
}
