package com.lannstark.lec05

import com.lannstark.lec09.JavaPerson

fun main() {
    Person2()
}

class Person2(
//    val name: String = "수수",
    name: String = "수수",
    var age: Int = 1
) {
//    val name = name
//        get() = field.uppercase()
//
//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

//    val uppercaseName: String
//    get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

//    val isAdult: Boolean
//    get() = this.age >= 20

    fun isAdult(): Boolean {
        return this.age >= 20
    }
}


