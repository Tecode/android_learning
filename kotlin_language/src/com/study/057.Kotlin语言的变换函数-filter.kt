package com.study

fun main() {
    val listData = listOf("Go", "Swift", "Java", "javascript", "Kotlin")
    val list = listData.filter {
        it != "Java"
    }
    val list2 = listOf(listData).flatMap { it ->
        it.filter {
            !it.contains("Go")
        }
    }.map {
        it
    }
    println(list)
    println(list2)
}

//[Go, Swift, javascript, Kotlin]
//[Swift, Java, javascript, Kotlin]
