package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.example1;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenerics {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);

// does not compile when use generics
//        List<String> names = new ArrayList<String>();
//        names.add(new StringBuilder("Webby"));

    }

    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++){
            String name = (String) list.get(i); // clast cast exception
        }
    }
}
