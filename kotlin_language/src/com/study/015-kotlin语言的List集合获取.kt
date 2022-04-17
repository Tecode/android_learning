package com.study

fun main() {
    val list = listOf<String>("Element", "Go", "Kotlin", "Java")
//    如果使用下标的方式获取数据数组越界会导致报错，最好使用getOrElse、getOrNull
    println(list.getOrElse(1) { "数组越界了" }) // Go
    println(list.getOrElse(4) { "数组越界了" }) // 数组越界了
    println(list.getOrNull(4) ?: "数组越界了")  // 数组越界了
}