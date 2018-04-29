package com.speksy.ocp.chapter3.genericsAndCollections.reviewCollections.searchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingAndSorting {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 6)); // 1
        System.out.println(Arrays.binarySearch(numbers,3));  // -2

        List<Integer> list = Arrays.asList(9,7,5,3);
        Collections.sort(list); // [3,5,7,9]
        System.out.println(Collections.binarySearch(list,3));
        System.out.println(Collections.binarySearch(list, 2));

    }
}
