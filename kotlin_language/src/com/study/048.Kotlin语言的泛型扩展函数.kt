package com.study

// 根据类型输出不同的结果
fun <T> T.outValue() {
    if (this is String) {
        println("这个是字符串，长度为：$length")
        return
    }
    println("你的不是字符串，内容为$this")
}

// 输出不同的类型并且显示出来
fun <T2> T2.outType() {
    when (this) {
        is String -> println("这个类型是String类型")
        is Number -> println("这个类型是Number类型")
        is Boolean -> println("这个类型是Boolean类型")
        is Char -> println("这个类型是Char类型")
        is Unit -> println("原来你的函数类型")
        else -> println("未知类型")
    }
}

// 显示调用的时间
fun <T3> T3.showTime() = println("调用的时间是：${java.lang.System.currentTimeMillis()}")

fun componentFunc() = println("组件函数：componentFun产生了调用")

fun main() {
    "name".outValue()
    Human014("haoxuan").outValue()
//    这个是字符串，长度为：4
//    你的不是字符串，内容为Human014(name=haoxuan)
    componentFunc().outType()
    "name".outType()
    Human014("haoxuan").outType()
    Human014("haoxuan").showTime()
}

//组件函数：componentFun产生了调用
//原来你的函数类型
//这个类型是String类型
//未知类型