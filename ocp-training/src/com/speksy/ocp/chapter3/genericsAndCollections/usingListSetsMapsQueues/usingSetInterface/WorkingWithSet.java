package com.speksy.ocp.chapter3.genericsAndCollections.usingListSetsMapsQueues.usingSetInterface;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        for (Integer integer : set) System.out.print(integer + ","); // 66,8,10,

        Set<Integer> set2 = new HashSet<>();
        boolean b11 = set2.add(66); // true
        boolean b22 = set2.add(10); // true
        boolean b33 = set2.add(66); // false
        boolean b44 = set2.add(8); // true
        for (Integer integer : set2) System.out.print(integer + ","); // 8,10,66
    }
}
