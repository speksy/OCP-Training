package com.speksy.ocp.chapter7.creatingThread.pullingWithSleep;

public class CheckResultsBad {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                CheckResultsBad.counter++;
            }
        }).start();

        while (CheckResultsBad.counter < 1000) {
            System.out.println("not reached yet");
        }
        System.out.println("Reached!");
    }
}
