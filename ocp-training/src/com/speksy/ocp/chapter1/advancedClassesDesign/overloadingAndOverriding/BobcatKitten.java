package com.speksy.ocp.chapter1.advancedClassesDesign.overloadingAndOverriding;

public class BobcatKitten extends Bobcat {
    // !!! Static methods cannot be overridden
    // Overridden method from supper class
    @Override
    public void findDen() { }

    // Overloaded method from supper class
    public void findDen(boolean b){ }

    public int finden() throws Exception { return 0; }

    // If any checked exceptions are thrown, only the same exceptions or subclasses of those
    //exceptions are allowed to be thrown.
    @Override
    public void exceptionExample() throws Exception {
        super.exceptionExample();
    }
}
