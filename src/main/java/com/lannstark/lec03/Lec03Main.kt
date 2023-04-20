package com.lannstark.lec03

fun main() {
    // printAgeIfPerson2(null) // null
    printAgeIfPerson2(Person("", 100))
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

// 만약 obj에 null이 들어올 수 있다면?
fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

