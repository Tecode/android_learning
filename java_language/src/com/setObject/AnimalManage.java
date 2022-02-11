package com.setObject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AnimalManage {
    public static void main(String[] args) {
        Koala koala001 = new Koala("考考",2,"澳大利亚本土");
        Koala koala002 = new Koala("拉拉",2,"中华田园考拉");
        Koala koala003 = new Koala("拉拉",2,"中华田园考拉");


        Set animalSet = new HashSet();
//        这里可以添加重复的对象，它们是两个不同的实例
        animalSet.add(koala001);
        animalSet.add(koala002);
        animalSet.add(koala003);

        Iterator iterator = animalSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        Koala{名字：'拉拉', 年龄：2, 品种：'中华田园考拉'}
//        Koala{名字：'考考', 年龄：2, 品种：'澳大利亚本土'}
//        Koala{名字：'拉拉', 年龄：2, 品种：'中华田园考拉'}
    }
}
