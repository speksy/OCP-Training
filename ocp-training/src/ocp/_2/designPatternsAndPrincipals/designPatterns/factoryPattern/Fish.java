package ocp._2.designPatternsAndPrincipals.designPatterns.factoryPattern;

public class Fish extends Food{
    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());
    }
}
