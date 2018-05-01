package com.speksy.ocp.chapter3.reviewQuestions._25;

import java.util.HashMap;
import java.util.Map;

/*
    25. What is the result of the following?

    A. {1=10, 2=20}
    B. {1=10, 2=20, 3=null}
    C. {1=10, 2=20, 3=3}
    D. {1=13, 2=20}
    E. {1=13, 2=20, 3=null}
    F. {1=13, 2=20, 3=3}
    G. The code does not compile.
    H. An exception is thrown.

    Result: F. {1=13, 2=20, 3=3}

    F. The first call to merge() calls the mapping function and adds the two numbers to get 13.
    It then updates the map. The second call to merge() sees that the map currently has a null
    value for that key. It does not call the mapping function but instead replaces it with the new
    value of 3. Therefore choice F is correct.
* */
public class Test {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a,b) -> a + b);
        map.merge(3, 3, (a,b) -> a + b);
        System.out.println(map);
    }
}
