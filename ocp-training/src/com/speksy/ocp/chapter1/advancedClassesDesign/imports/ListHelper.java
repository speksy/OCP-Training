package com.speksy.ocp.chapter1.advancedClassesDesign.imports;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class ListHelper {
    public List<String> copyAndSortList(List<String> original) {
        List<String> list = new ArrayList<>(original);
        // sort(arg); need static import because it is static method in Collections class
        sort(list);
        return list;
    }
}
