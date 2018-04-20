package ocp._2.designPatternsAndPrincipals.implementingPolymorphism._1;

public class Dolphin implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("whistle");
    }
}
