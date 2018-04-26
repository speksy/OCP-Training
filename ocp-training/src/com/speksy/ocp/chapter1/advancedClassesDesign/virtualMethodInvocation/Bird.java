package com.speksy.ocp.chapter1.advancedClassesDesign.virtualMethodInvocation;

class Bird extends Animal{
    @Override
    public void feed() {
        addSeed();
    }

    private void addSeed() { }
}
