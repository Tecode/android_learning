package com.study

fun main() {
    val listData = listOf("Go", "Swift", "Java", "javascript", "Kotlin")
    val list = listData.flatMap {
        listOf("学习：$it 90", it,  "10009")
    }
    println(list)
}

//[学习：Go 90, Go, 10009, 学习：Swift 90, Swift, 10009, 学习：Java 90, Java, 10009, 学习：javascript 90, javascript, 10009, 学习：Kotlin 90, Kotlin, 10009]
