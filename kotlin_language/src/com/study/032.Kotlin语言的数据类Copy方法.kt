package com.study

// 普通类继承set get 构造函数
class ResponseResult001(val data: String, val code: Int, val message: String)

// 数据类：一般是用于JavaBean的形式，用于数据类
// set get 构造函数 结构操作copy toString hashCode equals
data class ResponseResult002(val data: String, val code: Int, val message: String) {
    private var valueInfo: String? = null

    constructor(data: String, code: Int, message: String, _valueInfo: String?) : this(data, code, message) {
        valueInfo = _valueInfo
    }
}

fun main() {
    println(ResponseResult001("加载数据成功", 1002, "加载成功"))
    // com.study.ResponseResult001@29453f44
    val responseResult002 = ResponseResult002("加载数据成功", 1002, "加载成功", "valueInfo")
    println(responseResult002)
    val responseResult003 = responseResult002.copy(data = "ACK", code = 1006, message = "Copy的数据")
    println(responseResult003)
    // ResponseResult002(data=ACK, code=1006, message=Copy的数据)
    // ResponseResult002(data=加载数据成功, code=1002, message=加载成功)
    // 注意事项：使用copy的时候由于内部代码只处理主构造函数，不考虑次构造函数

}