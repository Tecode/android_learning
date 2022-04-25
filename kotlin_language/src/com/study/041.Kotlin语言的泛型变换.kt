package com.study

class Human011<T>(val isMap: Boolean, val inputValue: T) {
    inline fun <R> map(mapAction: (T) -> R): R? = mapAction(inputValue).takeIf { isMap }
}

fun main() {
    val human = Human011(true, 1000)
    val value = human.map {
        it
        it.plus(10)
//        null
        "$it"
    }
    println("最后的输出$value") // 最后的输出1010
    println(value is String)
}