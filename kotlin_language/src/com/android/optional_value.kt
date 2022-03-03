package com.android

// Kotlin语言可空性特点
// 快捷键psvm

fun main() {
    var name: String? = "haoxuan"
//    name = null // 报错
    name = null
    println(name?.capitalize())
}