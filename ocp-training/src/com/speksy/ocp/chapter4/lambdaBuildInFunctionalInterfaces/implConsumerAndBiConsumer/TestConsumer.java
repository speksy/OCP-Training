package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implConsumerAndBiConsumer;

import java.util.function.Consumer;

/*
@FunctionalInterface public interface Consumer<T> {
    void accept(T t);
}
* */
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c1.accept("Annie");
    }
}
