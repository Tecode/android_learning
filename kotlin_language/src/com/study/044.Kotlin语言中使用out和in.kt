package com.study

// 泛型类型只有使用的都只能读取不能修改
class OnlyRead<out T>(val value: T) {
    fun getValue001(): T {
        return value
    }

    fun getValue002(): T? {
        return value
    }
}

// 泛型类型只能修改不能读取
class OnlyWrite<in T> {
    fun setValue(value: T) {
        println("set的值是$value")
    }
}

fun main() {
    // 只能读取
    val onlyRead = OnlyRead("只能读取的泛型类")
    println(onlyRead.getValue001())
    println(onlyRead.getValue002())

    // 只能修改
    OnlyWrite<Int>().setValue(100)

//    只能读取的泛型类
//    只能读取的泛型类
//    set的值是100
}