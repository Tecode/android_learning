package com.android

fun main() {
    var len = "Hello Kotlin".count()
    println(len)
    var len002 = "Hello Kotlin".count {
//        it相当于Hello Kotlin" 字符char
        it == 'l';
    }
    println(len002)
    println(anonymousFunction(2, 3, 4))
}

// 匿名函数实现参数传参
val anonymousFunction: (Int, Int, Int) -> String = { number001, number002, number003 ->
    "number001:$number001 - number002:$number002 - number003:$number003"
}