package com.speksy.ocp.chapter3.searchingAndSorting.example1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAndBinartSearch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Fluffy","Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);

    }
}
