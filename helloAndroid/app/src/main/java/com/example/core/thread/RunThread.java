package com.example.core.thread;

public class RunThread extends Thread {
    @Override
    public void run() {
        runThread();
    }

    private void runThread() {
        System.out.println("我是一个线程中的方法");
    }
}
