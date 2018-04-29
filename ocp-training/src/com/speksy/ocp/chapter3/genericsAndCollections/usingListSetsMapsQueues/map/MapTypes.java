package com.speksy.ocp.chapter3.genericsAndCollections.usingListSetsMapsQueues.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {

    public static void main(String[] args) {
        // HashMap
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");

        for (String key : map.keySet()) {
            System.out.println(key + ",");
        }

        // TreeMap = sorted
        Map<String, String> map2 = new TreeMap<>();
        map2.put("koala", "bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        String food2 = map.get("koala");

        for (String key : map2.keySet()) {
            System.out.println(key + ",");
        }

//        System.out.println(map.contains("lion"));  // DOES NOT COMPILE - no contains method
        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.size());
    }
}
