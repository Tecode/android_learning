package com.runnable;

public class RunRunnable {
    public static void main(String[] args) {
        PrintRunnable printRunnable = new PrintRunnable();
//        创建线程
        Thread thread001 = new Thread(printRunnable);
        Thread thread002 = new Thread(printRunnable);
        thread001.start();
        thread002.start();
    }
}
//Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-1正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行
//        Thread-0正在运行