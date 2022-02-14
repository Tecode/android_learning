package com.synchronizedMethod;

public class RunAccount {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank("haoxuan1009", 1000);
        DrawAccount drawAccount = new DrawAccount(bank);
        SaveAccount saveAccount = new SaveAccount(bank);
        Thread drawAccountThread = new Thread(drawAccount);
        Thread saveAccountThread = new Thread(saveAccount);

        drawAccountThread.start();
        saveAccountThread.start();
        drawAccountThread.join();
        saveAccountThread.join();

        System.out.println("现有余额：" + bank.getBalance());
    }
}
//  没有同步线程会导致输出错误
//        存款后的账户余额：1100.0
//        取款后的账户余额：900.0
//        现有余额：900.0

//  synchronized同步线程以后输出结果正确
//        取款后的账户余额：900.0
//        存款后的账户余额：1000.0
//        现有余额：1000.0