package com.speksy.ocp.chapter3.comparatorVsComparable.comparable.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
