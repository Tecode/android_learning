package com.study

//定义三个Object类
data class Human01(val name: String, val age: Number, val address: String)
data class Human02(val name: String, val age: Number, val address: String)
data class Human03(val name: String, val age: Number, val address: String)

class ReifiedObject {
    inline fun <reified T> randomDefault(defaultLambdaAction: () -> T): T? {
        val list = listOf<Any>(
                Human01("haoxuan", 24, "成都市新都"),
                Human02("ming", 29, "四川成都"),
                Human03("haohao", 92, "四川成都"),
        )
        val randomData = list.shuffled().first()
        println("随机对象为：$randomData")
//      takeIf { it is T }可能为null转换为T会报错所以要是使用T?
        return randomData.takeIf { it is T } as T? ?: defaultLambdaAction()
    }
}

fun main() {
    val reifiedObject = ReifiedObject().randomDefault<Human02> {
        println("由于产生的随机对象不是Human02，所以启用随机对象")
        Human02("haohao003", 92, "四川成都")
    }
}

//随机对象为：Human03(name=haohao, age=92, address=四川成都)
//由于产生的随机对象不是Human02，所以启用随机对象


//随机对象为：Human02(name=ming, age=29, address=四川成都)