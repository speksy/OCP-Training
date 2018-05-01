package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implFunctionAndBiFunction;

import java.util.function.Function;

/*
@FunctionalInterface public interface Function<T, R> {
    R apply(T t);
}
* */
public class TestFunction {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));
    }
}
