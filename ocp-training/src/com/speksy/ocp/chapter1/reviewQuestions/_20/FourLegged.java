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

    C. Both objects are BabyRhino objects. Virtual method invocation says that the subclass
    method gets called at runtime rather than the type in the variable reference. However, we
    are not calling methods here. We are referring to instance variables. With instance variables,
    the reference type does matter.
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
