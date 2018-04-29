package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.legacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(5);
//        int result = numbers.get(0); // DOES NOT COMPILE
    }
}
