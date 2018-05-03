package com.speksy.ocp.chapter4.usingStreams.createingStreamSources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamSources {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty(); // count 0
        Stream<Integer> singleElement = Stream.of(1); // count 1
        Stream<Integer> fromaArray = Stream.of(1, 2, 3);// count 2

        // convert list to stream
        List<String> list = Arrays.asList("a" ,"b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
        // create infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        // print infinite random numbers
//        randoms.forEach(System.out::println);
        oddNumbers.forEach(System.out::println);
    }
}
