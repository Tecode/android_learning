package com.study

fun main() {
    val listData = listOf("Go", "Swift", "Java", "javascript", "Kotlin")
    val list = listData.map { "编程语言：$it" }.map { "$it 长度：${it.length}" }
    val arrayList = arrayListOf("Go", "Swift", "Java", "javascript", "Kotlin")
    println(list)
    arrayList.add("English")
    println(arrayList)
}

//[编程语言：Go 长度：7, 编程语言：Swift 长度：10, 编程语言：Java 长度：9, 编程语言：javascript 长度：15, 编程语言：Kotlin 长度：11]
//[Go, Swift, Java, javascript, Kotlin, English]