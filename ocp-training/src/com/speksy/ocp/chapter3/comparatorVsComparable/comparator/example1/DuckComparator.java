package com.speksy.ocp.chapter3.comparatorVsComparable.comparator.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DuckComparator {
    public static void main(String[] args) {
        // custom comparator by Duck weight
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);

        //Comparator using lambda expression
        Comparator<Duck> byWeight2 = (d1, d2) -> d1.getWeight() - d2.getWeight();
        Comparator<Duck> byWeight3 = (Duck d1, Duck d2) -> d1.getWeight() - d2.getWeight();
        Comparator<Duck> byWeight4 = (d1, d2) -> {return d1.getWeight() - d2.getWeight();};
        Comparator<Duck> byWeight5 = (Duck d1, Duck d2) -> {return d1.getWeight() - d2.getWeight();};
        // Shortest comparator with lambda
        Comparator<Duck> byWeigh6 = Comparator.comparingInt(Duck::getWeight);

    }
}
