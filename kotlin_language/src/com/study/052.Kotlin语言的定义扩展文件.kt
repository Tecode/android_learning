package com.study

import com.android.randomValue as RG
import com.android.randomValuePrint as RP

fun main() {
    val listData = listOf<Double>(9.0, 10.0, 6.0, 1.0, 3.0, 4.5, 5.0)
    val setData = setOf<String>("java", "kotlin", "swift", "object-c", "go", "java-script")

//  不使用扩展文件获取随机内容
    println(listData.shuffled().first())
    println(setData.shuffled().first())

//  使用扩展文件获取随机内容
    println(listData.RG())
    println(setData.RP())

//  直接使用扩展文件打印随机内容
    listData.RG()
    setData.RP()
}

//go
//6.0
//go
//1.0
//swift