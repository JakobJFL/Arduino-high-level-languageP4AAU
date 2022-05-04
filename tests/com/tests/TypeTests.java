package com.tests;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.TypeException;
import com.compiler.HlmpLexer;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.Scope;
import com.compiler.SymbolTbl.SymbolTblListener;
import com.compiler.TypeCheckerVisitor;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.compiler.Main.compile;
import static org.junit.Assert.assertTrue;

public class TypeTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = 3; Num var3; var3 = var1 + var2; }"
                            ," proc test() { Num var1 = 2; Num var2 = 3; Num var3; var3 = var1 + var2; }"})
    public void BinaryFloatComparison_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Bool var2 = false; Num var3; var3 = var1 + var2; }",
                            "proc test() { Num var1 = 2; Bool var2 = 3; Num var3; var3 = var1 - var2; }"})
    public void BinaryFloatComparison_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = 2; Bool var3 = var1 == var2; }",
                            "proc test() { Num var1 = 2; Num var2 = 3; Bool var3 = var1 != var2; }",
                            "proc test() { Bool var1 = true; Bool var3 = var1 == true; }",
                            "proc test() { Bool var1 = true; Bool var3 = var1 != false; }"})
    public void BinaryBoolEqualComparison_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = false; Bool var3 = var1 == var2; }",
                             "proc test() { Num var1 = 2; Num var2 = true; Bool var3 = var1 != var2; }"})
    public void BinaryBoolEqualComparison_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = 5; Bool var3 = var1 < var2; }",
                            "proc test() { Num var1 = 5; Num var2 = 2; Bool var3 = var1 > var2; }"})
    public void BinaryBoolComparison_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = 1; Num var3 = var1 > var2; }",
                            "proc test() { Num var1 = 2; Num var2 = 3; Num var3 = var1 > var2; }",
                            "proc test() { Num var1 = 2; Bool var2 = true; Bool var3 = var1 > var2; }",
                            "proc test() { Num var1 = 2; Num var2 = 3; Num var3 = var1 > var2; }"})
    public void BinaryBoolComparison_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Bool var1 = true; Bool var2 = true; Bool var3 = var1 && var2; }",
                            "proc test() { Bool var1 = true; Bool var2 = false; Bool var3 = var1 || var2; }"})
    public void BinaryLogComparison_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"proc test() { Bool var1 = true; Num var2 = 1; Bool var3 = var1 && var2; }",
                            "proc test() { Bool var1 = true; Bool var2 = true; Num var3 = var1 && var2; }",
                            "proc test() { Bool var1 = true; Num var2 = 1; Bool var3 = var1 || var2; }",
                            "proc test() { Bool var1 = true; Bool var2 = false; Num var3 = var1 || var2; }",
                            "proc test() { Num var1 = 3; Num var2 = 2; Bool var3 = var1 || var2; }",
                            "proc test() { Num var1 = 3; Num var2 = 2; Num var3 = var1 && var2; }",
                            "proc test() { Num var1 = 3; Num var2 = 2; Num var3 = var1 || var2; }"})
    public void BinaryLogComparison_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"func Num test() { Num var1 = 2; return var1; }",
                            "func Bool test() { Bool var1 = true; return var1; }",
                            "func Pwm test() { Pwm outputValue; return outputValue; }"})
    public void SameReturnTypes_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"func Num test() { Bool var1 = true; return var1; }",
            "func Bool test() { Num var1 = 2; return var1; }",
            "func Pwm test() { Num var1 = 5; return var1; }"})
    public void DifferentReturnTypes_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"func Num test(Num number) { Num var1 = number + 2; return var1; } Num var2 = test(2);"})
    public void Parameters_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(setUpLoop + testCode);
        });
    }

    @ParameterizedTest
    @ValueSource( strings = {"func Num test(Num number) { Num var1 = number + 2; return var1; } Bool var2 = test(true);"})
    public void Parameters_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(setUpLoop + testCode);
        });
    }

    /*
    @ParameterizedTest
    @ValueSource( strings = {"proc setup() {} proc loop() {} ; }",
            "proc setup() {} proc loop() {} ; }"})
    public void BinaryBoolEqualComparison_ShouldFail(String testCode) {
        Assertions.assertThrows(TypeException.class, () -> {
            compile(testCode);
        });
        */
}
