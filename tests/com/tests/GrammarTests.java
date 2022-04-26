package com.tests;

import com.compiler.Exceptions.AlreadyDeclared;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.compiler.Exceptions.SyntaxException;

import static com.compiler.Main.compile;
import static com.compiler.Main.main;


public class GrammarTests {
    private static String setUpLoop = "proc setup() {} proc loop() {}";
    @Test
    public void GrammarTestAlreadyDeclared() {
        String randomInputs = setUpLoop + " proc fun1() {proc  fun1() {}} proc  fun11() {}";

        Assertions.assertThrows(AlreadyDeclared.class, () -> {
            compile(randomInputs);
        });
    }
    @Test
    public void GrammarTestWideSpaces() {
        String randomInputs = setUpLoop + " proc  fun1() \n \n \n\n \n {proc  fun2() {}} proc  fun11()\n\n\n\n {}";

        Assertions.assertDoesNotThrow(() -> {
            compile(randomInputs);
        });
    }
    @Test
    public void SyntaxGrammarTest () {
        String randomInputs = setUpLoop + " prog fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            compile(randomInputs);
        });
    }
    @Test
    public void OperandTest () {
        String randomInputs = setUpLoop + "";

        Assertions.assertThrows(SyntaxException.class, () -> {
            compile(randomInputs);
        });
    }
}