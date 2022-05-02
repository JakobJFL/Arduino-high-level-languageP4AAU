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
    @ValueSource( strings = {"proc test() { Num var1 = 2; Num var2 = 3; Num var3; var3 = var1 + var2; }",
                                "proc test() { Num var1 = 2; Num var2 = 3; Num var3; var3 = var1 - var2; }"})
    public void BinaryFloatComparison_ShouldPass(String testCode) {
        Assertions.assertDoesNotThrow(() -> {
            compile(testCode);
        });
    }
}
