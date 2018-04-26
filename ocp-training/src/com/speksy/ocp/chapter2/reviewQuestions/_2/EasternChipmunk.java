package com.speksy.ocp.chapter2.designPatternsAndPrincipals.reviewQuestions_2._2;
/*
    2. What is the result of the following code?

    A. It compiles and runs without issue.
    B. The code will not compile because of line 2.
    C. The code will not compile because of line 4.
    D. The code will not compile because of line 5.
    E. The code will not compile because of line 8.
    F. It compiles but throws an exception at runtime.

    Result: A. It compiles and runs without issue.
* */
public class EasternChipmunk extends Chipmunk {

    public void chew() {
        System.out.println("Eastern Chipmunk is Chewing");
    }
}
