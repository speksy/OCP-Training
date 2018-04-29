package com.speksy.ocp.chapter2.designPatternsAndPrincipals.designPatterns.builderPattern;

import java.util.Arrays;

public class BuilderTest {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
        Animal duck = duckBuilder.build();

        Animal flamingo = new AnimalBuilder()
                .setFavoriteFoods(Arrays.asList("agile","insects"))
                .setSpecies("flamingo").build();
    }
}
