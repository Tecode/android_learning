package com.study

fun main() {
    val language = "Go Java Javascript Swift"
//    普通方式
    println("字符串长度：${language.length}")
    println("第4个字符：${language.split(" ")[3]}")

//    使用apply方法，链式调用返回的是自己本身
    language.apply {
        println("字符串长度：${length}")
        println("第4个字符：${split(" ")[3]}")
    }.apply {
        println("字符串长度：${length}")
        println("第4个字符：${split(" ")[1]}")
    }.apply {
        println("字符串长度：${length}")
        println("第4个字符：${split(" ")[2]}")
    }.apply {
        println("字符串长度：${length}")
        println("第4个字符：${split(" ")[3]}")
    }.apply {
        println("字符串长度：${length}")
        println("第4个字符：${split(" ")[3]}")
    }
}