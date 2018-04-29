package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.unboundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class ListOfEverything {
    public static void printList(List<?> list) {
        for (Object x: list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        List<String> keyworkds = new ArrayList<>();
        keyworkds.add("java");
        printList(keyworkds);
    }
}
