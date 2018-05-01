package com.speksy.ocp.chapter2.reviewQuestions._3;
/*
3. Which of the following are valid functional interfaces? (Choose all that apply.)

    public interface Climb {
        public int climb();
    }

    public abstract class Swim {
        public abstract Object swim(double speed, int duration);
    }

    public interface ArcticMountainClimb extends MountainClimb {
        public default int getSpeed();
    }

    public interface MountainClimb extends Climb {}

    A. Climb
    B. Swim
    C. ArcticMountainClimb
    D. MountainClimb
    E. None of these are valid functional interfaces.

    Result: A: Climb, D.MountainClimb

    A, D. A is correct as Climb defines an interface with exactly one abstract method. B is
    incorrect, as abstract classes are not functional interfaces despite having a single abstract
    method. While functional interfaces may have any number of default methods, Arctic-
    MountainClimb will not compile due to the default method getSpeed() missing an
    implementation body, so C is incorrect. D is correct, as the interface MountainClimb has
    exactly one abstract method defined in Climb. Finally, E is incorrect because A and D are
    correct.
* */
public class Test {
}
