package com.speksy.ocp.chapter5.localization.stringClass;

public class StringsDemo {
    public static void main(String[] args) {
        // Comparison
        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");
        System.out.println(s1 == s2); // true - same object in the pool
        System.out.println(s1 == s3); // false - different objects
        System.out.println(s1.equals(s3)); // true ---

        // Concatenation
        String s4 = "1" + 2 + 3;
        String s5 = 1 + 2 + "3";
        System.out.println(s4); // 123
        System.out.println(s5); // 33

        // Other operations
        String s = "abcde";
        System.out.println(s.trim().length()); //5
        System.out.println(s.charAt(4)); // e
        System.out.println(s.indexOf('3')); //4
        System.out.println(s.indexOf("de")); //3
        System.out.println(s.substring(2, 4).toUpperCase()); // CD
        System.out.println(s.replace('a','1')); //1bcde
        System.out.println(s.contains("DE")); // dalse
        System.out.println(s.startsWith("a")); // true

        // StringBuilder
        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
        System.out.println(b.length()); // 6
        System.out.println(b.indexOf("-")); // 5
        System.out.println(b.charAt(2)); //3

        StringBuilder b2 = b.reverse();
        System.out.println(b.toString()); // -54321
        System.out.println(b == b2); // true - because its the same object

        StringBuffer sb1 = new StringBuffer("abcde");
        sb1.insert(1, "-").delete(3, 4);
        System.out.println(sb1); // a-bde
        System.out.println(s.substring(2,4)); //bd
    }
}
