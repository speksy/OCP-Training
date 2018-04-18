package ocp._1.advancedClassesDesign.virtualMethodInvocation;

class TestClass {
    public static void main(String args[]) {
        Animal cow = new Cow();
        TestClass c = new TestClass();
        c.feedAnimal(cow);
    }
    private void feedAnimal(Animal animal) {
        animal.feed();
    }
}
