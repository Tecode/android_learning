package com.android;

public class Function {
    public static void main(String[] args) {
        Function function = new Function();
        function.print("函数调用");
        System.out.println(function.getSum());
        System.out.println(function.arrLength(new int[6]));
    }

    public void print(String value) {
        System.out.println(value);
    }

    public int getSum() {
        int a = 34;
        int b = 20;
        return a + b;
    }

    // 不需要实例化，可以直接调用方法
    public int arrLength(int[] arr) {
        for (int value: arr) {
            System.out.println("For输出" + "value" + value + getSum());
        }
        return arr.length;
    }
}
