package com.speksy.ocp.chapter6.workingWithAssertions.InternalInvariants;

public class InternalInvariantDemo {
    public static void main(String[] args) {
        int numGuests = -5;
        // Internal Invariant x < 0
        assert numGuests > 0;
        System.out.println(numGuests); // does not execute if assert fails
    }
}
