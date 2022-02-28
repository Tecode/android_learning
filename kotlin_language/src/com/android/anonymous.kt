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
    println(func002("12", "23"))
    println(fun003())
    println(func004())
}

// 匿名函数实现参数传参
val anonymousFunction: (Int, Int, Int) -> String = { number001, number002, number003 ->
    "number001:$number001 - number002:$number002 - number003:$number003"
}

// 匿名函数自动推断，自动根据返回的数据确定返回类型
val func002 = {value001: String, value002: String -> value001 == value002 }

// 匿名函数 == lambda表达式，匿名函数属于lambda
val fun003 = { true }

val func004 = { 3.1415 }