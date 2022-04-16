package com.study

// also类型返回类型，用于都是name本身，此条和apply一模一样
// also函数的匿名函数里面持有的是it==name
// 返回的永远是name本身，不会改变结果
fun main() {
    val name = "haoxuan"
    val name2: String = name.also {
        "hao"
        1234
        true
    }
    println(name2)
    name.also {
//        it == name
        println(it.first())
    }.also {
        println("$it")
    }
}