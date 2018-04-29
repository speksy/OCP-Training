package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public class Hay extends Food{

    public Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}