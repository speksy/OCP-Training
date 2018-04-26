package ocp._2.reviewQuestions_2._12;
/*
12. What is the result of the following code?

A. ok
B. too high
C. Compiler error on line x1.
D. Compiler error on line x2.
E. Compiler error on a different line.
F. A runtime exception is thrown.

C) Compiler error on line x1.
* */
public class Climber {
    public static void main(String[] args) {
        // does not compile because of toString cannot be called on h
//        check((h,l) -> h.toString, 5); //x1
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    }
}
