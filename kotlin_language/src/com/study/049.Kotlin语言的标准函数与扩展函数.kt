package com.study

fun main() {
    val value = "自定义的let".mLet { false }
    println(value)
}

// lambda(this)T进行函数扩展，在整个扩展函数里面，this == T本身
private inline fun <T, O> T.mLet(lambda: (T) -> O): O = lambda(this)