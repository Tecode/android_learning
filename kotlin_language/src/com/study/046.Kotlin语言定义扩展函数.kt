package com.study

import java.io.File
import java.nio.charset.Charset
import java.util.ArrayList

class Human013(val name: String) {
    fun out() {
        println("对象方法输出name：$name")
    }
}

// 增加扩展函数
fun Human013.reload(value: String) = run { println(value) }

// 增加扩展函数
fun Human013.info(): String = name

// 注意：自己扩展的函数不能二次重写直接就会报错
//fun Human013.info(): String = name


// 扩展函数的背后实现

//public final class Human013 {
//    @NotNull
//    private final String name;
//
//    public final void out() {
//        String var1 = "对象方法输出name：" + this.name;
//        boolean var2 = false;
//        System.out.println(var1);
//    }
//
//    @NotNull
//    public final String getName() {
//        return this.name;
//    }
//
//    public Human013(@NotNull String name) {
//        Intrinsics.checkNotNullParameter(name, "name");
//        super();
//        this.name = name;
//    }
//}

//
private fun File.readLines(charset: Charset = Charsets.UTF_8): String {
//    val result = ArrayList<String>()
//    forEachLine(charset) { result.add(it); }
    return "重写了File.readLines方法"
}

fun main() {
    val human = Human013("haoxuan")
    human.out()
    human.reload("类添加方法")
    println(human.info())
    println(File("").readLines())
}

//对象方法输出name：haoxuan
//类添加方法
//haoxuan
//重写了File.readLines方法