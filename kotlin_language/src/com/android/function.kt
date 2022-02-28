package com.android

fun main() {
    println(functionSum(functionString, 2, 54))
//    lambda属于函数类型的对象::,需要把methodResponseResult普通函数变成函数类型的对象（函数引用）
    login("haoxuan", "12345", ::methodResponseResult)
    login("haoxuan", "1235", lambdaFunc)
}

typealias FuncType = (Int, Int) -> String

// 函数作为参数传递给函数方法
val functionSum = { func: FuncType, value001: Int, value002: Int -> func(value001, value002) }

val functionString: FuncType = { value001: Int, value002: Int -> "结果：${value001 + value002}" }


// 内敛函数
inline fun login(name: String, passWord: String, responseResult: (String, Int) -> Unit) {
    if (name == "haoxuan" && passWord == "12345") {
        responseResult("登录成功", 200)
        return
    }
    responseResult("登录失败", 400)
}

fun methodResponseResult(msg: String, code: Int) {
    println("登录结果：$msg code:$code")
}

// lambda类型函数就不需要加::
val lambdaFunc = { msg: String, code: Int -> println("登录结果：$msg code:$code") }