package com.speksy.ocp.chapter7.synchronizingDataAccess.protectingWithAtomicClasses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerAtomic {
    private AtomicInteger sheepCount = new AtomicInteger();
    private void incrementAndReport() {
        System.out.println(sheepCount.incrementAndGet()+" ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(100);
//            service = Executors.newFixedThreadPool(20);
            SheepManagerAtomic manager = new SheepManagerAtomic();
//            for (int i = 0; i<10; i++) {
            for (int i = 0; i<10000; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
