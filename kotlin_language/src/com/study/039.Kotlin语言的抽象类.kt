package com.study

abstract class Human010 {
    abstract fun initState()
    abstract fun initData(): String
    abstract fun initView()
    abstract fun getLayOutId(): Int
    private fun setContentView(layoutId: Int) = println("加载${layoutId}布局xml中")
    fun onCreate() {
        initData()
        initView()
        initState()
        setContentView(getLayOutId())
    }
}

class Student3 : Human010() {
    override fun initState() {
        println("初始化了State")
    }

    override fun initData(): String {
        return "初始化的数据"
    }

    override fun initView() {
        println("初始化View")
    }

    override fun getLayOutId(): Int {
        return 10034
    }

}

fun main() {
    val student = Student3()
    student.onCreate()
    // 初始化View
    // 初始化了State
    // 加载10034布局xml中
}