package com.study

class Human002 {
    // 懒加载，只有调用的时候才加载
    //
    val readFunction by lazy { readData() }
    private fun readData() {
        println("文件加载成功...")
    }
}

fun main() {
    val human = Human002()
    Thread.sleep(10000)
    // 10后才会显示 文件加载成功...
    human.readFunction
}