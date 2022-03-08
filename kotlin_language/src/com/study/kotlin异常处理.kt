package com.study

fun main() {
    try {
        var info: String? = null
        checkException(info)
        println(info!!.length)
    } catch (e: CustomException) {
        println("$e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("你的代码太不严谨了！")