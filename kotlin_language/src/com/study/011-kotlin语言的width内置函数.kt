package com.study

fun main() {
//    具名操作
//    和.run方法类似
    val isLogin = true
    val str = with(isLogin, ::getUserInfo)
    println(str)
//    已登录
//    匿名操作
    val stringLength: Int = with(str) {
        length
    }
    println(stringLength)
    // 3
}

fun getUserInfo2(login: Boolean): String = if (login) "已登录" else "未登录"
