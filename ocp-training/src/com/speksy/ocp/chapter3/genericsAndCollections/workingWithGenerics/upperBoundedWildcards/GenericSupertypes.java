package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.upperBoundedWildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericSupertypes {
    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<Exception>();
//        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

}
