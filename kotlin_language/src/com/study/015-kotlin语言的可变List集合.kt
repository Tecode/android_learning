package com.study

fun main() {
    //    不可变集合
    val list = listOf<String>("Element", "Go", "Kotlin", "Java")
    val mutableList = mutableListOf("Javascript", "Typescript", "Go", "Kotlin", "Java")
    mutableList.add("PHP")
    println(mutableList) // [Javascript, Typescript, Go, Kotlin, Java, PHP]
    //    list 没有add、remove方法
    mutableList.remove("PHP")
    println(mutableList) // [Javascript, Typescript, Go, Kotlin, Java]
    // 将不可不变集合转化为可变集合
    val list002 = list.toMutableList()
    list002.add("C++")
    println(list002) // [Element, Go, Kotlin, Java, C++]
}