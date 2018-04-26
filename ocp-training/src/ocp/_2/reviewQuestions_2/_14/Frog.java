package ocp._2.reviewQuestions_2._14;
/*
14. Which of the following statements can be inserted in the blank line so that the code will
compile successfully? (Choose all that apply.)

A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. Object
F. Long

Results: A) Frog,  B) TurtleFrog, C) CanHop, D) Object
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
