package com.study

// 可空类型扩展
fun String?.defaultValue(value: String) = println(this ?: "默认参数：$value")

fun main() {
    var name: String? = null
    name.defaultValue("limit")
    name = "haoxuan"
    name.defaultValue("limit")
}

//默认参数：limit
//haoxuan