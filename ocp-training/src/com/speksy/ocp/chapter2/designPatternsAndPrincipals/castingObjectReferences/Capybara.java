package com.speksy.ocp.chapter2.designPatternsAndPrincipals.castingObjectReferences;

public class Capybara extends Roden {
    public static void main(String[] args) {
        Roden roden = new Roden();
        // ClastCastException at runtime
        // Use instanceof operator to avoid throwing ClastCastException at runtime;
        if (roden instanceof Capybara) {
            Capybara capybara = (Capybara) roden;
        }
    }
}
