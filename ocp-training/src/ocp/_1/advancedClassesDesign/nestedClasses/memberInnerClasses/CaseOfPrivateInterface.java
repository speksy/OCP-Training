package ocp._1.advancedClassesDesign.nestedClasses.memberInnerClasses;

public class CaseOfPrivateInterface {
    private interface Secret {
        public void shh();
    }
    class DontTell implements Secret {
        public void shh(){ }
    }
}
