package com.study

// 内部类的特点：内部类能访问外部类
//            外部类能访问内部的类

class Human006(val name: String) {
    fun outerRun() = println("父类的方法打印Name")

    inner class Student {
        fun innerRun() = println("内部类调用父类名称，Name=$name")
    }

    inner class Teacher {
        fun innerRun() = println("我是老师我叫$name")
    }
}


// 嵌套类
// 默认情况下就是嵌套类
// 嵌套类特点：外部的类能访问内部的嵌套类
// 内部的类不能访问外部类的成员
class Outer{
    val infoValue:String = "外部内数据"
    class Inner{
        fun run() = println("嵌套内${Outer().infoValue}")
    }
}
fun main() {
    // 内部类调用
    Human006("Haoxuan").outerRun() // 父类的方法打印Name=Haoxuan
    Human006("Haoxuan").Teacher().innerRun() // 我是老师我叫Haoxuan
    Human006("Haoxuan").Student().innerRun() // 内部类调用父类名称，Name=Haoxuan

    // 嵌套类
    Outer.Inner().run() // 嵌套内外部内数据
}