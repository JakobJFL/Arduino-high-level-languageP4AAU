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
    public void getSymbolHelperTest() {
        String testInput = setUpLoop+" func fun1() {func fun2() {}} func fun11() {}";
        CharStream stream = CharStreams.fromString(testInput);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        //SymbolTbl.SymbolTbl.Symbol table generation
        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

        for (Scope scope : symbolTable.symbolTbl.globalScope.subScopes) {
            symbolTable.symbolTbl.currentScope = scope;
            System.out.println("New Scope" + scope);
            List<String> test = new ArrayList<>();
            test.add("fun1");
            test.add("fun11");
            test.add("fun2");

            for (String key : test) {
                if (scope.getSymbol(key) == null)
                    System.out.println("null");
                else {
                    System.out.println(scope.getSymbol(key).getId());
                }
            }
        }


        //Assertions.assertTrue(1==1);
    }
}
