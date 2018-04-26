package com.speksy.ocp.chapter2.reviewQuestions._10;

public interface CanRun {
    public default void walk() {System.out.println("Walking");}
    public abstract void run();
}
