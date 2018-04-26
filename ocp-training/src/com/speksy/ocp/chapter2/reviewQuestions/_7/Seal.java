package com.speksy.ocp.chapter2.reviewQuestions._7;

import java.util.ArrayList;
import java.util.List;

/*
7. What changes need to be made to make the following immutable object pattern correct?
(Choose all that apply.)

A. None; the immutable object pattern is properly implemented.
B. Have Seal implement the Immutable interface.
C. Mark name final and private.
D. Add setters for name and List<Seal> friends.
E. Replace the getFriends() method with methods that do not give the caller direct
access to the List<Seal> friends.
F. Change the type of List<Seal> to List<Object>.
G. Make a copy of the List<Seal> friends in the constructor.
H. Mark the Seal class final.

Result: C) G) H
* */
public final class Seal {
    private final String name;
    private final List<Seal> friends;

    public Seal(String name, List<Seal> friends) {
        this.name = name;
        this.friends = new ArrayList<>(friends);
    }

    public String getName() {
        return name;
    }

    public List<Seal> getFriends() {
        return friends;
    }
}
