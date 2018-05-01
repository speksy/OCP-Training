package com.speksy.ocp.chapter3.reviewQuestions._18;
/*
    18. Which of the following lines can be inserted to make the code compile?
    (Choose all that apply.)

    A. A a1 = new A();
    B. A a2 = new B();
    C. A a3 = new C();
    D. C c1 = new A();
    E. C c2 = new B();
    F. C c1 = new C();

    Result: A) , B)

    A, B. C is both a class and a type parameter. This means that within the class D, when we
    refer to C, it uses the type parameter. All of the choices that mention class C are incorrect
    because it no longer means the class C.
* */
public class D<C> {
    //INSERT CODE HERE
    A a1 = new A();
    A a2 = new B();
//    A a3 = new C();
//    C c1 = new A();
//    C c2 = new B();
//    C c1 = new C();
}
