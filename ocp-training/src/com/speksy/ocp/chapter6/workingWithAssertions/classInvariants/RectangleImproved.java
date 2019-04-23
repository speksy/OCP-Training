package com.speksy.ocp.chapter6.workingWithAssertions.classInvariants;

/*
Do not use assertions to check for valid arguments passed in to a method. Use an
IllegalArgumentException instead. For example, the constructor of Rectangle should
throw an IllegalArgumentException when either the width or height is negative:
* */
public class RectangleImproved {
    private int width, height;

    public RectangleImproved(int height, int width) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }
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
