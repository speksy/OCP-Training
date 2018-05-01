package com.speksy.ocp.chapter1.reviewQuestions._11.my.sports;
/*
    11. Which of the following statements can be inserted to make FootballGame compile?

    A. import my.sports.Football;
    B. import static my.sports.*;
    C. import static my.sports.Football;
    D. import static my.sports.Football.*;
    E. static import my.sports.*;
    F. static import my.sports.Football;
    G. static import my.sports.Football.*;

    Result: D. import static my.sports.Football.*;

    D. FootballGame is trying to refer to a static variable in another class. It needs a static
    import to do so. The correct syntax is import static and not static import. B is incorrect
    because * does not import classes in a package. C is incorrect because it does not refer to a
    static member.
* */
public class Football {
    public static final int TEAM_SIZE = 11;
}
