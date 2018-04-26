package com.speksy.ocp.chapter1.reviewQuestions._11.my.apps;

import com.speksy.ocp.chapter1.reviewQuestions._11.my.sports.Football;

// Result: D. import static my.sports.Football.*;
public class FootballGame {
    public int getTeanSize() {
        return Football.TEAM_SIZE;
    }
}
