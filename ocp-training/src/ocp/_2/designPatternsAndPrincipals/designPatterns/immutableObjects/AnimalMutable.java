package ocp._2.designPatternsAndPrincipals.designPatterns.immutableObjects;

import java.util.ArrayList;
import java.util.List;

public class AnimalMutable {
    private final List<String> favoriteFoods;

    public AnimalMutable(List<String> favoriteFoods){
        if (favoriteFoods == null) {
            throw new RuntimeException("favorite food is required!");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
        return favoriteFoods;
    }
}
