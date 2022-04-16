package com.study

fun main() {
    val name: String = "Hello World"
    val r1: Float = name.run {
        true
        23.5f
    }
    println(r1)
    println(isLogin("0"))
    name.run {
//        this === name 本身
    }
//    这个属于具名函数
//    name.run(具名函数)
    val r2: String = name
        .run(::isLogin)
        .run(::getUserInfo)
    println(r2)
}

fun isLogin(user: String): Boolean = user.isNotEmpty()
fun getUserInfo(login: Boolean): String = if (login) "已登录" else "未登录"
