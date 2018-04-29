package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.genericClasses;

public class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

}
