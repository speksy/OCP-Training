package com.speksy.ocp.chapter3.reviewQuestions._6;
/*
    6. What is the result of the following code?

    A. hi
    B. hi followed by a runtime exception
    C. hithere
    D. Compiler error on line 4
    E. Compiler error on line 6
    F. Compiler error on line 7

    Result: C. hithere

    C. Line 7 gives a compiler warning for not using generics but not a compiler error. Line 4
    compiles fine because toString() is defined on the Object class and is therefore always
    available to call. Line 6 creates the Hello class with the generic type String. Line 7 creates
    the Hello class with the generic type Object since no type is specified.
* */
public class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));

    }
}
