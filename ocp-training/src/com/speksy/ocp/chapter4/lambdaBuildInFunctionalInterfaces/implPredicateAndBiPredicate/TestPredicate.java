package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implPredicateAndBiPredicate;

import java.util.function.Predicate;

/*
@FunctionalInterface public interface Predicate<T> {
    boolean test(T t);
}
* */
public class TestPredicate {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        // Default methods on function interfaces - real world scenario
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        // Better way to make this

        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());

    }
}
