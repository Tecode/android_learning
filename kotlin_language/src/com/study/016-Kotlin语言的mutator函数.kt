package com.study

fun main() {
    val mutableList = mutableListOf("Go", "Java", "Typescript")
    // 添加元素类似add方法
    mutableList += "Javascript"
    println(mutableList) // [Go, Java, Typescript, Javascript]
    // 移除指定元素
    mutableList.removeIf { it.contains("Java") }
    println(mutableList) // [Go, Typescript]
    // 清空所有的元素
    mutableList.removeIf { true }
    println(mutableList) // []
}