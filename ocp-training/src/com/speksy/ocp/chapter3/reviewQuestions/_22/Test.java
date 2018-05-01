package com.speksy.ocp.chapter3.reviewQuestions._22;
/*
    22. What code change is needed to make the method compile?

    public static T identity(T t) {
        return t;
    }
    A. Add <T> after the public keyword.
    B. Add <T> after the static keyword.
    C. Add <T> after T.
    D. Add <?> after the public keyword.
    E. Add <?> after the static keyword.
    F. No change required. The code already compiles.

    Result: B)

    B. When using generic types in a static method, the generic specification goes before the
    return type.
* */
public class Test {
    public static <T> T identity(T t) {
        return t;
    }
}
