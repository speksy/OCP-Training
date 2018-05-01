package com.speksy.ocp.chapter2.reviewQuestions._14;
/*
    14. Which of the following statements can be inserted in the blank line so that the code will
    compile successfully? (Choose all that apply.)

    A. Frog
    B. TurtleFrog
    C. BrazilianHornedFrog
    D. CanHop
    E. Object
    F. Long

    Results: A) Frog,  B) TurtleFrog, D) CanHop, E) Object

    A, B, D, E. The blank can be filled with any class or interface that is a supertype of TurtleFrog.
    A is a superclass of TurtleFrog, and B is the same class, so both are correct.
    BrazilianHornedFrog is not a superclass of TurtleFrog, so C is incorrect. TurtleFrog
    inherits the CanHop interface, so D is correct. All classes inherit Object, so E is correct.
    Finally, Long is an unrelated class that is not a superclass of TurtleFrog, and it is therefore
    incorrect.
* */
public class Frog implements CanHop {
    public static void main(String[] args) {
//        _______________ frog = new TurtleFrog();
        Frog frog1 = new TurtleFrog();
        TurtleFrog frog2 = new TurtleFrog();
        CanHop frog3 = new TurtleFrog();
        Object frog4 = new TurtleFrog();
    }
}
