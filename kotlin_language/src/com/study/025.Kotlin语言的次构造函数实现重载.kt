package com.study

// 构造函数的不同传参方式
// 第一步：生成value name age
class Personal003(name: String, age: Int) {
    //  类成员和init代码块是同时生成的
    val name002 = name
    init {
        println("函数初始化$name $age")
        require(name.isEmpty()) { "必传项校验，name不能为空，抛出异常" }
    }

    constructor(name: String, age: Int, home: String) : this(name, age) {
        println("三个参数的构造函数$name $age $home")
    }

    // 构造函数的默认参数
    constructor(name: String, age: Int, home: String, sex: Char = '男') : this(name, age) {
        println("四个参数的构造函数$name $age $home $sex")
    }
}

fun main() {
//    Exception in thread "main" java.lang.IllegalArgumentException: 必传项校验，name不能为空，抛出异常
//    at com.study.Personal003.<init>(025.Kotlin语言的次构造函数实现重载.kt:7)
//    at com.study._025_Kotlin语言的次构造函数实现重载Kt.main(025.Kotlin语言的次构造函数实现重载.kt:21)
//    at com.study._025_Kotlin语言的次构造函数实现重载Kt.main(025.Kotlin语言的次构造函数实现重载.kt)    Personal003(name = "", age = 12)
    Personal003(name = "haoxuan1", age = 12)
    Personal003(name = "haoxuan2", age = 18, home = "SBT")
    Personal003(name = "haoxuan3", age = 20, home = "SBT", sex = '男')
}


//函数初始化haoxuan1 12
//函数初始化haoxuan2 18
//三个参数的构造函数haoxuan2 18 SBT
//函数初始化haoxuan3 20
//四个参数的构造函数haoxuan3 20 SBT 男

// 如果都包含默认参数优先调用主构造函数