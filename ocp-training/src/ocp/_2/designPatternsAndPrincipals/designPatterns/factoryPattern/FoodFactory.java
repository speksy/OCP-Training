package ocp._2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public class FoodFactory {
    public static Food getFood(String animalName) {
        switch (animalName) {
            case "zebra": return new Hay(100);
            case "rabbit": return new Pallets(5);
            case "goat": return new Fish(10);
        }

        // Good practice to throw an exception if no matching subclass could be found
        throw new UnsupportedOperationException("Unsupported animal: "+animalName);
    }
}
