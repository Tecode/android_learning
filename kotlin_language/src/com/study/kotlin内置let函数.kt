package com.study

fun main() {
    val numberList = listOf<Int>(34, 5, 6, 7, 9, 12)
    val result = numberList.let {
//        匿名函数的最后一行，作为返回值，let的特点，apply永远返回本身
//        it == 集合本身
        it.first() + it.first() // 34 + 34
    }
    println(result) // 68
}