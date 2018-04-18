package ocp._1.advancedClassesDesign.instanceOf;

public class TestInstanceOf {
    public static void main(String args[]){
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; //true
        boolean b3 = hippo instanceof Elephant; //false
        boolean b4 = hippo instanceof Object; // true

        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; // false

        Hippo anotherHippo = new Hippo();

        // following code does not compile because Hippo class doesn't extend Elephant
//        boolean b6 = anotherHippo instanceof  Elephant;

        // following code compile successfully because later Hippo can implement Mother class
        boolean b7 = hippo instanceof Mother;


    }
}
