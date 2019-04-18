package com.speksy.ocp.chapter5.localization.addingInternalizationLocalization;

import java.util.Locale;

public class PickingLocale {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        // US // can have a language without a country, but not the reverse
        // enUS // missing underscore
        // US_en // the country and language are reversed
        // EN // language must be lowercase

        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN


        // Java will let you create a Locale with an invalid language or country. However, it will
        // not match the Locale that you want to use and your program will not behave as expected.

        // Using builder pattern
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println();
        System.out.println(Locale.getDefault());
        Locale locale1 = new Locale("fr");
        Locale.setDefault(locale1);
        System.out.println(locale1.getDefault());
    }
}
