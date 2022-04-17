package com.study

fun main() {
    val mutableList = mutableListOf("Go", "Java", "Typescript")
    for (item in mutableList) {
        println("$item")
    }

    mutableList.forEach { s ->
        println(s)
    }

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