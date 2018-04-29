package com.speksy.ocp.chapter3.additionsInJava8.loopingCollection;

import java.util.Arrays;
import java.util.List;

public class LoopingThroughCollection {
    public static void main(String[] args) {
        List<String> cats = Arrays.asList("Annie","Ripley");
        for (String cat: cats) {
            System.out.println(cat);
        }

        cats.forEach(cat -> System.out.println(cat));
        cats.forEach(System.out::println);
    }
}
