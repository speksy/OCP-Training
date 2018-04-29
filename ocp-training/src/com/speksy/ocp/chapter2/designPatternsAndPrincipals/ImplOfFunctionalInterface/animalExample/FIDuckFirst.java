package com.speksy.ocp.chapter2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

// lambda1:  () -> new Duck();
// lambda2: Duck::new
@FunctionalInterface
public interface FIDuckFirst {
    public Duck test();
}
