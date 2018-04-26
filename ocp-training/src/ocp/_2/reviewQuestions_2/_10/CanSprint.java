package ocp._2.reviewQuestions_2._10;

public interface CanSprint extends CanRun , CanWalk{
    void sprint();

    // TODO: !!! This would not be needed if CanRun extend CanWalk - why its not compile if remove walk() from this interface
    @Override
    default void walk() {

    }
}
