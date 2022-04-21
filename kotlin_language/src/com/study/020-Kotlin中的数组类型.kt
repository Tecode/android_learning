package com.study

import java.io.File

/*
* Kotlin语言中的各种数组类型
* IntArray intArrayOf
* LongArray longArrayOf
* DoubleArray doubleArrayOf
* FloatArray floatArrayOf
* ShortArray shortArrayOf
* ByteArray byteArrayOf
* Array<File> arrayOf
* */
fun main() {
    val intArray: IntArray = intArrayOf(2, 3, 4, 5)
    val doubleArray: DoubleArray = doubleArrayOf(2.3, 4.5, 6.9)
    val longArray: LongArray = longArrayOf(23455454, 54242424)
    println(intArray.elementAtOrElse(10) { -1 })  // -1

    // list集合转数组
    val charArray: CharArray = listOf('A', 'B', 'C').toCharArray()
    println(charArray) // ABC
    // arrayOf Array<File>
    val fileList: Array<File> = arrayOf(File("AA"), File("BB"))
    println(fileList.elementAt(0)) // AA
}