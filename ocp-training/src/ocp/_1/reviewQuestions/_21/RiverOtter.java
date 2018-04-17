package ocp._1.reviewQuestions._21;
/*
21. Which of the following could be inserted to fill in the blank? (Choose all that apply.)

A. @Override public boolean equals(Object o) { return false; }
B. @Override public boolean equals(Otter o) { return false; }
C. @Override public int hashCode() { return 42; }
D. @Override public long hashCode() { return 42; }
E. @Override public void play() { }
F. @Override void play() { }

Results:
    E. @Override public void play() { }
    A. @Override public boolean equals(Object o) { return false; }
    C. @Override public int hashCode() { return 42; }
* */

public class RiverOtter implements Otter {
    @Override
    public void play() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
