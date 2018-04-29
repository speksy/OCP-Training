package com.speksy.ocp.chapter3.additionsInJava8.mapAPIJava8.mapIfAbsent;

import java.util.HashMap;
import java.util.Map;

public class Exmple1 {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bas Tour");
        System.out.println(favorites);

        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bas Tour");
        favorites2.put("Tom", null);

        favorites2.putIfAbsent("Jenny", "Tram");
        favorites2.putIfAbsent("Sam", "Tram");
        favorites2.putIfAbsent("Tom", "Tram");
        System.out.println(favorites2);
    }
}
