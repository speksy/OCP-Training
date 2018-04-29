package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.genericClasses;

public class CrateTest {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
    }
}
