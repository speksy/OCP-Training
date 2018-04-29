package com.speksy.ocp.chapter3.comparatorVsComparable.comparable.example3;

public class LegacyDuck implements Comparable{
    private String name;

    @Override
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(d.name);
    }
}
