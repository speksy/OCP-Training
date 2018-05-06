package com.speksy.ocp.chapter4.usingStreams.puttingToghetherThePipeline;

import java.util.*;
import java.util.stream.Stream;

public class Pipeline {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();

        for (String name : list) {
            if (name.length() == 4)
                filtered.add(name);
        }

        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());

        // java 8
        List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list2.stream().filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        // Peeking behind the scenes
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);

        System.out.println();

        Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print);

        System.out.println();

        Stream<Integer> inf3 = Stream.iterate(1, x -> x + 1);
        inf3.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print);
    }
}
