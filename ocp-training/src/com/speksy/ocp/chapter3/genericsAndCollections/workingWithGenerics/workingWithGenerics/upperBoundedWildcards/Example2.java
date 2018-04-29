package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound2(strings);
        addSound2(objects);
    }

//    Method compiles - No (unbounded generics are immutable)
//    public static void addSound(List<?> list) {
//        list.add("quack");
//    }

//    Method compiles - No (upperbounded generics are immutable)
//    public static void addSound(List<? extends Object> list) {
//        list.add("quack");
//    }

    // Can pass a List<String> - No (with generics, must pass exact match)
    public static void addSound(List<Object> list) {
        list.add("quack");
    }

    public static void addSound2(List<? super String> list) {
        list.add("quack");
    }
}
