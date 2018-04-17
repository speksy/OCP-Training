package ocp._1.reviewQuestions._19;
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
