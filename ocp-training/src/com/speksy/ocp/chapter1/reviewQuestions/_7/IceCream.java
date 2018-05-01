package com.speksy.ocp.chapter1.reviewQuestions._7;

/*
    7. What is the result of the following code? (Choose all that apply.)

    A. vanilla
    B. chocolate
    C. strawberry
    D. missing flavor
    E. The code does not compile.
    F. An exception is thrown.

    Result: E. The code does not compile. - cannot use integer with enums in switch statement

    E. A case statement on an enum data type must be the unqualified name of an enumeration
    constant. For example, case VANILLA would be valid. You cannot use the ordinal equivalents.
    Therefore, the code does not compile.
*/
public class IceCream {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {

        Flavors f = Flavors.STRAWBERRY;
        switch (f) {
//            case 0:
//                System.out.println("vanilla");
//            case 1:
//                System.out.println("chocolate");
//            case 2:
//                System.out.println("strawberry");
//                break;
//            default:
//                System.out.println("missing flavor");
        }
    }
}