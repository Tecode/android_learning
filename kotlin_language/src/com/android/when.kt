package com.android

fun main() {
    methodFunc(300)
}

var methodFunc: (Int) -> Unit = { value: Int ->
    when (value) {
        in 1..10 -> println("一个大于1小于10的数")
        in 100..400 -> println("这个数是：$value")
        else -> println("其它数")
    }
}