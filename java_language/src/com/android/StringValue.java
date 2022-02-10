package com.android;

import java.util.Locale;

public class StringValue {
    public static void main(String[] args) {
        String value = "Java编程 基础";
        System.out.println(value.length());
        System.out.println(value.charAt(8));
        System.out.println(value.split(" "));
        System.out.println(value.substring(4,6));
        System.out.println(value.indexOf("基础"));

        StringBuilder value02 = new StringBuilder("Hello");
        value02.append(",");
        value02.append("Java");
        System.out.println(value02.toString().toUpperCase(Locale.ROOT));
    }
}
