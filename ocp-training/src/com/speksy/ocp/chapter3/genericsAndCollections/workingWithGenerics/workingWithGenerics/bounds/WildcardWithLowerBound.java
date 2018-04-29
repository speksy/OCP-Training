package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.bounds;


import java.util.ArrayList;
import java.util.List;

// Wildcard with a lower bound ? super type
public class WildcardWithLowerBound {
    List<? super Exception> l = new ArrayList<Object>();
}
