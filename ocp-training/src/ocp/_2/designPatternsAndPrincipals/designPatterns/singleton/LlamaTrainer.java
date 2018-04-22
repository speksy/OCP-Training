package ocp._2.designPatternsAndPrincipals.designPatterns.singleton;

public class LlamaTrainer {

    public boolean feedLlamas(int numberOfLamas) {
        int amountNeeded = 5 * numberOfLamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getHayQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);

        if (fed) {
            System.out.println("Llamas have been fed!");
        }

        return fed;
    }
}
