package com.synchronizedMethod;

public class SaveAccount implements Runnable {
    Bank bank;
    public SaveAccount(Bank value){
        this.bank = value;
    }
    @Override
    public void run() {
        bank.setAccount();
    }
}
