package com.study

// 普通类
class Human007(val name: String, private val age: Int) {
    // 注意事项：component0顺序必须是component1 component2和成员一一对应
    operator fun component1() = name
    operator fun component2() = age
}

// 数据类
data class Human008(val name: String, val age: Int)

fun main() {
    val (name, age) = Human007("Haoxuan", 12)
    println("普通类解构后：name-$name age-$age")
    val (name2, age2) = Human008("Elen", 28)
    println("普通类解构后：name-$name2 age-$age2")
}

//普通类解构后：name-Haoxuan age-12
//普通类解构后：name-Elen age-28