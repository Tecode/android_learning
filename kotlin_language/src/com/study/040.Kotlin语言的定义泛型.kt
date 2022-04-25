package com.study

// 泛型类
class Generics<T>(private val value: T, private val isNull:Boolean = false) {
    fun runMethod() = println("泛型类Value：$value")
    fun getObject() = value.takeIf { isNull }
}

//

fun main() {
    Generics("字符串").runMethod()
    Generics(23).runMethod()
    Generics(23.5f).runMethod()
    Generics('好').runMethod()
    Generics("run方法",true).getObject()?.run {
        // 如果有值就会执行
        println(this)
    } ?: println("返回的this是努null")
}

//泛型类Value：字符串
//泛型类Value：23
//泛型类Value：23.5
//泛型类Value：好