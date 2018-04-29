package com.speksy.ocp.chapter3.genericsAndCollections.reviewCollections.theDIamondOperator;

import java.util.ArrayList;
import java.util.List;

public class Doggies {
    List<String> names;

    Doggies() {
        this.names = new ArrayList<>(); // matches instance variable declaration
    }

    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>();  // matches local variable declaration
    }
}
