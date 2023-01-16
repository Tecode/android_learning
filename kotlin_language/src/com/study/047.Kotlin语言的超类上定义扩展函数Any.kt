package com.study

data class Human014(val name:String)

// 超类进行函数扩展，之后所有的类都有这个方法
fun Any.outContent() = println("当前的内容是$this")

// 超类函数扩展实现链式调用
fun Any.chained(): Any {
    println("Chained当前的内容是$this")
    return this
}

//

fun main() {
    "haoxuan".outContent()
    Human014("name").outContent()
    3.14.chained().chained().chained()
    3.14500f.chained().chained().chained()
    666.chained().chained().chained()
}

//当前的内容是haoxuan
//当前的内容是Human014(name=name)
//Chained当前的内容是3.14
//Chained当前的内容是3.14
//Chained当前的内容是3.14
//Chained当前的内容是3.145
//Chained当前的内容是3.145
//Chained当前的内容是3.145
//Chained当前的内容是666
//Chained当前的内容是666
//Chained当前的内容是666