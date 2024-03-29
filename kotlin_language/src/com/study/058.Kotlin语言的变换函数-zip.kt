package com.study

fun main() {
    val listData = listOf("Go", "Swift", "Java", "javascript", "Kotlin")
    val data = listOf(12, 20, 30)
    val zip: List<Pair<String, Int>> = listData.zip(data)
    println(zip)
//    [(Go, 12), (Swift, 20), (Java, 30)]
    zip.forEach {
        println(it)
    }
    zip.forEachIndexed { index, pair ->
        println("$pair index:$index")
    }
}
