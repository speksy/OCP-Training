package com.speksy.ocp.chapter5.localization.resourceBundle;

import java.util.*;

public class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(france);
    }

    private static void printProperties(Locale locale) {
        // Resources should be in resource folder and marked as resource from module settings
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}