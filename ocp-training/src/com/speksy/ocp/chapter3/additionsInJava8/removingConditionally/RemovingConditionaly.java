package com.speksy.ocp.chapter3.additionsInJava8.removingConditionally;

import java.util.ArrayList;
import java.util.List;

public class RemovingConditionaly {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);
    }
}
