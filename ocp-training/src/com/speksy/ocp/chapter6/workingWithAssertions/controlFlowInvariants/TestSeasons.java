package com.speksy.ocp.chapter6.workingWithAssertions.controlFlowInvariants;

// Example of Control Flow Invariant
/*
Control Flow Invariants You assert that a line of code you assume is
unreachable is never reached. TestSeasons class demonstrates
a control flow invariant.

Because there are only three possible outcomes (see Seasons enum),
the default case statement should never execute.
* */
public class TestSeasons {
    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }
    }
    // test ir
    public static void main(String[] args) {
        test(Seasons.WINTER);
    }
}
