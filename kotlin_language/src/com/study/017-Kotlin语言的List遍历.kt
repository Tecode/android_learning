package com.study

fun main() {
    val mutableList = mutableListOf("Go", "Java", "Typescript")
// 第一种遍历方式
    for (item in mutableList) {
        println("$item")
    }
// 第二种遍历方式
    mutableList.forEach { s ->
        println(s)
    }
// 第三种遍历方式
    mutableList.forEachIndexed  { item, index ->
        println("索引：$index 值：$item")
    }
}

//Go
//Java
//Typescript

//Go
//Java
//Typescript

//索引：Go 值：0
//索引：Java 值：1
//索引：Typescript 值：2