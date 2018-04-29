package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.bounds;

import java.util.ArrayList;
import java.util.List;

// Wildcard with an upper bound ? extends type
public class WildcardWithUpperBound {
    List<? extends Exception> l = new ArrayList<RuntimeException>();
}
