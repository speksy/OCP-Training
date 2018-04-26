package com.speksy.ocp.chapter1.advancedClassesDesign.virtualMethodInvocation;

abstract class Animal {
    public abstract void feed();
    String name = "???";

    public void printName() {
        System.out.println(name);
    }

    public void careFor() {
        play();
    }

    public void play() {
        System.out.println("pet animal");
    }
}
