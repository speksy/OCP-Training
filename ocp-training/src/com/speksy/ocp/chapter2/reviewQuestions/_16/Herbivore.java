package com.speksy.ocp.chapter2.reviewQuestions._16;
/*
16. Choose the correct statement about the following code:

A. It compiles and runs without issue.
B. The code will not compile because of line 2.
C. The code will not compile because of line 3.
D. The code will not compile because of line 4.
E. The code will not compile because of lines 2 and 3.
F. The code will not compile because of lines 3 and 4.

Result: F)

* */
public interface Herbivore {
    int amount = 10;
    // static methods in interfaces should have body
//    public static void eatGrass();
    // public abstract methods cannot have body
//    public int chew(){
//        return 13;
//    }
}
