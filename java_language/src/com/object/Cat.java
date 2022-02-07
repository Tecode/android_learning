package com.object;

public class Cat extends Animal {
    public Cat(String value) {
        this.name = value;
        age = 5;
        System.out.println(this);
    }
    @Override
    public void run() {
        super.run();
        System.out.println("喵喵喵。。。");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("小猫猫");
        cat.run();
        System.out.println(cat.name + cat.age + "岁");
    }
}
