package ocp._1.reviewQuestions._17;
/*
    17. What is the result of the following code? (Choose all that apply.)

    A. Compiler error on line 2.
    B. Compiler error on line 3.
    C. Compiler error on line 5.
    D. Compiler error on line 8.
    E. Compiler error on line 12.
    F. Compiler error on another line.
    G. The code compiles successfully.

    Result: G. The code compiles successfully.
*/
public enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);
    boolean hasHair;

    AnimalClasses(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }
    public void giveWig() {
        hasHair = true;
    }
}
