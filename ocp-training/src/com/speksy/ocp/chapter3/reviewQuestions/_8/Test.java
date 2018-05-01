package com.speksy.ocp.chapter3.reviewQuestions._8;

import java.util.TreeSet;

/*
    8. What is the result of the following code?

    A. On
    B. one
    C. One
    D. ONE
    E. The code does not compile.
    F. An exception is thrown.

    Result: C. One

    C. TreeSet sorts the elements. Since uppercase letters sort before lowercase letters, the
    ordering is "ONE", "One", "one". The ceiling() method returns the smallest element
    greater than the specified one. "On" appears between "ONE" and "One". Therefore, the
    smallest element that is larger than the specified value is "One".
* */
public class Test {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
