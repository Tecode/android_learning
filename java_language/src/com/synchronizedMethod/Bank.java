package com.synchronizedMethod;

public class Bank {
    String bankName;
    double balance;

    public Bank(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public synchronized void setAccount() {
        double balance002 = getBalance();
        balance002 += 100;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setBalance(balance002);
        System.out.println("存款后的账户余额：" + balance);
    }

    public synchronized void drawAccount() {
        double balance002 = getBalance();
        balance002 -= 100;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setBalance(balance002);
        System.out.println("取款后的账户余额：" + balance);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
