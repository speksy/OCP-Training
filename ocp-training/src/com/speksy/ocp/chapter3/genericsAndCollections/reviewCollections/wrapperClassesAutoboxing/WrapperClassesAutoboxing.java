package com.speksy.ocp.chapter3.genericsAndCollections.reviewCollections.wrapperClassesAutoboxing;

import java.util.ArrayList;
import java.util.List;

/*
As a brief review, each primitive has a corresponding wrapper class, as shown in Table 3.1 .
Autoboxing automatically converts a primitive to the corresponding wrapper classes when
needed if the generic type is specifi ed in the declaration. Unsurprisingly, unboxing automatically
converts a wrapper class back to a primitive.
* */
public class WrapperClassesAutoboxing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // autoboxing
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
        //unboxing
        int num = numbers.get(0);

    }
}
