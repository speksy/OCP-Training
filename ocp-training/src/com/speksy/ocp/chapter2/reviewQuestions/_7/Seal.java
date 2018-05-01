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

    Result: C) E) G) H

    C, E, G, H. A is incorrect, as there are definitely some problems with the immutable
    objects implementation. B is incorrect, as there is no such thing as the Immutable interface
    defined in the Java API. C is correct, as all instance variables should be private
    and final to prevent them from being changed by a caller. D is incorrect, as adding
    settings is the opposite of what you do with the immutable object pattern. E is correct,
    since List<Seal> is mutable, all direct access should be removed. F is incorrect, as
    this has nothing to do with immutability. G is correct, as we need to copy the mutable
    List<Seal> to prevent the caller of the constructor from maintaining access to a mutable
    structure within our class. H is also correct, as it prevents the methods of the class from
    being overridden.
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
