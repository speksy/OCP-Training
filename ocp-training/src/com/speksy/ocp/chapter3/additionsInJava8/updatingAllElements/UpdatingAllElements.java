package com.speksy.ocp.chapter3.additionsInJava8.updatingAllElements;

import java.util.Arrays;
import java.util.List;

public class UpdatingAllElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.replaceAll(x -> x*2);
        System.out.println(list);
    }
}
