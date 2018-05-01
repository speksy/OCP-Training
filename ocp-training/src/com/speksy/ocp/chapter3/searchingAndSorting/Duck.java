package com.speksy.ocp.chapter3.searchingAndSorting;

public class Duck implements Comparable<Duck> {
    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }
}
