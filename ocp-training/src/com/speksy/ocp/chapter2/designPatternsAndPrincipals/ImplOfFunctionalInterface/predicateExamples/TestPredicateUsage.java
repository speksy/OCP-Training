package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.predicateExamples;

import com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample.Animal;

import java.util.function.Predicate;

public class TestPredicateUsage {
    private static void print (Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }
    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false),Animal::canHop);
    }
}
