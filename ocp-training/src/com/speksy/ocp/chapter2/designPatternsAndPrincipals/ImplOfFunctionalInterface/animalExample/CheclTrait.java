package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

// lambda1: new AnimalMutable("kangaroo",true,false),AnimalMutable::canHop
// lambda2: new AnimalMutable("brat na kangaroo",true,false),a -> a.canHop()
@FunctionalInterface
public interface CheclTrait {
    public boolean test(Animal a);
}
