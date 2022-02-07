package com.object;

import java.util.Scanner;

public class Cat extends Animal {
    public Cat(String value) {
        this.name = value;
        age = 5;
        System.out.println(this);
    }
    @Override
    public void run() {
        super.run();
        this.catchErrorFunc();
        System.out.println("喵喵喵。。。");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("小猫猫");
        cat.run();
        System.out.println(cat.name + cat.age + "岁");
    }
// 错误捕获
    public  void catchErrorFunc() {
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("捕获错误成功---");
        }
    }
}
