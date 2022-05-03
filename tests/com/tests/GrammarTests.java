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
    public void TypoProcTest () {
        String badKeywordName = setUpLoop + " prog fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            compile(badKeywordName);
        });
    }

    @Test
    public void OperandTest () {
        String OperandTest = setUpLoop + " proc fun1() {if (var > 1){} else{}}";

        Assertions.assertThrows(NotDeclared.class, () -> {
            compile(OperandTest);
        });
    }
    

    @Test
    public void NegativeTest () {
        String programWithNegative = setUpLoop + " proc fun1() {proc fun2() {if (1 > ~1){} else{}}}";

        Assertions.assertDoesNotThrow(() -> {
            compile(programWithNegative);
        });
    }

    @Test
    public void DeclarationInScopesTest () {
        String decTest = setUpLoop + " proc fun11() { proc fun12(){ proc fun13(){ Num var1;} proc fun14(){ Num var1;}}}";

        Assertions.assertDoesNotThrow(() -> {
            compile(decTest);
        });
    }

    @Test
    public void WhileLoopTest () {
        String whileTest = setUpLoop + "proc fun() { Num i = 0; while (i < 3){ i = i + 1;}}";

        Assertions.assertDoesNotThrow(() -> {
            compile(whileTest);
        });
    }

    @Test
    public void NoSetupAndLoopTest () {
        String noSetupAndLoopTest = "proc fun1() {proc  fun12() {}} proc  fun11() {}";

        Assertions.assertThrows(SyntaxException.class, () -> {
            compile(noSetupAndLoopTest);
        });
    }

    @Test
    public void BoolTest () {
        String boolInput = setUpLoop + "func Bool fun1() {Num x = 4; if (x > 5){return false;} else {return true;}}";

        Assertions.assertDoesNotThrow(() -> {
            compile(boolInput);
        });
    }

    @Test
    public void PinSyntaxTest () {
        String pinSyntaxTest = setUpLoop + "Pin DigitalTestPin {D4,out}; proc fun1() {}";

        Assertions.assertDoesNotThrow(() -> {
            compile(pinSyntaxTest);
        });
    }

    @Test
    public void PinSyntaxFailTest () {
        String pinSyntaxFailTest = setUpLoop + "Pin DigitalTestPin {OUT,A4}; proc fun1() {proc  fun2() {}} proc fun11() {}";
        Assertions.assertThrows(SyntaxException.class,() -> {
            compile(pinSyntaxFailTest);
        });
    }

    @Test
    public void ReadFuncTest () {
        String ReadFuncTest = setUpLoop + "Pin DigitalTestPin {D4,in}; proc fun1() {DigitalTestPin.ReadDigital();}";
        Assertions.assertDoesNotThrow(() -> {
            compile(ReadFuncTest);
        });
    }

    @Test
    public void ReadFuncNotDeclaredTest () {
        String ReadNotDeclaredTest = setUpLoop + "Pin DigitalTestPin {D4,in}; proc fun1() {DoesNotExist.ReadDigital();}";
        Assertions.assertThrows(NotDeclared.class,() -> {
            compile(ReadNotDeclaredTest);
        });
    }

    @Test
    public void WriteFuncTest () {
        String writeTest = setUpLoop + "Pin DigitalTestPin {D4,out}; proc fun1() {DigitalTestPin.Write(HIGH);}";
        Assertions.assertDoesNotThrow(() -> {
            compile(writeTest);
        });
    }

    @Test
    public void WriteNotDeclaredTest () {
        String pinSyntaxFailTest = setUpLoop + "Pin DigitalTestPin {D4,out}; proc fun1() {DoesNotExist.Write(HIGH);}";
        Assertions.assertThrows(NotDeclared.class,() -> {
            compile(pinSyntaxFailTest);
        });
    }
}
