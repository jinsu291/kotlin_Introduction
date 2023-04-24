package com.lannstark.lec15

fun main() {
    val array = arrayOf(100, 200)

//    for (i in array.indices) {
//        println("${i} ${array[i]}")
//    }

    for ((idx, value) in array.withIndex()){
        println("$idx $value")
    }
    array.plus(300)

    val numbers = listOf(100, 200)
//    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

}

private fun printNumbers(numbers: List<Int>) {

}