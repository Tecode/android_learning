package com.study

import kotlin.math.roundToInt

fun main() {
//    56.7885 56.3454
    val intValue = "56"
    val doubleValue = "56.7885"

    println(intValue.toIntOrNull()) // 56
    println(doubleValue.toIntOrNull() ?: "转为int出错") // null

    println(56.7885.toInt()) //56
    println(56.3454.toInt()) //56
    println(56.7885.roundToInt()) //57
    println(56.3454.roundToInt()) //56

    println("%.2f".format(56.7885)) //56.79
}
