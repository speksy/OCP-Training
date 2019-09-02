package com.speksy.ocp.chapter7.usingConcurrentCollections.introducingConcurrentCollections;

import java.util.HashMap;
import java.util.Map;

public class ZooManager {
    private Map<String, Object> foodData = new HashMap<>();
    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }
}
