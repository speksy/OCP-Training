package ocp._2.designPatternsAndPrincipals.designPatterns.singleton;

// Instantiation using a static block
// Singleton
public class StaffRegister {
    // Some data
    private static final StaffRegister instance;
    static {
        instance = new StaffRegister();
    }

    private StaffRegister() {
    }

    public static StaffRegister getInstance(){
        return instance;
    }

    // Data access methods...
}
