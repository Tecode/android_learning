package com.study

// set 定义 不允许重复
// 普通方式elementAt 会越界崩溃
// elementAtOrNull elementAtOrElse
fun main() {
    val setList = mutableSetOf(10, 34, 56, 20)
    setList += 90
    setList += 100
    setList.add(80)
    setList.remove(34)
    println(setList) // [10, 56, 20, 90, 100, 80]
}