package ocp._2.designPatternsAndPrincipals.designPatterns.immutableObjects;

import java.util.ArrayList;
import java.util.List;
// Mark class as final prevent overriding of methods
public final class AnimalImmutable {
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public AnimalImmutable(String species, int age, List<String> favoriteFoods) {
        this.species = species;
        this.age = age;
        if (favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required!");
        }
        // create new ArrayList from favoriteFoods parameter
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFood(int index) {
        return favoriteFoods.get(index);
    }
}
