package com.speksy.ocp.chapter2.designPatternsAndPrincipals.implementingPolymorphism._1;

/*
Polymorphism is the ability of a single interface to support multiple underlying forms. In
Java, this allows multiple types of objects to be passed to a single method or class.

Both Dolphin and whale make sound
* */
public class Oceanographer {
    public void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }
}
