package com.speksy.ocp.chapter1.reviewQuestions._16;
/*
    16. Which of the following can be inserted in main?

    A. Inner in = new Inner();
    B. Inner in = Outer.new Inner();
    C. Outer.Inner in = new Outer.Inner();
    D. Outer.Inner in = new Outer().Inner();
    E. Outer.Inner in = new Outer().new Inner();
    F. Outer.Inner in = Outer.new Inner();

    Result: E. Outer.Inner in = new Outer().new Inner();
*/
public class Outer {
    class Inner {}

    public static void main(String args[]) {
        Outer.Inner in = new Outer().new Inner();
    }
}
