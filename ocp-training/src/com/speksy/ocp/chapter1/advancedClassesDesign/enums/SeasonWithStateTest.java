package com.speksy.ocp.chapter1.advancedClassesDesign.enums;

public class SeasonWithStateTest {
    public static void main(String args[]) {
        SeasonWithState.SUMMER.printExpectedVisitors();
        SeasonWithAbstractMethod.SUMMER.printHours();
    }
}
