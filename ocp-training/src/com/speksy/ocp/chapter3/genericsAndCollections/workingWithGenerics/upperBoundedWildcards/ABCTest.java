package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.upperBoundedWildcards;

import java.util.ArrayList;
import java.util.List;

public class ABCTest {
    public static void main(String[] args) {
        List<?> lsit1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
//        List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<A>();
//        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
    }
//    <B extends A> B method3(List<B> list) {
//        return new B(); // DOES NOT COMPILE

//    }
}
