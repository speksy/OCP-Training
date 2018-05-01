package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implConsumerAndBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
@FunctionalInterface public interface BiConsumer<T, U> {
    void accept(T t, U u);
}
* */
public class TestBiConsumer {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b1.accept("chick", 1);

        System.out.println(map);
        // ----------------------------
        Map<String, String> map2 = new HashMap<>();
        BiConsumer<String, String> b12 = map2::put;
        BiConsumer<String, String> b22 = (k, v) -> map2.put(k, v);
        b12.accept("chicken", "Cluck");
        b22.accept("chick", "Tweep");
        System.out.println(map2);
    }
}
