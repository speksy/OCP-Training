package com.speksy.ocp.chapter6.suppressedExceptions;

public class JammedTurkeyCage implements AutoCloseable{
    public static void main(String[] args) {
        try (JammedTurkeyCage jtc = new JammedTurkeyCage()) {
            System.out.println("put turkeys in");
//            throw new RuntimeException("turkeys ran off");
        }catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            for (Throwable t: e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
        }
    }

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}
