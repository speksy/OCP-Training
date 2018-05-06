package com.speksy.ocp.chapter4.usingStreams.workingWithPrimitives.functionalInterfacesForPrimitives;

import java.util.function.BooleanSupplier;

public class Example {
    public static void main(String[] args) {
        // functional interfaces for boolean
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > 0.5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());

        // functional interfaces for double int long

    }
}
