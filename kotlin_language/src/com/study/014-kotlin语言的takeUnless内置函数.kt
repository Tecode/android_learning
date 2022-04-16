package com.study

// taleUnless与takeIf的操作相反，false返回userName true返回null
fun main() {
    println(checkPermissionAction4("root", "234")) // root
    println(checkPermissionAction3("root", "123456")) // 不是超级用户，没有权限
    println(checkPermissionAction3("root", "12345")) // root

}

// takeUnless + 空操作符
//  userName.take函数为true返回userName false返回null
fun checkPermissionAction3(userName: String, pwd: String): String {
    return userName.takeUnless { permissionSystem(userName, pwd) } ?: "不是超级用户，没有权限"
}

fun checkPermissionAction4(userName: String, pwd: String): String? {
    return userName.takeUnless { permissionSystem(userName, pwd) }
}

private fun permissionSystem(userName: String, pwd: String): Boolean {
    return userName == "root" && pwd == "123456"
}