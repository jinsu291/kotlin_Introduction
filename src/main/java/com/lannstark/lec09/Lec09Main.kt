package com.lannstark.lec05

import com.lannstark.lec09.JavaPerson

fun main() {
//    val person = Person("수수", 100)
//    val person = JavaPerson("수수", 100)
    val person = Person("수수")
    println(person.name)
    person.age = 10
    println(person.age)
    println("")
    Person()
}

class Person(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }
    constructor(name: String): this(name, 1) {
        println("부생성자1")
    }
    constructor(): this("홍길동"){
        println("부생성자2")
    }
}


