package com.thread;

public class JavaThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main0");
        RunThread runThread001 = new RunThread();
        RunThread runThread002 = new RunThread();
        runThread002.start();
        runThread001.start();
//        runThread001抢占资源优先执行
        runThread001.join();
        System.out.println("main1");
        int priority = Thread.currentThread().getPriority();
        System.out.println("优先级" + priority);
    }
}

//main0
//        Thread-0子线程开始运行
//        Thread-1子线程开始运行
//        main1
//        优先级5