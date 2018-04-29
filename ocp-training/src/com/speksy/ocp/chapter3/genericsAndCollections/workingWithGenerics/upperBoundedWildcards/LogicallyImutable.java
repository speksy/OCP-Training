package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;
// The problem stems from the fact that Java doesn’t know what type List<? extends
//Bird> really is.
public class LogicallyImutable {

    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
//        birds.add(new Sparrow()); // DOES NOT COMPILE
//        birds.add(new Bird()); // DOES NOT COMPILE
    }

    static class Sparrow extends Bird { }
    static class Bird { }

}
