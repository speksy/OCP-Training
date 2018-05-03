package com.speksy.ocp.chapter4.usingStreams.usingCommonTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CommonTerminalOperations {
    public static void main(String[] args) {
        // count() - long count()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());
        System.out.println("----------------");

        // min() and max()
//        Optional<T> min(<? super T> comparator)
//        Optional<T> max(<? super T> comparator)

        Stream<String> ss1 = Stream.of("monkey", "are", "bonobo");
        Optional<String> min = ss1.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());
        System.out.println("----------------");
        // findAny() and findFirst()
//        Optional<T> findAny()
//        Optional<T> findFirst()

        Stream<String> ss2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        ss2.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);
        System.out.println("----------------");
        // allMatch(), anyMatch() and noneMatch()
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

        // forEach()
//        void forEach(Consumer<? super T> action)
        Stream<String> ss3 = Stream.of("Monkey", "Gorilla", "Bonobo");
        ss3.forEach(System.out::println);

        Stream ss4 = Stream.of(1);
//        for (Integer i: ss4) {} // DOES NOT COMPILE
        System.out.println("----------------");

        //reduce()
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

    }
}
