package com.speksy.ocp.chapter1.advancedClassesDesign.virtualMethodInvocation;

class Cow extends Animal {

    @Override
    public void feed() {
        addHay();
    }

    private void addHay(){ }
}
