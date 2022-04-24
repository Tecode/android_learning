package com.study

// 运算符重载
class Number001(private val number001: Int, private val number002: Int) {
    operator fun plus(value: Number001): Int {
        return (number001 + value.number001) + (number002 + value.number002)
    }
}

// 简单枚举
// 枚举的参数就是传入的值
enum class SimpleEnum(val value:String) {
    Value1("第一个数据"),
    Value2("第二个数据");

    fun show() = println("${Value1.value} ${Value2.value}")
}

fun main() {
    // Number001 类相加
    println(Number001(1, 2) + Number001(3, 4)) // 10
    // 枚举的使用
    println(SimpleEnum.Value1.value)
    println(SimpleEnum.Value2.value)
    // 调用枚举的方法
    // 第一个数据 第二个数据
    SimpleEnum.Value1.show()
}