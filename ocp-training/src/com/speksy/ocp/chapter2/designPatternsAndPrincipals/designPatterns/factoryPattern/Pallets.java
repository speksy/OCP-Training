package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public class Pallets extends Food {
    public Pallets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pallets eaten: " + getQuantity());
    }
}
