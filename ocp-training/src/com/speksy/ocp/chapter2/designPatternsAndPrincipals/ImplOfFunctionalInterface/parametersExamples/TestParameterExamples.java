package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.parametersExamples;

import com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample.FIParam1_2;

public class TestParameterExamples {

    private static void test1(FIParam0 zeroParametersCaller) {
        zeroParametersCaller.test();
    }

    private static void test2(String a, FIParam1 zeroParametersCaller) {
        if (zeroParametersCaller.test(a))
            System.out.println(a);
    }

    private static void test3(int a, FIParam1_2 intParameterReturnNothing) {
        intParameterReturnNothing.test(a);
    }

    public static void main(String[] args) {

        // Param0 - example 1
        test1(() -> true);

        // Param 1 - example 2
        String match = "test";
        String noMatch = "notest";
        test2(match, a -> {
            return a.startsWith("test");
        });

        // Param1 - example 3
        test2(noMatch, (String a) -> a.startsWith("test"));

        // Param1 - example 4
        int num = 5;
        test3(num, (int x) -> {
        });

        // Param1 - example 5
        int num2 = 5;
        test3(num, (int y) -> {
            return;
        });
    }

}
