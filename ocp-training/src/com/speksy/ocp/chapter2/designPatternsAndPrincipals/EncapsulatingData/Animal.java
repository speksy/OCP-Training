package com.speksy.ocp.chapter2.designPatternsAndPrincipals.EncapsulatingData;
/*
■ Each animal has a non‐ null , non‐empty species field
■ Each animal has an age field that is greater than or equal to zero
* */
public class Animal {
    private String species;
    private int age;

    public Animal(String species) {
        this.setSpecies(species);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().length() == 0){
            throw new IllegalArgumentException("Species is required!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be a negative nunmber");
        }
        this.age = age;
    }
}
