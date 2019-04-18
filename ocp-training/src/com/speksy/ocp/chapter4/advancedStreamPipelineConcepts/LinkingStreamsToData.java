package com.speksy.ocp.chapter4.advancedStreamPipelineConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LinkingStreamsToData {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("cat 1");
        cats.add("cat 2");
        Stream<String> stream = cats.stream();
        cats.add("cat 3");
        System.out.println(stream.count());


        // Chaining Optionals example

        threeDigit(Optional.of(1));
        threeDigit2(Optional.of(123));
    }
    // You are given Option<Integer> and ask to print the value,
    // but only if it is a tree-digit number.
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) {
                System.out.println(string);
            }
        }
    }
    // less complex example
    private static void threeDigit2(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
