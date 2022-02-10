package com.android;

import java.util.ArrayList;
import java.util.List;

public class ListOperate {
    public static void main(String[] args) {
//        创建List放入数据
        List<String> arrList = new ArrayList<>();
        arrList.add("Java");
        arrList.add("Swift");
        arrList.add("Go");
        arrList.add("C++");
        for (String value : arrList)  {
            System.out.println(value);
        }
        System.out.println("------------------------");
//        修改
        arrList.set(3, "C");
        for (String value : arrList)  {
            System.out.println(value);
        }
        System.out.println("------------------------");
//        删除
        arrList.remove(0);
        for (String value : arrList)  {
            System.out.println(value);
        }
//        插入
        arrList.add(1, "Java Script");
        for (String value : arrList)  {
            System.out.println(value);
        }

    }
}
