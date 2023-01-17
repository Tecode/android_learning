package com.study

private infix fun <A, B> A.go(that: B) {
    println(this)
    println(that)
}

fun main() {
// map自带的中缀表达式
    println(mapOf("零" to 0)["零"])

    "2023-01-16" go 2023
    618.go(2023)
}

//0
//2023-01-16
//2023
//618
//2023