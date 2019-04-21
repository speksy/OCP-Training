package com.speksy.ocp.chapter5.localization.resourceBundle.handlingVarInsideRB;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 * @author speksy
 */
public class TestParamInResource {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        // resources/ByName_en_US.properties
        ResourceBundle rb = ResourceBundle.getBundle("ByName", locale);
        String format = rb.getString("helloByName");
        String formatted = MessageFormat.format(format, "Tammy");
        System.out.println(formatted);
    }
}
