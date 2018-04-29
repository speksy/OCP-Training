package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericInterfaces;


import com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericClasses.Robot;

public class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {

    }
}
