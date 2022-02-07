package com.object;

import java.util.InputMismatchException;
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
        try {
            cat.throwsError();
        } catch (InputMismatchException error) {
            error.printStackTrace();
            System.out.println("捕获InputMismatchException成功---");
        } catch (Exception error) {
            System.out.println("其他错误");
        }
    }

    // 错误捕获
    public void catchErrorFunc() {
        try {
            System.out.println("请输入年龄：");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("需要陪同才可以入住！！");
            }
//            java.lang.Exception: 需要陪同才可以入住！！
//            at com.object.Cat.catchErrorFunc(Cat.java:41)
//            at com.object.Cat.run(Cat.java:16)
//            at com.object.Cat.main(Cat.java:22)
        } catch (Exception error) {
            error.printStackTrace();
            System.out.println("捕获错误成功---");
        }
    }

    // throws抛出错误

    /**
     * 测试接收数据
     * @throws InputMismatchException
     */
    public void throwsError() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }
}
