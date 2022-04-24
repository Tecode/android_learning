package com.study

open class Human005 {
    open fun run() = println("Human005类")
    // 伴生对象的由来，Kotlin语言中是没有static静态，伴生很大程度上和Java的static静态差不多
    // 无论Human005构建对象多少次，我们的伴生对象只有一次加载
    // 伴生对象只会初始化一次
    companion object {
        fun sayName() {
            println("我是静态方法")
        }
    }
}

fun main() {
    // 重写方法
    object : Human005() {
        override fun run() {
            super.run() // Human005类
            println("Human子类") // Human子类
        }
    }.run()
    // 静态方法调用
    // Kotlin语言的伴生对象
    Human005.sayName() // 我是静态方法
}