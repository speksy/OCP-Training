package com.speksy.ocp.chapter3.reviewQuestions._5;

import java.util.*;

/*
    5. Which of these statements compile? (Choose all that apply.)

    A. HashSet<Number> hs = new HashSet<Integer>();
    B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
    C. List<String> list = new Vector<String>();
    D. List<Object> values = new HashSet<Object>();
    E. List<Object> objects = new ArrayList<? extends Object>();
    F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();

    Result: B) C) F)

    B, C, F. Option A does not compile because the generic types are not compatible. We could
    say HashSet<? extends Number> hs2 = new HashSet<Integer>();. Option B uses a
    lower bound, so it allows superclass generic types. Option C is a traditional use of generics
    where the generic type is the same and the List type uses the interface as the type. Option
    D does not compile because a Set is not a List. Option E does not compile because upper
    bounds are not allowed when instantiating the type. Finally, Option F does compile because
    the upper bound is on the correct side of =.

* */
public class Test {
    public static void main(String[] args) {
//        HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<>();
//        List<Object> values = new HashSet<Object>();
//        List<Object> objects = new ArrayList<? extends Object>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
