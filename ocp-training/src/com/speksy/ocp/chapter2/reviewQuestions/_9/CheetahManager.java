package com.speksy.ocp.chapter2.reviewQuestions._9;
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

    D, F. A is incorrect, as there are definitely some problems with the singleton implementation.
    B and C are incorrect, as naming of the instance variable and access method are not
    required as part of the pattern. The public modifier on the cheetahManager instance
    means that any class can access or even replace the instance, which breaks the singleton
    pattern; hence D is required to fix the implementation. E is incorrect, as marking the
    instance final would prevent lazy instantiation and as the code would not compile. F is
    also required, since without this step two threads could create two distinct instances of the
    singleton at the same time, which would violate the singleton pattern.
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
