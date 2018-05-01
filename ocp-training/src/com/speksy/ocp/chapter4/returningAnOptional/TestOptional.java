package com.speksy.ocp.chapter4.returningAnOptional;

import java.util.Optional;

public class TestOptional {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get());

        Optional<Double> opt2 = average(90, 100);
        opt2.ifPresent(System.out::println);

        Object vallue = null;
        Optional o = (vallue == null) ? Optional.empty() : Optional.of(vallue);
        Optional o2 = Optional.ofNullable(vallue);

        Optional<Double> opt3 = average();
        System.out.println(opt3.orElse(Double.NaN));
        System.out.println(opt3.orElseGet(() -> Math.random()));
        System.out.println(opt3.orElseThrow(() -> new IllegalStateException()));
    }
}
