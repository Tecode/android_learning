package com.android

// Unit相当于java的void
// psvm快速创建main函数
fun main(): Unit {
    println("hello kotlin");
    println(sum(number001 = 23, number002 = 5))
//    when条件语句
    when(sum(number001 = 0, number002 = 0)){
        in 1..10 -> println("差")
        in 11..20 -> println("很好")
        in -5..0 -> TODO("none") // Nothing
    }
}

private fun sum(number001: Int, number002: Int): Int {
    return number001 + number002;
}