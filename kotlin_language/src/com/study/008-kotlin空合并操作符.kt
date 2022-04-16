package com.study

fun main() {
    var name: String? = "haoxuan"
//    name = null
    println(name ?: "是null字符")
    println(name?.let { "$it" } ?: "是null字符")
}