package com.speksy.ocp.chapter3.reviewQuestions._10;
/*

    10. What is the result of the following program?

    A. Abb aab 123
    B. aab Abb 123
    C. 123 Abb aab
    D. 123 aab Abb
    E. The code does not compile.
    F. A runtime exception is thrown.

    Result: A. Abb aab 123

    A. The array is sorted using MyComparator, which sorts the elements in reverse alphabetical
    order in a case-insensitive fashion. Normally, numbers sort before letters. This code
    reverses that by calling the compareTo() method on b instead of a.
* */
import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        // comparator is revesed and it will sort array reversed
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = {"123","Abb", "aab"};
        Arrays.sort(values, new MyComparator());
        for (String s: values) {
            System.out.print(s + " ");
        }
    }
}
