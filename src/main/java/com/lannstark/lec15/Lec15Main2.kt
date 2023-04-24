package com.lannstark.lec15

fun main() {
    val numbers = mutableListOf(100, 200)
    numbers.add(300)

    println(numbers[0])
    for (number in numbers) {
        println(number)
    }
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}

