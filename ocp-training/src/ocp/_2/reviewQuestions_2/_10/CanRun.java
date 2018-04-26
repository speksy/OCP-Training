package ocp._2.reviewQuestions_2._10;

public interface CanRun {
    public default void walk() {System.out.println("Walking");}
    public abstract void run();
}
