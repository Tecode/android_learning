package com.study

fun main() {
    val list: List<String> = listOf("value001", "value002", "value003")
    val (value1, value2) = list
    println("$value1 - $value2") //value001 - value002
//    只接收后面两个元素，用_内部可以不接收赋值
    val (_, value3, value4) = list
    println("$value3 - $value4") //value002 - value003
}
