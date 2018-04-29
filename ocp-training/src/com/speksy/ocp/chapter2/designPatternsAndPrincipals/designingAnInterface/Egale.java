package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designingAnInterface;

public class Egale implements Fly{

    @Override
    public int getWingSpan() {
        return 15;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
