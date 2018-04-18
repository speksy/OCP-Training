package ocp._1.advancedClassesDesign.nestedClasses.memberInnerClasses.LocalInnerClasses;

public class Outer {
    private int length = 5;

    public void calculate() {
        // need to be final or effectively final to be used in Inner class
        final int WIDTH = 20;
        // local inner classes does not have access modifiers
        class Inner {
            public void mitiply() {
                //WIDTH should be final or effectively final to be used
                System.out.println(length * WIDTH);
            }
        }
        Inner inner = new Inner();
        inner.mitiply();
    }

    public static void main (String args[]) {
        Outer outer = new Outer();
        outer.calculate();
    }
}
