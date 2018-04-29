package com.speksy.ocp.chapter2.reviewQuestions._20;
/*  20. Choose the correct statement about the following code:

    1: public interface CanFly {
    2: void fly();
    3: }
    4: interface HasWings {
    5: public abstract Object getWingSpan();
    6: }
    7: abstract class Falcon implements CanFly, HasWings {
    8: }

    A. It compiles without issue.
    B. The code will not compile because of line 2.
    C. The code will not compile because of line 4.
    D. The code will not compile because of line 5.
    E. The code will not compile because of lines 2 and 5.
    F. The code will not compile because the class Falcon doesn’t implement the interface
    methods.

    Result: A)
* */
abstract class Falcon implements CanFly, HasWings{
}
