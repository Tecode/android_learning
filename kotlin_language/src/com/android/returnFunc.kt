package com.android

// 函数返回一个函数，闭包
fun main() {
    val newFun = curry("计算结果：")
    newFun(20, 45)
}

fun curry(name: String): (Int, Int) -> Unit {
    return { value001: Int, value002: Int -> println("$name ${value001 + value002}") }
}