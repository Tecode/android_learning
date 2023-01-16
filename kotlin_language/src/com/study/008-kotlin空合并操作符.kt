package com.study

fun main() {
    val name: String? = "haoxuan"
//    name = null
    println(name ?: "是null字符")
    println(name?.let { it } ?: "是null字符")
}