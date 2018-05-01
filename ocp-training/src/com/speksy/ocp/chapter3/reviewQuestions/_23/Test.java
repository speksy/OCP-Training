package com.speksy.ocp.chapter3.reviewQuestions._23;
/*
    23. Which of the answer choices make sense to implement with a lambda?
    (Choose all that apply.)

    A. Comparable interface
    B. Comparator interface
    C. remove method on a Collection
    D. removeAll method on a Collection
    E. removeIf method on a Collection

    Result: B) E)

    B, E. Both Comparator and Comparable are functional interfaces. However, Comparable is
    intended to be used on the object being compared, making choice B correct. removeIf was
    added in Java 8 to allow specifying the lambda to check when removing elements, making
    choice E correct.
* */
public class Test {

}
