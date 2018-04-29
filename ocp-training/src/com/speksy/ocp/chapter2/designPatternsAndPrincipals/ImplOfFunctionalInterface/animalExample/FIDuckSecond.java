package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

//          object Input body
// lambda1: pate ,Duck::quack
// lambda2: pate ,d-> {return d.quack();}
// lambda3: pate ,(Duck d) -> d.quack()
@FunctionalInterface
public interface FIDuckSecond {
    public String test(Duck d);
}
