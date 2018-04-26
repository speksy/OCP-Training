package com.speksy.ocp.chapter1.reviewQuestions._20;
/*
    20. What is the result of the following code?

    A. toddle,toddle,
    B. toddle,walk,
    C. walk,toddle,
    D. walk,walk,
    E. The code does not compile.
    F. A runtime exception is thrown.

    Result:  C. walk,toddle, - first call of of.walk will refer to supper class member
* */
public class FourLegged {
    String walk = "walk, ";
    static class BabyRhino extends FourLegged{
        String walk = "toddle,";
    }
    public static void main(String[] args){
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.print(f.walk);
        System.out.print(b.walk);
    }
}
