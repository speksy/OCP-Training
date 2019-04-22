package com.speksy.ocp.chapter6.usingTryWithResources;

public class StuckTurkeyCage implements AutoCloseable{
    public static void main(String[] args) {
//        try(StuckTurkeyCage stc = new StuckTurkeyCage()) { // DOES NOT COMPILE
//            System.out.println("put turkeys in");
//        }
        try(StuckTurkeyCage stc = new StuckTurkeyCage()) { // DOES NOT COMPILE
            System.out.println("put turkeys in");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // or add throws Exception to method
    }
    @Override
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
}
/*
ExampleOne is the best implementation. ExampleTwo throws Exception rather than
a more specific subclass, which is not recommended. ExampleThree has a side effect. It
changes the state of a variable. Side effects are not recommended.
* */
class ExampleOne implements AutoCloseable {
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}
class ExampleTwo implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
}
class ExampleThree implements AutoCloseable {
    static int COUNT = 0;
    public void close() {
        COUNT++;
    }
}