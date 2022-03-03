package com.android

// let安全调用

fun main() {
    var name: String? = null
//    name = "haoxuan"


//        name是可空类型 如果name=null .?后不执行避免空指针
    name?.let {
        if (it.isBlank()) {
//            空字符
            println("空字符")
        } else {
            println(it)
        }
    }

//    断言!!不管name是不是null都要执行
    var r = name!!.capitalize()
    println(r)
//    Exception in thread "main" java.lang.NullPointerException
}