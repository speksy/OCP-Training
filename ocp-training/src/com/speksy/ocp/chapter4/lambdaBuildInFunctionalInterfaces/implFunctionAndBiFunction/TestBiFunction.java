package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implFunctionAndBiFunction;

import java.util.function.BiFunction;

/*
@FunctionalInterface public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
* */
public class TestBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));
    }
}
