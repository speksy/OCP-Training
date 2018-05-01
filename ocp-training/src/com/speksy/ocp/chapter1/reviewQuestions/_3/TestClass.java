package com.speksy.ocp.chapter1.reviewQuestions._3;
/*
    3. What is the result of the following code?

    A. There is no output.
    B. s1 == s2
    C. s1.equals(s2)
    D. Both B and C.
    E. The code does not compile.
    F. The code throws a runtime exception.

    Result: C. s1.equals(s2) - strings are compared with equals not with ==. Both strings are the same as they point to the same string in the pool

    C. s1 points to the string pool. s2 points to an object on the heap, since it is created
    at runtime. == checks for reference equality. These are different references, making
    B incorrect. String overrides equals() so the actual values are the same, making C
    correct. And yes, this question could have appeared on the OCA. Remember that the
    OCP is cumulative. A question may appear to be about one thing and actually be about a
    simpler concept.
*/
public class TestClass {
    public static void main(String args[]) {
        String s1 = "Canada";
        String s2 = new String(s1);
        if(s1 == s2) System.out.println("s1 == s2");
        if(s1.equals(s2)) System.out.println("s1.equals(s2)");
    }
}
