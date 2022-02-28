package com.android

// 实例化抽象函数

abstract class Animal {
    lateinit var name: String
    abstract fun sayName()
}

fun main() {
    var animal = object : Animal() {
        override fun sayName() {
            println("动物名称 $name")
        }
    }
    animal.name = "Monkey"
    animal.sayName()
}