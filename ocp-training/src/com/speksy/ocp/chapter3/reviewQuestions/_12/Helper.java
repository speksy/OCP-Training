package com.speksy.ocp.chapter3.reviewQuestions._12;

import com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.upperBoundedWildcards.B;
import com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.upperBoundedWildcards.C;

import java.io.FileNotFoundException;

/*
    12. Which of these statements can fill in the blank so that the Helper class compiles
    successfully? (Choose all that apply.)

    A. Helper.printException(new FileNotFoundException("A"));
    B. Helper.printException(new Exception("B"));
    C. Helper.<Throwable>printException(new Exception("C"));
    D. Helper.<NullPointerException>printException(new NullPointerException
    ("D"));
    E. Helper.printException(new Throwable("E"));

    Result: A), B), D)

    A, B, D. The generic type must be Exception or a subclass of Exception since this is an
    upper bound. C and E are wrong because Throwable is a superclass of Exception. D uses
    an odd syntax by explicitly listing the type, but you should be able to recognize it as acceptable.
* */
public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {

        // fill ____________________
        Helper.printException(new FileNotFoundException("A"));
        Helper.printException(new Exception("B"));
//        Helper.<Throwable>printException(new Exception("C"));
        Helper.<NullPointerException>printException(new NullPointerException
                ("D"));
//        Helper.printException(new Throwable("E"));
    }
}
