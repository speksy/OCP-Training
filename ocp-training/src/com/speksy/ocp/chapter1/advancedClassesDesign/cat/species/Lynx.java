package com.speksy.ocp.chapter1.advancedClassesDesign.cat.species;

import com.speksy.ocp.chapter1.advancedClassesDesign.cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String args[]) {
        BigCat cat = new BigCat();
        // cat.name compiles because of public access modifier
        System.out.println(cat.name);
        /* All other does not compile because of access modifiers
            in BigCat
        */

//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
    }
}
