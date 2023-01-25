package com.study

import java.io.File

fun main() {
    File("/Users/haoxuan/Work/android_learning/kotlin_language/src/com/study/kotlin-apply.kt").myApply {
        println(this.name)
    }.myApply {
        println(readLines())
    }
}

// inline是我们的高阶函数，需要使用内敛对lambda函数优化处理提高性能
// T.() -> Unit让我们的匿名函数里面持有this，在lambda里面不需要返回值，因为永远返回T本身
// block(this)默认就有this
// 返回this作用可以链式调用
private inline fun <T> T.myApply(block: T.() -> Unit): T {
    block() // 省略this
    return this
}


//kotlin-apply.kt
//[package com.study, , fun main() {,     val ...