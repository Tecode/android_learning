package com.study

fun main() {
//    正确读取Java代码的数据
    val money: Int? = KotlinInteraction().money
    val name:String? = KotlinInteraction().name
    println(money)
    println(name?.length)
}