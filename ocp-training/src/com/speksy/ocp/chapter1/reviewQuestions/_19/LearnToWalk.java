package com.speksy.ocp.chapter1.reviewQuestions._19;
/*
    19. Which of the following can be inserted to override the superclass method? (Choose all that
        apply.)

    A. public void toddle() {}
    B. public void Toddle() {}
    C. public final void toddle() {}
    D. public static void toddle() {}
    E. public void toddle() throws Exception {}
    F. public void toddle(boolean fall) {}

    Results:
        A. public void toddle() {}
        C. public final void toddle() {}

        !Can set @Override to test if it is correct overriding.

    A, C. An override must have the same method signature. A and C both do. F is an overload
    because it has a different parameter list. E does not compile because it throws a checked
    exception not declared in the superclass. D compiles but is not an override because it is
    static. B has a different method name, so it is not even an overload.
* */
public class LearnToWalk {
    public void toddle(){}
    class BabyRhino extends LearnToWalk {
//        @Override
//        public void toddle() {}

        @Override
        public final void toddle() {}
    }
}
