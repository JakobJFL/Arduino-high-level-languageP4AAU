package com.tests.IntegrationTest;

import com.compiler.ArduinoGenVisitor;
import com.compiler.Exceptions.AlreadyDeclared;
import com.compiler.HlmpParser;
import com.compiler.SymbolTbl.SymbolTblListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static com.compiler.Main.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CodeGenTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @Test
    public void Test() {
        String alreadyDeclaredWords = setUpLoop + " proc fun1() {proc  fun1() {}} proc  fun11() {}";

        Assert.assertTrue(true);
    }

    private static Stream<Arguments> generatedCodeStrings() {
        return Stream.of(
                arguments("proc setup() { } proc loop() { proc kat(Num kat1, Num kat2) { } kat(5, 4); }",
                        "\nvoid loop() {}\nvoid setup() {}\nvoid uid2(float kat1, float kat2) {}\nuid2(5, 4);"),

                arguments(setUpLoop + " proc func1() { func Num kat(Num kat1, Bool kat2) { kat2 = true; if(kat2) { return kat1 + 10; } return kat1; } } Bool var3 = true; Num var4 = 2;",
                        "\nvoid loop() {}\nvoid uid2() {}\nbool var3=true;float var4=2;void setup() {}\nfloat uid3(float kat1, bool kat2) {kat2=true;if (kat2) {return kat1+10;}return kat1;}\n"),

                arguments(setUpLoop + " Num var1 = 2;",
                        "\nvoid loop() {}\nfloat var1=2;void setup() {}\n"),

                arguments(setUpLoop + " func Num func1(Num var1, Num var2) {return var1 + var2; } Num result = func1(2, 3);",
                        "\nvoid loop() {}\nfloat uid2(float var1, float var2) {return var1+var2;}\nfloat result=uid2(2, 3);void setup() {}\n"),

                arguments(setUpLoop + " proc proc1(Num var1) { proc proc2(Num var2) { proc proc3(Num var3) {}}}",
                        "\nvoid loop() {}\nvoid uid2(float var1) {}\nvoid setup() {}\nvoid uid6(float *var1, float *var2, float var3) {}\nvoid uid4(float *var1, float var2) {}\n"),

                arguments("Pin ledPin1 {D5,out};" + setUpLoop + " proc proc1() { ledPin1.Write(true); } ",
                        "int ledPin1 = 5;\nvoid loop() {}\nvoid uid3() {digitalWrite(ledPin1,HIGH);}\nvoid setup() {pinMode(5,OUTPUT);}\n")

                /*arguments(setUpLoop + " proc proc1(Num var1) { func Num func1(Num var2) { return var2 + 3; } func1(var1+2);}",
                        "\nvoid loop() {}\nvoid uid2(float var1) {}\nvoid setup() {}\nfloat uid4(float *var1, float var2) {return var2+3;}\nuid4(&var1+2);")*/
        );
    }

    @ParameterizedTest
    @MethodSource("generatedCodeStrings")
    public void compile_GenerateCodeAsExpected_ShouldPass(String testCode, String expected) {
        ParseTree tree = DoSyntax(testCode);
        SymbolTblListener symbolTable = DoContextual(tree);
        ArduinoGenVisitor codeGen = new ArduinoGenVisitor(symbolTable.symbolTbl);
        String result = codeGen.visitProgram((HlmpParser.ProgramContext) tree);

        Assertions.assertEquals(expected, result);
    }
}
