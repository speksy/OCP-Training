package com.speksy.ocp.chapter4.usingStreams.usingCommonTerminalOperations;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonTerminalOperations {
    public static void main(String[] args) {

        testCount();

        testMinMax();

        testFinAnyFindFirst();

        testAllMatchAnyMatchNoneMatch();

        testForEach();

        testReduce();

        testCollect();

    }

    private static void testCollect() {
        //        collect()
//        <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
//                BiConsumer<R, R> combiner)
//
//        <R,A> R collect(Collector<? super T, A,R> collector)

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder work = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(work);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);

        //shorter
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2);

        //sorted and shorter
        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream4.collect(Collectors.toSet());
        System.out.println(set3); // [f, w, l, o]
    }

    private static void testReduce() {
//        reduce()

//        T reduce(T identity, BinaryOperator<T> accumulator)
//        Optional<T> reduce(BinaryOperator<T> accumulator)
//        <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,
//        BinaryOperator<U> combiner)

        // without functional programming
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String ss : array) result = result + ss;
        System.out.println(result);

        // functional
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (str, c) -> str + c);
        System.out.println(word);

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", String::concat);
        System.out.println(word2);

        Stream<Integer> stream3 = Stream.of(3, 5, 6);
        System.out.println(stream3.reduce(1, (a, b) -> a * b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);

        BinaryOperator<Integer> op2 = (a, b) -> a * b;
        Stream<Integer> stream4 = Stream.of(3, 5, 6);
        System.out.println(stream4.reduce(1, op, op));
    }

    private static void testForEach() {
//        forEach()

//        void forEach(Consumer<? super T> action)
        Stream<String> ss3 = Stream.of("Monkey", "Gorilla", "Bonobo");
        ss3.forEach(System.out::println);

        Stream ss4 = Stream.of(1);
//        for (Integer i: ss4) {} // DOES NOT COMPILE
        System.out.println("----------------");
    }

    private static void testAllMatchAnyMatchNoneMatch() {
//        allMatch(), anyMatch() and noneMatch()

//        boolean anyMatch(Predicate <? super T> predicate)
//        boolean allMatch(Predicate <? super T> predicate)
//        boolean noneMatch(Predicate <? super T> predicate)

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite2.anyMatch(pred));
        System.out.println("----------------");
    }

    private static void testFinAnyFindFirst() {
//        findAny() and findFirst()
//        Optional<T> findAny()
//        Optional<T> findFirst()

        Stream<String> ss2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        ss2.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
        System.out.println("----------------");
    }

    private static void testMinMax() {
        // min() and max()
//        Optional<T> min(<? super T> comparator)
//        Optional<T> max(<? super T> comparator)

        Stream<String> ss1 = Stream.of("monkey", "are", "bonobo");
        Optional<String> min = ss1.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());
        System.out.println("----------------");
    }

    private static void testCount() {
        // count() - long count()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());
        System.out.println("----------------");
    }


}
