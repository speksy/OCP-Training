package ocp._1.advancedClassesDesign.virtualMethodInvocation;

public class PlayWithAnimal {
    public static void main(String args[]) {
        Animal animal = new Lion();
        animal.printName();
        // this will print ???. The name declared in Lion would only be used if name was referred to
        //from Lion (or a subclass of Lion.) But no matter how you call printName(), it will use the
       // AnimalMutable’s name, not the Lion’s name.

        animal.careFor();
        // this will print toss in meat because Lion have overridden method play();

    }
}
