package com.speksy.ocp.chapter3.reviewQuestions._7;
/*
    7. Which of the following statements are true? (Select two.)

    A. The code compiles successfully.
    B. The output is 8675null309.
    C. The output is 867586null309.
    D. The output is indeterminate.
    E. There is a compiler error on line 3.
    F. There is a compiler error on line 9.
    G. An exception is thrown.

    Result:
        A. The code compiles successfully.
        D. The output is indeterminate.

    A, D. The code compiles fine. It uses the diamond operator, and it allows any implementation
    of Number to be added. HashSet does not guarantee any iteration order, making A and
    D correct.
* */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Test {
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
    }
}
