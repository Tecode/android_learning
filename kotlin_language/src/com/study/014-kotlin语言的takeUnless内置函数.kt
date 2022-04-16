package com.study

// taleUnless与takeIf的操作相反，false返回userName true返回null
class Manager {
    private var infoValue: String? = null
    fun getInfoValue() = infoValue
    fun setInfoValue(value: String) {
        this.infoValue = value
    }
}

fun main() {
    val manager = Manager()
    val value = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "valueInfo为null"
    println(value) // valueInfo为null
    manager.setInfoValue("OK")
    val value2 = manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "valueInfo为null"
    println(value2) //OK

}
