package com.speksy.ocp.chapter3.reviewQuestions._9;

import java.util.HashMap;
import java.util.Map;

/*
    9. Which of the answer choices are valid given the following declaration?

    A. map.add("pi", 3.14159);
    B. map.add("e", 2L);
    C. map.add("log(1)", new Double(0.0));
    D. map.add('x', new Double(123.4));
    E. None of the above

    Result: E

    E. Trick question! The Map interface uses put() rather than add() to add elements to the
    map. If these examples used put(), the answer would be A and C. B is no good because a
    long cannot be shoved into a Double. D is no good because a char is not the same thing as
    a String.

* */
public class Test {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
//        map.add("pi", 3.14159);
//        map.add("e", 2L);
//        map.add("log(1)", new Double(0.0));
//        map.put('x', new Double(123.4));
    }
}
