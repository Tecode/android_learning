package com.study

// 默认类方法是使用final修饰的不能继承，需要使用open关键字修饰
open class Human003(val name: String) {
    open fun run() = "父类的名字$name"
}

class Student(name: String) : Human003(name) {
    override fun run(): String = "子类名字，重写了父类的方法$name"
}

fun main() {
    val student: Human003 = Student("haoxuan")
    println(student.run())
    // 子类名字，重写了父类的方法haoxuan
}