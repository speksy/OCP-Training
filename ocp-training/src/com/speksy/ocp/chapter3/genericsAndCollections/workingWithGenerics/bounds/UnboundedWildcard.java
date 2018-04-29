package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.bounds;

import java.util.ArrayList;
import java.util.List;

// Unbounded wildcard ?
public class UnboundedWildcard {
    List<?> l = new ArrayList<String>();
}
