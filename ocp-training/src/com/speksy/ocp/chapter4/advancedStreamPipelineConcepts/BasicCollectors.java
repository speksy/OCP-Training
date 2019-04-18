package com.speksy.ocp.chapter4.advancedStreamPipelineConcepts;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicCollectors {
    public static void main(String[] args) {
        // Join strings using delimiter
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println("\nJoin strings using delimiter");
        System.out.println(result);

        // Get average from strings length
        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingDouble(String::length));
        System.out.println("\nGet average from strings length");
        System.out.println(result2);

        // Get tree set with words which starts with "t"
        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears", "tigers", "ttt");
        TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("\nGet tree set with words which starts with \"t\"");
        System.out.println(result3);

        // Collecting into Maps
        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears", "ttt");
        Map<String, Integer> map = ohMy4.collect(Collectors.toMap(s -> s, String::length));
        System.out.println("\nCollecting into Maps");
        System.out.println(map);

        // Comma-separated string with animal names
        Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(
                String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println("\nComma-separated string with animal names");
        System.out.println(map2);
        System.out.println(map2.getClass());

        // TreeMap example
        Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy6.collect(Collectors.toMap(
                String::length, k -> k, (s1 , s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println("\nTreeMap example");
        System.out.println(map3);
        System.out.println(map3.getClass());

        // Using groupingBy String length
        Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map4 = ohMy7.collect(
                Collectors.groupingBy(String::length));
        System.out.println("\nUsing groupingBy String length");
        System.out.println(map4);

        // Using Set
        Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map5 = ohMy8.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println("\nUsing Set");
        System.out.println(map5);

        //Change type of Map with TreeMap:new parametter
        Stream<String> ohMy9 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map6 = ohMy9.collect(
          Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet())
        );
        System.out.println(map6);

        // change of Map returned
        Stream<String> ohMy10 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map7 = ohMy10.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet())
        );
        System.out.println(map7);

        // Partitioning grouping
        Stream<String> ohMy11 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map8 = ohMy11.collect(
                Collectors.partitioningBy(s -> s.length() <= 5)
        );
        System.out.println(map8);
        // ex2
        Stream<String> ohMy12 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map9 = ohMy12.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map9); // {false=[], true=[lions, tigers, bears]}
        //Unlike groupingBy(), we cannot change the type of Map that gets returned.
//        Stream<String> ohMy13 = Stream.of("lions", "tigers", "bears","bears");
//        Map<Boolean, Set<String>> map10 = ohMy13.collect(
//                Collectors.partitioningBy(s -> s.length() <= 7));
//        System.out.println(map10); // {false=[], true=[lions, tigers, bears]}


    }
}
