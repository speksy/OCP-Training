package com.speksy.ocp.chapter6.usingTryWithResources;

import java.util.Scanner;

public class ScopeDemo {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
//            s.nextInt(); // DOES NOT COMPILE
        } finally {
//            s.nextInt(); // DOES NOT COMPILE
        }
    }
}
