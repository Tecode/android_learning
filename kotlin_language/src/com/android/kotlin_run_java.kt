package com.android

// 运行java代码有关键字需要使用``运行方法
fun main() {
    kotlin_run_java.`is`()
}

class JavaRunKotlin {
    fun run() {
        println("运行的是Kotlin代码")
    }

    companion object {
        fun kotlinRun() {
            println("Kotlin的静态方法")
        }
    }
}