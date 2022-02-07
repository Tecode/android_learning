package com.android;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello java");
        int number1 = 45;
        char x = 'x';
        double c  = 2.0;
        float d = 2.4345F;
        float number2 = number1;
        System.out.println(number2);

        ArrayList<String> list = new ArrayList<>();
        list.add("book");
        list.add("pad");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(x > 0);
        System.out.println(++d);
        System.out.println(c);
    }
}
