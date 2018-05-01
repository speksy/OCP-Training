package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implUnaryOperatorAndBinaryOperator;

import java.util.function.BinaryOperator;

/*
@FunctionalInterface public interface BinaryOperator<T>
extends BiFunction<T, T, T> { }
* */
public class TestBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string,toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));
    }
}
