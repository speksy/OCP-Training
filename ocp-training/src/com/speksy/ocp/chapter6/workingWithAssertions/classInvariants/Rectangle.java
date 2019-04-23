package com.speksy.ocp.chapter6.workingWithAssertions.classInvariants;

// Example of class invariants
/*
Class Invariants You assert the validity of an object’s state.
Class invariants are typically private methods within the class
that return a boolean . The upcoming Rectangle class demonstrates
a class invariant.
* */
public class Rectangle {
    private int width, height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        // with throw error only if assertions are enabled
        assert isValid() : "Not a valid Rectangle";
        return width * height;
    }

    private boolean isValid() {
        return (width >= 0 && height >= 0);
    }

    public static void main(String[] args) {
        Rectangle one = new Rectangle(5, 12);
        Rectangle two = new Rectangle(-4, 10);
        System.out.println("Area one = " + one.getArea());
        System.out.println("Area tow = " + two.getArea());
    }
}
