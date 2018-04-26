package com.speksy.ocp.chapter1.advancedClassesDesign.virtualMethodInvocation;

class Lion extends Animal{
    String name = "Leo";

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat() { }

    public void play(){
        System.out.println("toss in meat");
    }
}

