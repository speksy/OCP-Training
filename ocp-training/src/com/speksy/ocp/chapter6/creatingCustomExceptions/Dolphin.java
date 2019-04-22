package com.speksy.ocp.chapter6.creatingCustomExceptions;

class CannotSwimException extends Exception {
    public CannotSwimException(){
        super();
    }

    public CannotSwimException(Exception e) {
        super(e);
    }

    public CannotSwimException(String message) {
        super(message);
    }
}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}
public class Dolphin {
    public void swim() throws CannotSwimException {
        //logic here
    }
    public static void main(String[] args) {
        System.out.println("Test CannotSwimException default");
        try {
            throw new CannotSwimException();
        } catch (CannotSwimException e) {
            e.printStackTrace();
        }

        System.out.println("Test CannotSwimException wrapped exception");
        try {
            throw new CannotSwimException(new RuntimeException());
        } catch (CannotSwimException e) {
            e.printStackTrace();
        }

        System.out.println("Test CannotSwimException with message");
        try {
            throw new CannotSwimException("broken fin");
        } catch (CannotSwimException e) {
            e.printStackTrace();
        }
    }
}
