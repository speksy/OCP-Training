package com.speksy.ocp.chapter7.usingConcurrentCollections.introducingConcurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManagerImproved {
    private Map<String, Object> foodData = new ConcurrentHashMap<>();

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }
}
