package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.checkingFunctionalInterfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CheckThese {
    public static void main(String[] args) {

        /*
        ■■ Returns a String without taking any parameters - Supplier
        ■■ Returns a Boolean and takes a String - Function
        ■■ Returns an Integer and takes two Integers - BinaryOperator (or BiFunction)
        */
        /*
        6: _____<List> ex1 = x -> "".equals(x.get(0));
        7: _____<Long> ex2 = (Long l) -> System.out.println(l);
        8: _____ <String, String> ex3 = (s1, s2) -> false;
        */

        Predicate<List> ex1 = x -> "".equals(x.get(0));
        Consumer<Long> ex2 = (Long l) -> System.out.println(l);
        BiPredicate<String, String> ex3 = (s1, s2) -> false;

//        6: Function<List<String>> ex1 = x -> x.get(0); // DOES NOT COMPILE
//        7: UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT COMIPLE
//        8: Predicate ex4 = String::isEmpty; // DOES NOT COMPILE
    }
}
