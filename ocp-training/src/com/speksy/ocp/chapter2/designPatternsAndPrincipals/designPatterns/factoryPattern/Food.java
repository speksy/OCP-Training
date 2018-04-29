package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public abstract class Food {
    private int quantity;

    Food(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    public abstract void consumed();
}
