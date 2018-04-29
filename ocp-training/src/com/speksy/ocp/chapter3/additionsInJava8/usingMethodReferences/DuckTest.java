package com.speksy.ocp.chapter3.additionsInJava8.usingMethodReferences;

import com.speksy.ocp.chapter3.comparatorVsComparable.comparator.example1.Duck;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DuckTest {
    public static void main(String[] args) {
        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        //lambda
        Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;

    }
}
