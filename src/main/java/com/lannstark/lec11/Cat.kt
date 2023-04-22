package com.lannstark.lec11

private val NUM = 3
fun add(a: Int, b: Int): Int {
    println(NUM)
    return a + b
}


open class Cat protected constructor()
