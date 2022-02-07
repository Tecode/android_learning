package com.object;

public class Animal {
    String name;
    int age;
    public void run() {
        System.out.println("动物发出叫声");
        this.nickname();
    }

    private void nickname() {
        System.out.println("private:昵称叫财财");
    }
}
