package com.speksy.ocp.chapter3.reviewQuestions._3;

import java.util.ArrayList;
import java.util.List;

/*
    3. What is the result of the following statements?

    A. onetwo
    B. onetwo7
    C. onetwo followed by an exception
    D. Compiler error on line 6
    E. Compiler error on line 7

    Result: E)

    E. The code does not compile. It attempts to mix generics and legacy code. Lines 3 through
    7 create an ArrayList without generics. This means that we can put any objects in it.
    Line 7 should be looping through a list of Objects rather than Strings since we didn’t use
    generics.
* */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");

        list.add(7); // compile

//        for (String s :list) { // DOES NOT COMPILE
//            System.out.println(s);
//        }

//        for (Object s: list){ // This will compile instead
//            System.out.println(s);
//        }
    }
}
