package com.speksy.ocp.chapter6.usingTryWithResources.autoCloseable;

public class Turkey {
    public static void main(String[] args) {
//        try(Turkey t = new Turkey()) { // DOES NOT COMPILE
//            System.out.println(t);
//        }

        // The resource type Turkey does not implement java.lang.AutoCloseable
    }
}
