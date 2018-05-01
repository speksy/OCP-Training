package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implUnaryOperatorAndBinaryOperator;

import java.util.function.UnaryOperator;

/*
@FunctionalInterface public interface UnaryOperator<T>
extends Function<T, T> { }
* */
public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
    }
}
