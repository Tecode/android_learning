package com.study

fun main() {
//    == 值内容比较 相当于java的eauals
//    === 引用的比较
    val name001: String = "Haoxuan"
    val name002: String = "Haoxuan"
    val name003: String = "OK"

    println(name001.equals(name002)) // java
    println(name001 == name002) // kt

// 引用的比较
    println(name001 === name002) // true
    println(name001 == name003) // false

    val name004 = "haoxuan".capitalize()
    println(name004 === name001)
}