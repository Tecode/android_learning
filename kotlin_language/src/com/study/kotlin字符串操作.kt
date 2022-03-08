package com.study

fun main() {
//    substring
    val name = "QWRTEYUDHGSGKO:NGG"
    println(name.substring(0 until 6))
    println(name.split(":"))
//    加密解密操作
    val newValue = name.replace(Regex("[GSGKO]")) {
        when (it.value) {
            "G" -> "0"
            "S" -> "9"
            "K" -> "3"
            "o" -> "8"
            else -> it.value
        }
    }
    println("加密后:$newValue")
//    解密操作
    val value002 = newValue.replace(Regex("[0938]")){
        when (it.value) {
            "0" -> "G"
            "9" -> "S"
            "3" -> "K"
            "8" -> "o"
            else -> it.value
        }
    }
    println("解密后:$value002")
}