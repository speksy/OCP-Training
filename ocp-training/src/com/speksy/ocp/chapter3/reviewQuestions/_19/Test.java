package com.speksy.ocp.chapter3.reviewQuestions._19;

import java.util.*;

/*
    19. Which options are true of the following code? (Choose all that apply.)

    A. If we fill in the blank with List, the output is [10].
    B. If we fill in the blank with List, the output is [10, 12].
    C. If we fill in the blank with Queue, the output is [10].
    D. If we fill in the blank with Queue, the output is [10, 12].
    E. The code does not compile in either scenario.
    F. A runtime exception is thrown.

    Result: A), D)

    A, D. A LinkedList implements both List and Queue. The List interface has a method to
    remove by index. Since this method exists, Java does not autobox to call the other method.
    Queue has only the remove by object method, so Java does autobox there. Since the number
    1 is not in the list, Java does not remove anything for the Queue.
* */
public class Test {
    public static void main(String[] args) {
        // ______________<Integer> q = new LinkedList<>();
        List<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        q2.add(12);
        q2.remove(1);
        System.out.println(q2);
    }
}
