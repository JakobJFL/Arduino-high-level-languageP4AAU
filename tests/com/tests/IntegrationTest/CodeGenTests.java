package com.tests.IntegrationTest;

import com.compiler.Exceptions.AlreadyDeclared;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static com.compiler.Main.compile;

public class CodeGenTests {
    private static String setUpLoop = " proc setup() {} proc loop() {}";

    @Test
    public void Test() {
        String alreadyDeclaredWords = setUpLoop + " proc fun1() {proc  fun1() {}} proc  fun11() {}";

        Assert.assertTrue(true);
    }
}
