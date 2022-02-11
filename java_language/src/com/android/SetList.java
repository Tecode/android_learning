package com.android;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
//  值不会重复
        Set setList = new HashSet();
        setList.add("Red");
        setList.add("Red");
        setList.add("Yellow");
        setList.add("Black");
//  迭代输入值
        Iterator it = setList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        Red
//        Yellow
//        Black
    }
}
