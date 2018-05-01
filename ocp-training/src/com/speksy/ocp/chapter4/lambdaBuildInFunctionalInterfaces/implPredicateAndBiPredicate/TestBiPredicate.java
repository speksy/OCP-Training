package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implPredicateAndBiPredicate;

import java.util.function.BiPredicate;

/*
@FunctionalInterface public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
* */
public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
    }
}
