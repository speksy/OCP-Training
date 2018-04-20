package ocp._2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

import ocp._2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample.Animal;

// lambda1: new Animal("kangaroo",true,false),Animal::canHop
// lambda2: new Animal("brat na kangaroo",true,false),a -> a.canHop()
@FunctionalInterface
public interface CheclTrait {
    public boolean test(Animal a);
}
