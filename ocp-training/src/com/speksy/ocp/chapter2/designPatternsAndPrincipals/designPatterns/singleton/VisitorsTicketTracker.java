package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.singleton;

public class VisitorsTicketTracker {
    private static VisitorsTicketTracker instance;

    private VisitorsTicketTracker() {
    }
    // set getInstance to synchronized to make it thread safe otherwise NOT THREAD-SAFE!!! because instance is not final

    public synchronized static VisitorsTicketTracker getInstance(){
        if (instance == null) {
            instance = new VisitorsTicketTracker();
        }
        return instance;
    }
}
