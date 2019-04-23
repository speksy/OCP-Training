package com.speksy.ocp.chapter6.usingTryWithResources.puttingItTogether;

public class Auto implements AutoCloseable {
    /*
    ■ Resources are closed after the try clause ends and before any catch/finally clauses.
    ■ Resources are closed in the reverse order from which they were created.
    * */

    int num;

    Auto(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
        /* Output:  - !!! java close in reverse order resources when try block is finished

        Close: 2
        Close: 1
        ex
        finally

        * */
    }

    @Override
    public void close() {
        System.out.println("Close: " + num);
    }
}
