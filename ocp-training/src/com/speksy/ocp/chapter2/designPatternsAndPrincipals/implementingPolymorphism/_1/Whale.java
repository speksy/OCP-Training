package com.speksy.ocp.chapter2.designPatternsAndPrincipals.implementingPolymorphism._1;

public class Whale implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("sing");
    }
}
