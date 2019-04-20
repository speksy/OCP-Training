package com.speksy.ocp.chapter5.localization.resourceBundle.resourceBundles;

import java.util.*;

public class Tax_en_US extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "com.speksy.ocp.chapter5.localization.resourceBundle.resourceBundles.Tax",
                Locale.US);
        System.out.println(rb.getObject("tax"));
    }

    private class UsTaxCode {
        private String taxCode;

        UsTaxCode (){
            taxCode = "RB123";
        }

        @Override
        public String toString() {
            return taxCode;
        }
    }
}
