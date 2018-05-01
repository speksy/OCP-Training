package com.speksy.ocp.chapter2.reviewQuestions._13;
/*
    13. Which of the following are properties of classes that define immutable objects? (Choose all
    that apply.)

    A. They don’t define any getter methods.
    B. All of the instance variables marked private and final.
    C. They don’t define any setter methods.
    D. They mark all instance variables static.
    E. They prevent methods from being overridden.
    F. All getter methods are marked synchronized.

    Results: B), C), E)

    B, C, E. Immutable objects may not be modified after creation. B, C, and E are correct
    statements that support this property. A is incorrect, as immutable objects may have getter
    methods, just not setter methods. D is incorrect, as static methods are not part of the
    immutable object pattern. F is also incorrect, as the getter methods are not required to be
    marked synchronized.
* */
public class Test {
}
