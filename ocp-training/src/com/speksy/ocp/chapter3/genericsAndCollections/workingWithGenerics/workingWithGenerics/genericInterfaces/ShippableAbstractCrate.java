package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericInterfaces;

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) { }
}