package com.study

fun main() {
    println(checkPermissionAction("root", "234")) // null
    println(checkPermissionAction2("root", "123456")) // root
    println(checkPermissionAction2("root", "12345")) // 不是超级用户，没有权限

}

// takeIf + 空操作符
//  userName.take函数为true返回userName false返回null
fun checkPermissionAction2(userName: String, pwd: String): String {
    return userName.takeIf { permissionSystem(userName, pwd) } ?: "不是超级用户，没有权限"
}

fun checkPermissionAction(userName: String, pwd: String): String? {
    return userName.takeIf { permissionSystem(userName, pwd) }
}

private fun permissionSystem(userName: String, pwd: String): Boolean {
    return userName == "root" && pwd == "123456"
}