package com.study

// Kotlin语言out-协变

// 生产者out T 协变
interface Producer<out T> {
    // out T 只能被读取不能被修改
    // fun consumer(value: T) {}
    // 只能读取
    fun producer(): T
}

// 消费者in T 逆变
interface Consumer<in T> {
    // int T 只能被修改不能被读取
    fun consumer(value: T)
    // 只能读取
    // fun producer(): T
}

// 生产者&消费者，默认情况下是不变
interface ProducerAndConsumer<T> {
    // 能被修改
    fun consumer(value: T)

    // 能读取
    fun producer(): T
}

open class Animal
open class Humanity : Animal()
open class Man : Humanity()
open class Woman : Humanity()

// out-协变 生产者
class Producer001 : Producer<Animal> {
    override fun producer(): Animal {
        return Animal()
    }
}

class Producer002 : Producer<Humanity> {
    override fun producer(): Humanity {
        return Humanity()
    }
}

class Producer003 : Producer<Man> {
    override fun producer(): Man {
        return Man()
    }
}

class Producer004 : Producer<Woman> {
    override fun producer(): Woman {
        return Woman()
    }
}

// in-逆变 消费者
class Consumer001 : Consumer<Animal> {
    override fun consumer(value: Animal) {
        println("消费者Animal")
    }
}

class Consumer002 : Consumer<Humanity> {
    override fun consumer(value: Humanity) {
        println("消费者Humanity")
    }
}

class Consumer003 : Consumer<Man> {
    override fun consumer(value: Man) {
        println("消费者Man")
    }
}

class Consumer004 : Consumer<Woman> {
    override fun consumer(value: Woman) {
        println("消费者Woman")
    }
}

fun main() {
    val personal001: Producer<Animal> = Producer001() // 本来就是传递Animal
    val personal002: Producer<Animal> = Producer002() // Humanity 因为out
    val personal003: Producer<Animal> = Producer003() // Man 因为out
    val personal004: Producer<Animal> = Producer004() // Woman 因为out
    // 范型默认情况下是：范型的子类对象不可以赋值给范型父类对象
    // out：范型的子类对象可以赋值给范型的父类对象

    var consumer001: Consumer<Man> = Consumer001()
    var consumer002: Consumer<Woman> = Consumer002()
    // 默认情况下范型处的父类是不可以赋值给范型声明处子类的
    // in:泛型具体处的父类是可以赋值给泛型声明处子类的
}