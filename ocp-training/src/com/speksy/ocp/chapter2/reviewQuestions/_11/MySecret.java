package com.speksy.ocp.chapter2.reviewQuestions._11;
/*
    11. Which lambda can replace the MySecret class to return the same value? (Choose all that apply.)
    A. caller((e) -> "Poof");
    B. caller((e) -> {"Poof"});
    C. caller((e) -> { String e = ""; "Poof" });
    D. caller((e) -> { String e = ""; return "Poof"; });
    E. caller((e) -> { String e = ""; return "Poof" });
    F. caller((e) -> { String f = ""; return "Poof"; });

    Result: A), F)

    A, F. B is incorrect because it does not use the return keyword. C, D, and E are incorrect
    because the variable e is already in use from the lambda and cannot be redefined. Additionally,
    C is missing the return keyword and E is missing the semicolon. A and F are the only
    correct lambda expressions that match the functional interface.
* */

public class MySecret implements Secret{
    public String magic(double d){
        return "Poof";
    }

    public static void caller(Secret ms){
        ms.magic(5.5);
    }
    public static void main(String[] args) {
        caller((e) -> "Poof");
//        caller((e) -> { String e = ""; "Poof" });
//        caller((e) -> { String e = ""; return "Poof"; });
//        caller((e) -> { String e = ""; return "Poof" });
        caller((e) -> { String f = ""; return "Poof"; });
    }
}
