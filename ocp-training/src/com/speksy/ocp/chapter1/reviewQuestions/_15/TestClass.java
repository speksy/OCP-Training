package com.speksy.ocp.chapter1.reviewQuestions._15;
/*
    Which of the following statements are true about the equals() method? (Choose all that
    apply.)

    A. If equals(null) is called, the method should throw an exception.
    B. If equals(null) is called, the method should return false.
    C. If equals(null) is called, the method should return true.
    D. If equals() is passed the wrong type, the method should throw an exception.
    E. If equals() is passed the wrong type, the method should return false.
    F. If equals() is passed the wrong type, the method should return true.

    Results:
            B. If equals(null) is called, the method should return false.
            E. If equals() is passed the wrong type, the method should return false.

    B, E. equals() should return false when the object it passed in is not equal to the current
    object. This includes null and incorrect types. An equals() method should have a
    null check and an instanceof check.
* */
public class TestClass {

}
