package com.study

fun main() {
    val listData = listOf("Go", "Swift", "Java", "javascript", "Kotlin")
    val data = listOf(12, 20, 30)
    val zip: List<Pair<String, Int>> = listData.zip(data)
    zip.toMap().map {
        "Key:${it.key},Value:${it.value}"
    }.map {
        println(it)
//        Key:Go,Value:12
//        Key:Swift,Value:20
//        Key:Java,Value:30
    }
}