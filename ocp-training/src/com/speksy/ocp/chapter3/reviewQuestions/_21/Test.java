package com.speksy.ocp.chapter3.reviewQuestions._21;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    21. Fill in the blanks to make this code compile and print 123. (Choose all that apply.)

    4: List<String> list = Arrays.asList("1", "2", "3");
    5: Iterator iter = list.iterator();
    6: while(iter.__________())
    7: System.out.print(iter._________());

    A. On line 6, fill in the blank with hasNext().
    B. On line 6, fill in the blank with isNext().
    C. On line 6, fill in the blank with next().
    D. On line 7, fill in the blank with getNext().
    E. On line 7, fill in the blank with hasNext().
    F. On line 7, fill in the blank with next().

    Result: A) F)

    A, F. You have to memorize this. hasNext() returns a boolean, and it is used in the loop.
    next() returns the next element.
* */
public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}
