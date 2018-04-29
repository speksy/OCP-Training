package com.speksy.ocp.chapter2.reviewQuestions._6;
/*
6. What is the result of the following class?
A. match
B. not match
C. Compiler error on line h1.
D. Compiler error on line h2.
E. Compile error on line h3.
F. A runtime exception is thrown.

Result: A). match
* */
import java.util.function.Predicate;

public class Panda {
    int age;
    public static void main(String[] args){
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5);
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}
