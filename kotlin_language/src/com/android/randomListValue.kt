package com.android

fun <E> Iterable<E>.randomValue() =  this.shuffled().first()
fun <E> Iterable<E>.randomValuePrint() = println(this.randomValue())