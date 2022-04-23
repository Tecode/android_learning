package com.study

class Human001 {
    // 运行时候未初始化的值，不能使用 会报错
    lateinit var name: String
    fun request() {
        name = "服务器加载成功，获取的数据成功name=haoxuan"
    }

    fun showResponse() {
        if (::name.isInitialized) {
            println(name)
        } else {
            println("未初始化...")
        }
    }
}

fun main() {
    val human = Human001()
    // Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized
    // println(human.name)
    // human.request()
    human.showResponse() // 未初始化...
}