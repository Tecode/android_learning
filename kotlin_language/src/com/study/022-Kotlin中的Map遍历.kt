package com.study

fun main() {
    val map: Map<String, Int> = mapOf(Pair("A", 10), Pair("B", 20))
    map.forEach {
        println("key:${it.key} value:${it.value}")
    }

    map.forEach { (key, value) ->
        println("key:$key value:$value")
    }

    for (entry in map) {
        println(entry.key)
    }
}