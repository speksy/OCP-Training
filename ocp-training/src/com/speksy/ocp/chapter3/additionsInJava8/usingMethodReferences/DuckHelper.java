package com.speksy.ocp.chapter3.additionsInJava8.usingMethodReferences;

import com.speksy.ocp.chapter3.comparatorVsComparable.comparator.example1.Duck;

public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
