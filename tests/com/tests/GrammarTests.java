package com.tests;

import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.ThrowingErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.compiler.Exceptions.SyntaxException;


public class GrammarTests {
    @Test
    public void GrammarTestLoopSetupSwitch() {
        String grammarTest = " func loop {} func setup() {}";
        String randomInputs = " func fun1() {func fun2() {}} func fun11() {}";

        Assertions.assertThrows(ParseCancellationException.class, () -> {
            CharStream stream = CharStreams.fromString(grammarTest+randomInputs);
            HlmpLexer lexer = new HlmpLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            HlmpParser parser = new HlmpParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            ParseTree tree = parser.program();
        });
    }
}