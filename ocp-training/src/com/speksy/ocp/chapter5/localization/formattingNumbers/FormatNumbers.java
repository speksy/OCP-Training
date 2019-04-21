package com.speksy.ocp.chapter5.localization.formattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String[] args) {
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

        // 266,666
        // 266.666
        // 266 666

        double price = 48;
        NumberFormat usPriceNF = NumberFormat.getCurrencyInstance();
        System.out.println(usPriceNF.format(price));
        // default locale $48.00
        NumberFormat usPriceNF2 = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.println(usPriceNF2.format(price));
        // korea ￦48

        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        String s = "40.45";
        try {
            System.out.println(en.parse(s)); // 40.45
            System.out.println(fr.parse(s)); // 40
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
