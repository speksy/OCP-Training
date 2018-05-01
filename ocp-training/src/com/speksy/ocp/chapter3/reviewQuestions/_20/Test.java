package com.speksy.ocp.chapter3.reviewQuestions._20;

import java.util.HashMap;
import java.util.Map;

/*
    20. What is the result of the following code?

    A. false
    B. true
    C. Compiler error on line 4.
    D. Compiler error on line 5.
    E. Compiler error on line 7.
    F. A runtime exception is thrown.

    Result: E. Compiler error on line 7.

    E. This question looks like it is about generics, but it’s not. It is trying to see if
    you noticed that Map does not have a contains() method. It has containsKey() and
    containsValue() instead. If containsKey() was called, the answer would be false
    because the 123 in the list is an Integer rather than a String.
* */
public class Test {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(123,"456");
        m.put("abc","def");
//        System.out.println(m.contains("123")); // No contains method in Map api
    }
}
