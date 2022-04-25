package com.study

// 密封类，我的成员须有类型并且继承本类
sealed class Exams {
    // object? Fraction001 Fraction002，都不需要任何成员，所以一般写成object，单例就单例无所谓了
    object Fraction001 : Exams() // 分数及格
    object Fraction002 : Exams() // 分数良好
    // 对象不是单例
    class Fraction003(val studentName: String) : Exams() // 分数优秀
}

class Teacher(private val value: Exams) {
    fun runTeacher() = when (value) {
        is Exams.Fraction001 -> "成绩不好"
        is Exams.Fraction002 -> "成绩良好"
        is Exams.Fraction003 -> "成绩优秀，该学生的姓名是${this.value.studentName}"
    }
}

fun main() {
    // 成绩不好
    println(Teacher(Exams.Fraction001).runTeacher())
    // 成绩良好
    println(Teacher(Exams.Fraction002).runTeacher())
    // 成绩优秀，该学生的姓名是Lala
    println(Teacher(Exams.Fraction003("Lala")).runTeacher())
    println(Exams.Fraction001 == Exams.Fraction001) // true
    println(Exams.Fraction003("AAA") == Exams.Fraction003("AAA")) // false
}