package com.speksy.ocp.chapter4.usingStreams.usingCommonIntermediateOperations;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CommonIntermediateOperators {
    public static void main(String[] args) {
        testFilter();

        testDistinct();

        testLimitAndSkip();

        testMap();

        testFlatMap();

        testSorted();

        testPeek();

    }

    private static void testPeek() {
    /*

            peek();

            Stream<T> peek(Consumer<? super T> action)
    */

        Stream<String> stream = Stream.of("blacck bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);
    }

    private static void testSorted() {
    /*
    sorted();

    Stream<T> sorted()

    Stream<T> sorted(Comparator<? super T> comparator)
    */

        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);
        System.out.println();
        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);

//        s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
    }

    private static void testFlatMap() {
    /*
        flatMap()

        <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
    */

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }


    private static void testMap() {
    /*
            map()

            <R> Stream<R> map(Function<? super T, ? extends R> mapper)
    */
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::println);
    }

    private static void testLimitAndSkip() {
    /*
            limit() and skip()

            Stream<T> limit(int maxSize)

            Stream<T> skip(int n)
    */
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(2).forEach(System.out::println);
    }

    private static void testDistinct() {
        //        distinct()
//        Stream<T> distinct()

        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print);
    }

    private static void testFilter() {
        //        filter()

//        Stream<T> filter(Predicate<? super T> predicate)

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }
}
