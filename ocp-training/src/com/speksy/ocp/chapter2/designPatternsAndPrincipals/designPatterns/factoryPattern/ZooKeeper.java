package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public class ZooKeeper {
    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("zebra");
        food.consumed();
        final Food food2 = FoodFactory.getFood("aasdasda");
        food.consumed();
    }
}
