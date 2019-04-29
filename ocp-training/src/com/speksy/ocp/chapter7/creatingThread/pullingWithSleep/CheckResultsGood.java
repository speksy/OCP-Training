package com.speksy.ocp.chapter7.creatingThread.pullingWithSleep;
// INFINITE ??
public class CheckResultsGood {
    private static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
           for(int i = 0; i<500; i++){
               counter++;
           }
        });

        while (counter < 100) {
//            System.out.println(counter);
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 second
        }
        System.out.println("Reached!");
    }
}
