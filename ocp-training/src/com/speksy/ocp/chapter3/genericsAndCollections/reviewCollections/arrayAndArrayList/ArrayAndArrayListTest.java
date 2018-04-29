package com.speksy.ocp.chapter3.genericsAndCollections.reviewCollections.arrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // empty list
        list.add("Fluffy");                     // [Fluffy]
        list.add("Webby");                       // [Fluffy, Webby]

        String[] array = new String[list.size()];  // empry array
        array[0] = list.get(1);                 // [Webby]
        array[1] = list.get(0);                 // [Webby, Fluffy]
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "-");
    }

}
