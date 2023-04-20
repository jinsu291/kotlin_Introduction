package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  //@Nullable 이렇게 하면 Person2.kt에서 에러가 뜸
  @NotNull
  public String getName() {
    return name;
  }

}


