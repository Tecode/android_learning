package com.study

// 构造函数的不同传参方式
class Personal001(_name: String, _age: Int) {
    var name = _name
    var age = _age
    fun say() {
        println("我的名字是$name,今年${age}岁")
    }
}

class Personal002(val name: String, val age: Int) {
    fun say() {
        println("我的名字是$name,今年${age}岁")
    }
}

fun main() {
    Personal001(_name = "haoxuan", _age = 12).say()
    Personal002(name = "haoxuan", age = 18).say()
}