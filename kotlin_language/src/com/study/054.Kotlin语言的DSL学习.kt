package com.study


class Human015 {
    val name = "Human015"
    val info = "Information"
    fun toast(value: String) = println("Toast value：$value")
}

private inline fun Human015.outInfo(lambda: Human015.(String) -> Unit): Human015 {
    lambda(info)
    return this
}

private inline fun Human015.action(action: (String, String) -> Unit): Human015 {
    action("haoxuan", "29")
    return this
}

fun main() {
// DSL语言简介 领域专用语言（Domain Specified Language）DSL
// 定义整个lambda规则标准，输入必须是Human015这个类才有资格调用outInfo这个函数，匿名函数持有it和this
// 定义整个lambda规则标准，输出我们始终会返回Human015本身，所以可以链式调用
// main函数可以根据DSL编程范式标准规则来具体实现，这就是DSL编程规范
    val human = Human015().outInfo {
        toast("haoxuan")
        toast(it)
        toast(name)
        true
    }.action { value1, value2 -> println("Action lambda函数输出的结果： $value1 $value2") }
    println("$human")
}
//Toast value：haoxuan
//Toast value：Information
//Toast value：Human015
//Action lambda函数输出的结果： haoxuan 29
//com.study.Human015@61bbe9ba