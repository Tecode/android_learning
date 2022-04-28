package com.android;

public class kotlin_run_java {
    public static void is() {
        System.out.println("运行的是java代码");
    }

    public static void main(String[] args) {
        new JavaRunKotlin().run(); // 运行的是Kotlin代码
        JavaRunKotlin.Companion.kotlinRun(); // Kotlin的静态方法
    }
}
