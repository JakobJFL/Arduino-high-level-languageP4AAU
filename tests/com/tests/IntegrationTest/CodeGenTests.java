package com.tests.IntegrationTest;

import com.compiler.CodeGen.ArduinoGenVisitor;
import com.compiler.HlmpParser;
import com.compiler.Contextual.SymbolTblListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.compiler.Main.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CodeGenTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    private static Stream<Arguments> generatedCodeStrings() {
        return Stream.of(
                arguments("proc setup() {ledHandler();}proc loop() {}proc outer() {Num var2;}proc ledHandler() {Num var1 = 1;outer();inner();proc inner() {inner();}}",
                        "\n" + "void loop() {}\n" +
                        "void setup() {uid4();}\n" +
                        "void uid2() {float var2;}\n" +
                        "void uid6(float *var1) {uid6(var1);}\n" +
                        "void uid4() {float var1=1;uid2();uid6(&var1);}\n"),

                arguments("proc setup() {ledHandler();}proc loop() {}proc outer() {Num var1;outer2();proc outer2() {Num var2;}}\n" +
                            "proc ledHandler() {\tNum var1;outer();inner();proc inner() {Num var2;inner();proc inner2() {Num var3;ledHandler();}}}",
                        "\n" + "void loop() {}\n" +
                        "void setup() {uid6();}\n" +
                        "void uid4(float *var1) {float var2;}\n" +
                        "void uid2() {float var1;uid4(&var1);}\n" +
                        "void uid10(float *var2, float *var1) {float var3;uid6();}\n" +
                        "void uid8(float *var1) {float var2;uid8(var1);}\n" +
                        "void uid6() {float var1;uid2();uid8(&var1);}\n"),

                arguments("Pin led {D5,out};Pin sensor {A0,in};Pin tempSensor {A1,in};proc setup() {ledHandler();}proc loop() {}\n" +
                            "func Pwm sensorHandler() {return readSensor();func Pwm readSensor() {return tempSensor.ReadPwm();}}\n" +
                            "proc ledHandler() {Pwm counter = 0;checkSensor();proc checkSensor() {if (sensorHandler() > 40) {\n" +
                            "whileWait(1000, interrupt);blink();}if (sensorHandler() > 60) {whileWait(10, interrupt);fadeUp();}}proc blink() {led.Write(toggle);\n" +
                            "checkSensor();}proc fadeUp() {counter = counter + 1;led.Write(counter);checkSensor();}}\n" +
                            "func Bool interrupt() {Pwm outputValue = sensor.ReadPwm();if(outputValue > 128) {return false; } return true;}",
                        "int led = 5;int sensor = A0;int tempSensor = A1;\n" +
                        "void loop() {}\n" +
                        "void setup() {pinMode(5,OUTPUT);pinMode(A0,INPUT);pinMode(A1,INPUT);uid7();}\n" +
                        "byte uid6() {return map(analogRead(tempSensor), 0, 1023, 0, 255);}\n" +
                        "byte uid5() {return uid6();}\n" +
                        "bool uid16WhileWait(int delayTime) {unsigned long startTime = millis();while (millis() < startTime+delayTime) {if (!uid16()) {return true;}}return false;}void uid9(byte *counter) {if (uid5()>40) {uid16WhileWait(1000);uid14(counter);}if (uid5()>60) {uid16WhileWait(10);uid15(counter);}}\n" +
                        "void uid14(byte *counter) {digitalWrite(led,!digitalRead(led));uid9(counter);}\n" +
                        "void uid15(byte *counter) {*counter=*counter+1;analogWrite(led,*counter);uid9(counter);}\n" +
                        "void uid7() {byte counter=0;uid9(&counter);}\n" +
                        "bool uid16() {byte outputValue=map(analogRead(sensor), 0, 1023, 0, 255);if (outputValue>128) {return false;}return true;}\n"),

                arguments(setUpLoop + " proc func1() { func Num kat(Num kat1, Bool kat2) { kat2 = true; if(kat2) { return kat1 + 10; } return kat1; } } Bool var3 = true; Num var4 = 2;",
                        "\n" + "void loop() {}\n" +
                        "bool var3=true;float var4=2;void setup() {}\n" +
                        "float uid3(float kat1, bool kat2) {kat2=true;if (kat2) {return kat1+10;}return kat1;}\n" +
                        "void uid2() {}\n"),

                arguments(setUpLoop + " Num var1 = 2;",
                        "\nvoid loop() {}\nfloat var1=2;void setup() {}\n"),

                arguments(setUpLoop + " func Num func1(Num var1, Num var2) {return var1 + var2; } Num result = func1(2, 3);",
                        "\n" + "void loop() {}\n" +
                        "float result=uid2(2, 3);void setup() {}\n" +
                        "float uid2(float var1, float var2) {return var1+var2;}\n"),

                arguments(setUpLoop + " proc proc1(Num var1) { proc proc2(Num var2) { proc proc3(Num var3) {}}}",
                        "\n" + "void loop() {}\n" +
                        "void setup() {}\n" +
                        "void uid6(float *var2, float *var1, float var3) {}\n" +
                        "void uid4(float *var1, float var2) {}\n" +
                        "void uid2(float var1) {}\n"),

                arguments("Pin ledPin1 {D5,out};" + setUpLoop + " proc proc1() { ledPin1.Write(true); } ",
                        "int ledPin1 = 5;\n" +
                        "void loop() {}\n" +
                        "void setup() {pinMode(5,OUTPUT);}\n" +
                        "void uid3() {digitalWrite(ledPin1,HIGH);}\n"),

                arguments(setUpLoop +" proc outer(Num param4) {param4 = 5;}proc ledHandler(Num param1, Num param2) {" +
                            "proc inner(Num param3) {param1 = 0;param3 = 0;inner(5);outer(5);}}",
                        "\n" + "void loop() {}\n" +
                        "void setup() {}\n" +
                        "void uid2(float param4) {param4=5;}\n" +
                        "void uid7(float *param1, float *param2, float param3) {*param1=0;param3=0;uid7(param1, param2, 5);uid2(5);}\n" +
                        "void uid4(float param1, float param2) {}\n")
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
