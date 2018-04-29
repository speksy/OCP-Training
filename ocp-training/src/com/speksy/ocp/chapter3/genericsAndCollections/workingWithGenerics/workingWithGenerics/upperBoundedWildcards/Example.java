package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;
// The upper-bounded wildcard says that any class that extends Number or Number itself
//can be used as the formal parameter type:

public class Example {
    public static void main(String[] args) {
//        ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE
        List<? extends Number> list2 = new ArrayList<Integer>();


    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list) {
            count += number.longValue();
        }
        return count;
    }


}
