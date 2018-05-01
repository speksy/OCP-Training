package com.speksy.ocp.chapter3.reviewQuestions._14;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/*
    14. What is the result of the following program?

    A. [55. 88] [55, 88]
    B. [55. 88] [88, 55]
    C. [88. 55] [55, 88]
    D. [88. 55] [88, 55]
    E. The code does not compile.
    F. A runtime exception is thrown.

    Result: C. [88. 55] [55, 88]

    C. This question is hard because it defines both Comparable and Comparator on the same
    object. t1 doesn’t specify a Comparator so it uses the Comparable object’s compareTo()
    method. This sorts by the text instance variable. t2 did specify a Comparator when calling
    the constructor, so it uses the compare() method, which sorts by the int.
* */
public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    @Override
    public String toString() {
        return "" + num;
    }

    @Override
    public int compareTo(Sorted s) {
        return text.compareTo(s.text);
    }

    @Override
    public int compare(Sorted s1, Sorted s2) {
        return s1.num - s2.num;
    }

    public static void main(String[] args) {
        Sorted s1 = new Sorted(88,"a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);

        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }
}
