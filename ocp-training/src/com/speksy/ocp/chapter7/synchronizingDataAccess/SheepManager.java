package com.speksy.ocp.chapter7.synchronizingDataAccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {
    private int sheepCount = 0;
    private void incrementAndReport() {
        System.out.println((++sheepCount)+" ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(100);
//            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
//            for (int i = 0; i<10; i++) {
            for (int i = 0; i<10000; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
