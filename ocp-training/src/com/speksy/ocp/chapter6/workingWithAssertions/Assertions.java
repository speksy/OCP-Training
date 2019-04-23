package com.speksy.ocp.chapter6.workingWithAssertions;

/*
to enable assertions add this parameter when start the program
java -ea Assertions
or change run configuration and add only "-ea" in vm-options or "-enableassertions"
* */

// !!! Assertions Should Not Alter Outcomes assert ++x > 10; Not a good design!
public class Assertions {
    public static void main(String[] args) {
        int numGuests = -5;
        // assert is ignored if not enabled
        assert numGuests > 0;
        System.out.println(numGuests); // does not execute if assert fails
    }
}
