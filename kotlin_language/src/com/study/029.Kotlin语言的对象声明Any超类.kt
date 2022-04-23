package com.study

// object
object Human004 {
    init {
        println("初始化方法")
    }
    fun run() = println("object类型的对象")
    var runName = { println("lamda函数") }
}


fun main() {
    // Any超类
    // 相当于接口只有规范没有实现功能
    val anyClass = Any()
    println(anyClass.toString())
    Human004.run() // object类型的对象
    Human004.runName() // lamda函数
}