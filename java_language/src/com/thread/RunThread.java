package com.thread;

class RunThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(getName() + "子线程开始运行");
    }
}
