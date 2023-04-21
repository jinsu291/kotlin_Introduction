package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1;
    val money4 = JavaMoney(2_000L)

    println(money1 + money2)

    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.")
    }
    println(money1 === money3)
    println(money1 === money4)

}


