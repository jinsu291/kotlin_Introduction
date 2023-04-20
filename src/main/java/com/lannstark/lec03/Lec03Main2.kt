package com.lannstark.lec03

fun main() {
    val name = "수수"
    val str =
        """
        ABCD
        EFG
        ${name}        
    """.trimIndent()
    println(str)
}
