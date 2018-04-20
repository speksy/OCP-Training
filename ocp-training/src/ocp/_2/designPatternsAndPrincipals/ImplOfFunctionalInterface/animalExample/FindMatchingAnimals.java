package ocp._2.designPatternsAndPrincipals.ImplOfFunctionalInterface.animalExample;

public class FindMatchingAnimals {
    private static void findMatchingAnimalByAction(Animal animal, CheclTrait trait){
        if (trait.test(animal))
            System.out.println(animal);
    }

    // Duck lambda1 test
    // () -> new Duck()
    // Duck::new
    private static void getFirstDuck(FIDuckFirst ducking) {
        System.out.println(ducking.test());
    }
    // Duck lambda2 test
//    Duck pate = new Duck();
//    pate ,d-> {return d.quack();};
//    pate ,(Duck d) -> d.quack();
//    pate ,Duck::quack
    private static void getSecondDuck(Duck duck, FIDuckSecond ducking) {
        System.out.println(ducking.test(duck));
    }

    // Duck lambda3 test
    // animal, pate, (Animal a,Duck d )-> d.quack()
    // animal, pate, (a,d)-> d.quack()
    private static void getThirdDuckIfAnimal(Animal animal, Duck duck, FIDuckThird ducking) {
        System.out.println(ducking.test(animal,duck));
    }

    public static void main(String[] args) {
        // all examples are valid
        findMatchingAnimalByAction(new Animal("fish",false,false), Animal::canHop);
        findMatchingAnimalByAction(new Animal("kangaroo",true,false),Animal::canHop);
        findMatchingAnimalByAction(new Animal("brat na kangaroo",true,false), a -> a.canHop());

        // FIDuckFirst test
        getFirstDuck(()-> new Duck());
        getFirstDuck(Duck::new);

        // FIDuckSecond test
        Duck pate = new Duck();
        getSecondDuck(pate ,d-> {return d.quack();});
        getSecondDuck(pate ,(Duck d) -> d.quack());
        getSecondDuck(pate ,Duck::quack);

        // FIDuckThird test
        Animal animal = new Duck();
        getThirdDuckIfAnimal(animal, pate, (Animal a,Duck d )-> d.quack());
        getThirdDuckIfAnimal(animal, pate, (a,d)-> d.quack());
    }
}
