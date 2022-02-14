package com.synchronizedMethod;

public class DrawAccount implements Runnable {
    Bank bank;
    public DrawAccount(Bank value) {
        this.bank = value;
    }
    @Override
    public void run() {
        bank.drawAccount();
    }
}
