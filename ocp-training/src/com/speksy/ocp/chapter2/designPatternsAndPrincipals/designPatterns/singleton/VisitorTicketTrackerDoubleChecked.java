package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.singleton;
/*
The synchronized implementation of getInstance(), while correctly preventing multiple
singleton objects from being created, has the problem that every single call to this
method will require synchronization. In practice, this can be costly and can impact
performance. Synchronization is only needed the first time that the object is created.

The solution is to use double‐checked locking, a design pattern in which we first test if
synchronization is needed before actually acquiring any locks. The following is an mapIfAbsent
rewrite of this method using double‐checked locking:


* */
public class VisitorTicketTrackerDoubleChecked {
    private VisitorTicketTrackerDoubleChecked(){ }

    private static volatile VisitorTicketTrackerDoubleChecked instance;

    public static VisitorTicketTrackerDoubleChecked getInstance(){
        if (instance == null) {
            synchronized (VisitorTicketTrackerDoubleChecked.class) {
                if (instance == null) {
                    instance = new VisitorTicketTrackerDoubleChecked();
                }
            }
        }
        return instance;
    }

}
