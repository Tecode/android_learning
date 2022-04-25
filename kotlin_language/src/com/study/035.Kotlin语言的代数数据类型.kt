package com.study


enum class ValueEnum {
    Value001,
    Value002,
    Value003
}

fun calculation(value: ValueEnum): String {
    return when (value) {
        ValueEnum.Value001 -> "成绩很差"
        ValueEnum.Value002 -> "成绩一般"
        ValueEnum.Value003 -> "成绩很好"
    }
}

fun main() {
    println(calculation(ValueEnum.Value001))
    println(calculation(ValueEnum.Value002))
    println(calculation(ValueEnum.Value003))
}

//成绩很差
//成绩一般
//成绩很好