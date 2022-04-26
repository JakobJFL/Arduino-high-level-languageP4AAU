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
        String randomInputs = setUpLoop + " proc  fun1() {proc  fun1() {}} proc  fun11() {}";

        Assertions.assertThrows(AlreadyDeclared.class, () -> {
            compile(randomInputs);
        });
    }
    @Test
    public void GrammarTestWideSpaces() {
        String randomInputs = setUpLoop + " proc  fun1() \n \n \n\n \n {proc  fun1() {}} proc  fun11()\n\n\n\n {}";

        Assertions.assertDoesNotThrow(() -> {
            compile(randomInputs);
        });
    }
}