package com.speksy.ocp.chapter3.searchingAndSorting.example1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit{
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
        Set<Rabbit> rabbit = new TreeSet<>();

        // java.lang.ClassCastException: Rabbit cannot be cast to java.lang.Comparable
        // Rabbit class does not implement Comparable
        rabbit.add(new Rabbit());

        Set<Rabbit> rabbits = new TreeSet<>(new Comparator<Rabbit>() {
            @Override
            public int compare(Rabbit r1, Rabbit r2) {
                return r1.id = r2.id;
            }
        });

        // Or simple lambda expression
//        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id = r2.id);

        rabbit.add(new Rabbit());
    }
}
