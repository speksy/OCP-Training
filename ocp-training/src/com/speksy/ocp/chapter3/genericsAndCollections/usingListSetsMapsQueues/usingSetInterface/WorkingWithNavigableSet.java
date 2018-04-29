package com.speksy.ocp.chapter3.genericsAndCollections.usingListSetsMapsQueues.usingSetInterface;

import java.util.NavigableSet;
import java.util.TreeSet;

public class WorkingWithNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        System.out.println(set.lower(10));
        System.out.println(set.floor(10));
        System.out.println(set.ceiling(20));
        System.out.println(set.higher(20));
    }
}
