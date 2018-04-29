package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericInterfaces;

public interface Shippable<T> {
    void ship(T t);
}