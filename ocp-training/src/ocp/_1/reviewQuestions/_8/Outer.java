package ocp._1.reviewQuestions._8;

/*
    8. What is the result of the following code?

    A. The output is 5.
    B. The output is 10.
    C. Line 4 generates a compiler error.
    D. Line 8 generates a compiler error.
    E. Line 9 generates a compiler error.
    F. An exception is thrown.

    Result: C. Line 4 generates a compiler error. - Member Inner Classes could not have static fields

* */
public class Outer {
    private int x = 5;

    protected class Inner {
//        public static int x = 10; // compiler error

        public void go() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.go();
    }
}
