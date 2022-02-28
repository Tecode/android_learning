package com.android

fun main() {
    val itFunc:(String) -> String = { "$it" }
//    只有一个参数的时候默认添加it
    println(itFunc("it 参数默认添加"))
}