package com.tests;

import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.SymbolTblListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GrammarTests {
    @Test
    public void GrammarTestLoopSetupSwitch() {
        String grammarTest = " func loop() {} func setup() {}";
        String randomInputs = " func fun1() {func fun2() {}} func fun11() {}";

        CharStream stream = CharStreams.fromString(grammarTest+randomInputs);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        //SymbolTbl.SymbolTbl.Symbol table generation
        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

        Assertions.assertTrue(stream != null);
    }

    public void testWithNewLines() {
        String setupLoop = " func setup() \n\n\n\n {} func loop() {}" ;
        String randomInputs = " ";
        // String testInput = setUpLoop+" func fun1() {func fun2() {}} func fun11() {}";


        CharStream stream = CharStreams.fromString(setupLoop);
        HlmpLexer lexer = new HlmpLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HlmpParser parser = new HlmpParser(tokens);
        ParseTree tree = parser.program();

        //SymbolTbl.SymbolTbl.Symbol table generation
        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTblListener symbolTable = new SymbolTblListener();
        walker.walk(symbolTable, tree);

        Assertions.assertTrue(stream != null);
    }
}