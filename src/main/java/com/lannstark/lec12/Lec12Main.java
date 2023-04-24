package com.lannstark.lec12;

public class Lec12Main {

    public static void main(String[] args) {
        Person.Companion.newBaby("ABC");
        Person.newBaby("ABC"); // @JvmStatic을 썼을 때
        // Person.Factory.newBaby("ABC");
    }

}
