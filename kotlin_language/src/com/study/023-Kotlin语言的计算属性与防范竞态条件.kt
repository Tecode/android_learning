package com.study

class ManagerClass {
    var name: String? = "haoxuan"
    fun getInfoName(): String {
        return name?.also {
            "最终的结果$it"
        } ?: "name是null，请检查代码..."
    }
}

fun main() {
    val manager: ManagerClass = ManagerClass()
    println(manager.getInfoName()) // haoxuan
    manager.name = null
    println(manager.getInfoName()) // name是null，请检查代码...
}