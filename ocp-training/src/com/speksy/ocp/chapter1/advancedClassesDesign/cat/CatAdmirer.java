package com.speksy.ocp.chapter1.advancedClassesDesign.cat;

public class CatAdmirer {
    public static void main(String args[]) {
        BigCat cat = new BigCat();
        // cat.name, cat.hasFur, cat.hasPaws compile because the class is in the same package
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        // Does not compile because of private access modifier
//        System.out.println(cat.id);
    }
}
