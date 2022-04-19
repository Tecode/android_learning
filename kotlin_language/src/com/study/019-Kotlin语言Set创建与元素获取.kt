package com.study

// set 定义 不允许重复
// 普通方式elementAt 会越界崩溃
// elementAtOrNull elementAtOrElse
fun main() {
    val setList = setOf(10, 34, 56, 20)
    println(setList.elementAt(0))
    println(setList.elementAt(1))
    println(setList.elementAt(2))
    println(setList.elementAtOrElse(4) { "数组越界了" }) // 数组越界了
    println(setList.elementAtOrNull(4)) // null
}