package com.android

// 匿名函数个具名函数
fun main() {
    sayName("haoxuan001", 8) {
        println(it)
    }
    sayName("haoxuan002", 10, ::sayNamed)
}

fun sayName(name: String, age: Int, func: (String) -> Unit) {
    func("$name 今年 $age 岁")
}

// 具名函数
fun sayNamed(msg: String) {
    println(msg)
}

//haoxuan001 今年 8 岁
//haoxuan002 今年 10 岁
