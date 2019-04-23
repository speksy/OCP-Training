package com.speksy.ocp.chapter6.usingTryWithResources.autoCloseable;

public class TurkeyCage implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try(TurkeyCage tc = new TurkeyCage()){
            System.out.println(tc);
        }
    }
}
