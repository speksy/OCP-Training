package ocp._1.reviewQuestions._3;
/*
    3. What is the result of the following code?

    A. There is no output.
    B. s1 == s2
    C. s1.equals(s2)
    D. Both B and C.
    E. The code does not compile.
    F. The code throws a runtime exception.

    Result: C. s1.equals(s2) - strings are compared with equals not with ==. Both strings are the same as they point to the same string in the pool
*/
public class TestClass {
    public static void main(String args[]) {
        String s1 = "Canada";
        String s2 = new String(s1);
        if(s1 == s2) System.out.println("s1 == s2");
        if(s1.equals(s2)) System.out.println("s1.equals(s2)");
    }
}
