package com.object;

public class CustomError extends Exception {
    public CustomError(){
        super("自定义错误--需要陪同才可以入住！");
    }
}
