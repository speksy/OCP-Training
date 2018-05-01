package com.speksy.ocp.chapter1.reviewQuestions._9;
/*
    9. What is the result of the following code?

    A. x is 0.
    B. x is 24.
    C. Line 6 generates a compiler error.
    D. Line 8 generates a compiler error.
    E. Line 11 generates a compiler error.
    F. An exception is thrown.

    Result: B. x is 24.

    B. Outer.this.x is the correct way to refer to x in the Outer class. In Java 7, the answer
    would have been D because you used to have to declare variables as final to use them in a
    local inner class. In Java 8, this requirement was dropped and the variables only need to be
    effectively final, which means that the code would still compile if final were added.
* */
public class Outer {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;
            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }
    public static void main(String args[]) {
        new Outer().getX();
    }
}
