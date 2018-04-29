package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

public class Duck extends Animal {
    String name = "Djon";

    public Duck() {

    }
    public Duck(String species, boolean canHop, boolean canSwim) {
        super(species, canHop, canSwim);
    }

    public String toString(){return name;}

    public String quack(){
        return "QuaaaK";
    }
}
