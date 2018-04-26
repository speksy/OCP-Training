package com.speksy.ocp.chapter1.reviewQuestions._4;
/*
    4. What is true about the following code? You may assume city and mascot are never null.

    A. The class does not compile.
    B. The class compiles but has an improper equals() method.
    C. The class compiles but has an improper hashCode() method.
    D. The class compiles and has proper equals() and hashCode() methods.

    Result: The class compiles but has an improper hashCode() method. - hashCode() method is required to return the same number when called with objects that are equal;
    equals() method will return true but if the numberOfPlayers are different the result will be different and this is not proper.
*/
public class BaseballTeam {
    private String city, mascot;
    private int numberOfPlayers;

    public boolean equals(Object obj) {
        if (! (obj instanceof BaseballTeam)) return false;
        BaseballTeam other = (BaseballTeam)obj;
        return (city.equals(other.city)) && mascot.equals(other.mascot);
    }

    public int hashCode() {
        return numberOfPlayers;
    }
}
