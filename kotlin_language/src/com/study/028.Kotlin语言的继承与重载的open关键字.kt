package com.study

// 默认类方法是使用final修饰的不能继承，需要使用open关键字修饰
open class Human003(val name: String) {
    open fun run() = "父类的名字$name"
    fun showName001() = println("我是父类的方法")
}

class Student(name: String) : Human003(name) {
    override fun run(): String = "子类名字，重写了父类的方法$name"
    fun showName002() = println("我是子类的方法")
}

fun main() {
    val student = Student("haoxuan")
    println(student.run()) // 子类名字，重写了父类的方法haoxuan
    // 类型转换
    println(student is Human003) /* true */
    // 将子类转换微父类方法
    (student as Human003).showName001() // 我是父类的方法
    // 使用了as转换编译器会默认使用之前的类型
    student.showName001() // 我是父类的方法
    student.showName002() // 我是子类的方法
}