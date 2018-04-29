package com.speksy.ocp.chapter3.comparatorVsComparable.comparator.example1;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Duck duck) {
        return name.compareTo(duck.name);
    }


}
