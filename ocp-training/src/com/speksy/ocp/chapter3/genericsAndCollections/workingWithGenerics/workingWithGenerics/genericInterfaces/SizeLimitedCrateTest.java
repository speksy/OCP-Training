package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericInterfaces;

import com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericClasses.Elephant;

public class SizeLimitedCrateTest {
    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);
}
