package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.genericInterfaces;

public class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
