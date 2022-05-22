package com.tests.IntegrationTest;

import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.Exceptions.NotDeclared;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.compiler.Main.*;

public class DeclarationTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @Test
    public void AlreadyDeclared() {
        String alreadyDeclaredWords = " proc fun1() {proc  fun1() {}} proc  fun11() {}";

        Assertions.assertThrows(AlreadyDeclared.class, () -> {
            ParseTree tree = DoSyntax(setUpLoop + alreadyDeclaredWords);
            DoContextual(tree);
        });
    }

    @Test
    public void MissingOperand () {
        String MissingOperand = " proc fun1() {if (var > 1){} else{}}";

        Assertions.assertThrows(NotDeclared.class, () -> {
            ParseTree tree = DoSyntax(setUpLoop + MissingOperand);
            DoContextual(tree);
        });
    }

    @Test
    public void DeclarationInScopes () {
        String decTest = " proc fun11() { proc fun12(){ proc fun13(){ Num var1;} proc fun14(){ Num var1;}}}";

        Assertions.assertDoesNotThrow(() -> {
            ParseTree tree = DoSyntax(setUpLoop + decTest);
            DoContextual(tree);
        });
    }

    @Test
    public void ReadFuncNotDeclared () {
        String ReadNotDeclaredTest = "Pin DigitalTestPin {D4,in}; proc fun1() {DoesNotExist.ReadDigital();}";
        Assertions.assertThrows(NotDeclared.class,() -> {
            ParseTree tree = DoSyntax(setUpLoop + ReadNotDeclaredTest);
            DoContextual(tree);
        });
    }

    @Test
    public void WriteNotDeclared () {
        String pinSyntaxFailTest = "Pin DigitalTestPin {D4,out}; proc fun1() {DoesNotExist.Write(true);}";
        Assertions.assertThrows(NotDeclared.class,() -> {
            ParseTree tree = DoSyntax(setUpLoop + pinSyntaxFailTest);
            DoContextual(tree);
        });
    }

}
