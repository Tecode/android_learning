package com.android;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
