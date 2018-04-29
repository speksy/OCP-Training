package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.genericInterfaces;


import com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.genericClasses.Robot;

public class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {

    }
}
