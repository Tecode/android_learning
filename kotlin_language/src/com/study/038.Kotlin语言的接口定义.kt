package com.study

interface Human009 {
    var name: String
    var race: String
    fun sayInformation()
}

// Student类实现Human009
class Student002(override var name: String, override var race: String) : Human009 {
    override fun sayInformation() {
        println("${name}是${race}")
    }
}

fun main() {
    val student = Student002("小明", "汉族")
    student.sayInformation()
    // 小明是汉族
}