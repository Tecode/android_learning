package com.study

// 构造函数的不同传参方式
class Personal003(name: String, age: Int) {
    init {
        println("函数初始化$name $age")
    }
    constructor(name: String, age: Int, home: String) : this(name, age) {
        println("三个参数的构造函数$name $age $home")
    }

    constructor(name: String, age: Int, home: String, sex: Char) : this(name, age) {
        println("四个参数的构造函数$name $age $home $sex")
    }
}

fun main() {
    Personal003(name = "haoxuan1", age = 12)
    Personal003(name = "haoxuan2", age = 18, home = "SBT")
    Personal003(name = "haoxuan3", age = 20, home = "SBT", sex = '男')
}


//函数初始化haoxuan1 12
//函数初始化haoxuan2 18
//三个参数的构造函数haoxuan2 18 SBT
//函数初始化haoxuan3 20
//四个参数的构造函数haoxuan3 20 SBT 男