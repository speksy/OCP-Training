package com.speksy.ocp.chapter1.reviewQuestions._5;
/*
    5. Which of the following statements are true, assuming a and b are String objects? (Choose
    all that apply.)

    A. If a.equals(b) is true, a.hashCode() == b.hashCode() is always true.
    B. If a.equals(b) is true, a.hashCode() == b.hashCode() is sometimes but not
        always true.
    C. If a.equals(b) is false, a.hashCode() == b.hashCode() can never be true.
    D. If a.equals(b) is false, a.hashCode() == b.hashCode() can sometimes be true.

    Result: A) ,D)

    A, D. The relevant rule is that two objects that return true for equals() objects must
    return the same hash code. Therefore A is correct and B is incorrect. Two objects with the
    same hash code may or may not be equal. This makes C incorrect and D correct. The fact
    that two objects are not equal does not guarantee or preclude them from sharing a hash
    code. Remember that hashCode() tells you which bucket to look in and equals() tells you
    whether you have found an exact match.
*/
public class TestClass {
    public static void main(String args[]) {
        // some code
    }
}
