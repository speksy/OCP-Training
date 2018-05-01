package com.speksy.ocp.chapter3.reviewQuestions._11;
/*
    11. What is the result of the following code?

    A. 16
    B. 25
    C. Compiler error on line 3.
    D. Compiler error on line 5.
    E. Compiler error on line 7.
    F. A runtime exception is thrown.

    Result: A. 16

    A. Line 3 uses the diamond operator to create the map. Lines 5 and 7 use autoboxing to
    convert between the int primitive and the Integer wrapper class. The keys map to their
    squared value. 1 maps to 1, 2 maps to 4, 3 maps to 9, 4 maps to 16, and so on.
* */

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(10);
        for (int i = 1; i <= 10; i++) {
            map.put(i, i*i);
        }
        System.out.println(map.get(4));
    }
}
