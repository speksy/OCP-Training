package com.speksy.ocp.chapter4.lambdaBuildInFunctionalInterfaces.implSupplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;
/*
@FunctionalInterface public interface Supplier<T> {
    public T get();
}
* */
public class TestSupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
        // -------------------

        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = () -> new StringBuilder();

        System.out.println(sb1);
        System.out.println(sb2);
        //---------------------

        Supplier<ArrayList<String>> l1 = ArrayList<String>::new;
        ArrayList<String> a1 = l1.get();
        System.out.println(a1);


    }
}
