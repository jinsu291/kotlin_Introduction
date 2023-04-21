package com.lannstark.lec04

fun main() {
//    if (fun1() || fun2()) {
//        println("본문")
//    }

    if (fun2() && fun1()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false

}


