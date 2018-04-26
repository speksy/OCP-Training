package com.speksy.ocp.chapter3.genericsAndCollections.reviewOCACollections;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] array = {"gerbil", "mouse"};       // [gerbil, mouse]
        List<String> list = Arrays.asList(array);   // returns fixed size list
        list.set(1, "test");                        // [gerbil, test]
        array[0] = "new";                           // [new, test]
        String[] array2 = (String[]) list.toArray();// [new, test]
        list.remove(1);                      // throws UnsupportedOperationException
    }
}
