package com.speksy.ocp.chapter7.creatingThread.schedulingTasks;

import java.util.concurrent.*;

public class SchedulingTasks {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Task1");
        Callable<String> task2 = () -> "Task2";
        Runnable task3 = () -> System.out.println("Task3");
        Runnable task4 = () -> System.out.println("Task4");

        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);
        Future<?> result3 = service.scheduleAtFixedRate(task3,5,1, TimeUnit.SECONDS);
        Future<?> result4 = service.scheduleWithFixedDelay(task4, 0,2, TimeUnit.SECONDS);

    }
}
