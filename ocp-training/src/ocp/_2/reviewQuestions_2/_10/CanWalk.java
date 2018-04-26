package ocp._2.reviewQuestions_2._10;
/*
10. What is the result of the following code?

1: public interface CanWalk {
2: default void walk() { System.out.println("Walking"); }
3: }
4: public interface CanRun {
5: public default void walk() { System.out.println("Walking"); }
6: public abstract void run();
7: }
8: public interface CanSprint extends CanWalk, CanRun {
9: void sprint();
10: }

A. The code compiles without issue.
B. The code will not compile because of line 5.
C. The code will not compile because of line 6.
D. The code will not compile because of line 8.
E. The code will not compile because of line 9.

Result: D. The code will not compile because of line 8. - Because

* */
public interface CanWalk {
    default void walk() {System.out.println("Walking");}
}
