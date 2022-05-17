package com.tests.IntegrationTest;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.compiler.Exceptions.SyntaxException;

import static com.compiler.Main.*;
import static com.compiler.Main.DoContextual;


public class GrammarTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @Test
    public void WideSpaces() {
        String wideSpaces = " proc  fun1() \n \n \n\n \n {proc  fun2() {}} proc  fun11()\n\n\n\n {}";

        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + wideSpaces);
            DoContextual(tree);
        });
    }

    @Test
    public void TypoProc () {
        String badKeywordName = " prog fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            ParseTree tree = DoSyntax(setUpLoop + badKeywordName);
            DoContextual(tree);
        });
    }

    @Test
    public void Negative () {
        String programWithNegative = " proc fun1() {proc fun2() {if (1 > ~1){} else{}}}";

        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + programWithNegative);
            DoContextual(tree);
        });
    }

    @Test
    public void WhileLoop () {
        String whileTest =  "proc fun() { Num i = 0; while (i < 3){ i = i + 1;}}";

        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + whileTest);
            DoContextual(tree);
        });
    }

    @Test
    public void NoSetupAndLoop () {
        String noSetupAndLoopTest = "proc fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            ParseTree tree = DoSyntax( noSetupAndLoopTest);
            DoContextual(tree);
        });
    }

    @Test
    public void PinSyntax () {
        String pinSyntaxTest = "Pin DigitalTestPin {D4,out}; proc fun1() {}";

        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + pinSyntaxTest);
            DoContextual(tree);
        });
    }

    @Test
    public void PinSyntaxFail () {
        String pinSyntaxFailTest = "Pin DigitalTestPin {OUT,A4}; proc fun1() {proc  fun2() {}} proc fun11() {}";

        Assertions.assertThrows(SyntaxException.class,() -> {
            ParseTree tree = DoSyntax(setUpLoop + pinSyntaxFailTest);
            DoContextual(tree);
        });
    }

    @Test
    public void ReadFunc () {
        String ReadFuncTest = "Pin DigitalTestPin {D4,in}; proc fun1() {DigitalTestPin.ReadDigital();}";
        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + ReadFuncTest);
            DoContextual(tree);
        });
    }

    @Test
    public void WriteFuncTest () {
        String writeTest = "Pin DigitalTestPin {D4,out}; proc fun1() {DigitalTestPin.Write(true);}";
        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + writeTest);
            DoContextual(tree);
        });
    }
}
