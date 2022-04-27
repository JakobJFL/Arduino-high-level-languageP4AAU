package com.tests;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.compiler.Exceptions.SyntaxException;

import static com.compiler.Main.compile;
import static com.compiler.Main.main;


public class GrammarTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @Test
    public void GrammarTestAlreadyDeclared() {
        String alreadyDeclaredWords = setUpLoop + " proc fun1() {proc  fun1() {}} proc  fun11() {}";

        Assertions.assertThrows(AlreadyDeclared.class, () -> {
            compile(alreadyDeclaredWords);
        });

    }

    @Test
    public void GrammarTestWideSpaces() {
        String wideSpaces = setUpLoop + " proc  fun1() \n \n \n\n \n {proc  fun2() {}} proc  fun11()\n\n\n\n {}";

        Assertions.assertDoesNotThrow(() -> {
            compile(wideSpaces);
        });
    }

    @Test
    public void SyntaxGrammarTest () {
        String badKeywordName = setUpLoop + " prog fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            compile(badKeywordName);
        });
    }

    @Test
    public void OperandTest () {
        String randomInputs = setUpLoop + " proc fun1() {if (var > 1){} else{}}";

        Assertions.assertThrows(NotDeclared.class, () -> {
            compile(randomInputs);
        });
    }
    

    @Test
    public void NegationTest () {
        String programWithNegation = setUpLoop + " proc fun1() {proc fun2() {if (1 > ~1){} else{}}}";

        Assertions.assertDoesNotThrow(() -> {
            compile(programWithNegation);
        });
    }

    /*@Test
    public void  () {
        String  = setUpLoop + " ";

        Assertions.assertThrows(.class, () -> {
            compile();
        });
    }*/
}
