package com.study

class Human012<T>(vararg values: T, private val isMap: Boolean) {
    // out我们的T只能读取不能修改
    private val listArray: Array<out T> = values

    // 获取数据为true返回数据不玩ture返回null
    fun getValue(index: Int): T? = listArray[index].takeIf { isMap }

    // 根据给定的范型返回对应的类型
    fun <O> mapValue(index: Int, mapAction: (T?) -> O) = mapAction(getValue(index))
}

fun main() {
    val human = Human012("haoxuan", 2, false, 34.6f, 'C', null, isMap = true)
    println(human.getValue(5)) // null
    val value = human.mapValue(5){
        "$it"
    }
    println(value) // haoxuan
    println((value as String?)?.length ?: "你返回的数据是null") // haoxuan
}