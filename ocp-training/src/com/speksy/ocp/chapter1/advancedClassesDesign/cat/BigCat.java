package com.speksy.ocp.chapter1.advancedClassesDesign.cat;

public class BigCat {
    public String name = "Cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;
    public static void main(String args[]) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
        System.out.println(cat.id);
    }
}
