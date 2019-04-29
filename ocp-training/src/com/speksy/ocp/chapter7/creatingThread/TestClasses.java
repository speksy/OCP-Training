package com.speksy.ocp.chapter7.creatingThread;

public class TestClasses {
    public static void main(String[] args) {
        for (int i =0 ;i < 5; i++) {
            System.out.println("begin");
            new ReadInventoryThread().start();
            new Thread(new PrintData()).start();
            new ReadInventoryThread().start();
            System.out.println("end");
        }
        System.out.println("-------");
        new PrintData().run();
        (new Thread(new PrintData())).run();
        (new ReadInventoryThread()).run();
        // result is unknown until runtime
    }
}
