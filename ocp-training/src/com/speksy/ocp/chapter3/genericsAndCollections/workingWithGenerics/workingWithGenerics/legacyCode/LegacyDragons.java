package com.speksy.ocp.chapter3.genericsAndCollections.workingWithGenerics.workingWithGenerics.legacyCode;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragons(unicorns);


        List<Unicorn> unicorns2 = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns2.get(0); // ClassCastException
    }

    private static void printDragons(List<Dragon> dragons) {
        for (Dragon dragon: dragons) { // ClassCastException
            System.out.println(dragon);
        }
    }

    private static void addUnicorn(List unicorns) {
        unicorns.add(new Dragon());
    }
}
