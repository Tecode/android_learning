package com.study

fun main() {
    val map: Map<String, Float> = mapOf("width" to 23.0f, "height" to 10.0f)
    val map2 = mapOf(Pair("name", "haoxuan"), Pair("address", "CD"))
    // map类型数据的读取
    // getOrElse
    println(map.getOrElse("height") { -1 })
    // getOrDefault
    println(map.getOrDefault("ack", -1f))
}