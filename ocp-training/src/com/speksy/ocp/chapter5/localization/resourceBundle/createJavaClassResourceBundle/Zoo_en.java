package com.speksy.ocp.chapter5.localization.resourceBundle.createJavaClassResourceBundle;

import java.util.ListResourceBundle;
// Java class as Resource bundle

// advantages:
// You can use a value type that is not a String
// You can create the value of the properties at runtime
public class Zoo_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Hello"},
                {"open", "The zoo is open"} };
    }
}
