package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.immutableObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableModifingTest {
    public static void main(String[] args) {
        // Create new Animal instance
        AnimalImmutable lion = new AnimalImmutable("lion", 5, Arrays.asList("meat", "moremeat"));

        // Create new Animal instance using data from the first instance
        List<String> favoriteFoods = new ArrayList<>();
        for (int i = 0; i < lion.getFavoriteFoodsCount(); i++) {
            favoriteFoods.add(lion.getFavoriteFood(i));
        }

        // UpdatedLion
        AnimalImmutable updatedLion = new AnimalImmutable(lion.getSpecies(), lion.getAge() + 1, favoriteFoods);
    }
}
