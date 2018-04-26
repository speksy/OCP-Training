package ocp._2.reviewQuestions_2._9;
/*
What changes need to be made to make the following singleton pattern correct? (Choose all
that apply.)

A. None; the singleton pattern is properly implemented.
B. Rename cheetahManager to instance.
C. Rename getCheetahManager() to getInstance().
D. Change the access modifier of cheetahManager from public to private.
E. Mark cheetahManager final.
F. Add synchronized to getCheetahManager().

Results: D) F)
* */
public class CheetahManager {
    private static CheetahManager cheetahManager;
    private CheetahManager() {}
    public synchronized static CheetahManager getCheetahManager() {
        if (cheetahManager == null) {
            cheetahManager = new CheetahManager();
        }
        return cheetahManager;
    }

    // Other implementation for thread safe getCheetahManager
//    public synchronized static CheetahManager getCheetahManager() {
//        if (cheetahManager == null) {
//            synchronized (CheetahManager.class){
//                if (cheetahManager == null) {
//                    cheetahManager = new CheetahManager();
//                }
//            }
//
//        }
//        return cheetahManager;
//    }
}
