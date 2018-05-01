package com.speksy.ocp.chapter2.reviewQuestions._10;

public interface CanSprint extends CanRun , CanWalk{
    void sprint();

    @Override
    default void walk() {

    }
}
