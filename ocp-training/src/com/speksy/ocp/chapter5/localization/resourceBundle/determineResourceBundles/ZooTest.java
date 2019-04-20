package com.speksy.ocp.chapter5.localization.resourceBundle.determineResourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ZooTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitor"));

        // Output
        // Hello. Vancouver Zoo is open Canada visitor
    }
}
