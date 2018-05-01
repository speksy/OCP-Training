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

    E. This is a member inner class. It needs to be created using an instance of the outer class.
    The syntax looks weird, but it creates an object of the outer class and then an object of the
    inner class from it.
*/
public class Outer {
    class Inner {}

    public static void main(String args[]) {
        Outer.Inner in = new Outer().new Inner();
    }
}
