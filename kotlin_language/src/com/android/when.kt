package com.android

fun main() {
    methodFunc(300)
}

var methodFunc: (Int) -> Unit = { value: Int ->
    when (value) {
        in 1..10 -> println("一个大于1小于10的数")
        else -> println("其它数")
    }
}