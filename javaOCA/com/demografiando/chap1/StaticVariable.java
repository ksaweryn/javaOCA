package com.demografiando.chap1;

class StaticVariable {

  String name;
  // this variable is seen by instance of the StaticVariable class
  static int value;

  public static void main(String args[]){

    StaticVariable person1 = new StaticVariable();
    person1.name = "Javier";
    person1.value=10;

    StaticVariable person2 = new StaticVariable();
    person2.name = "Javier";
    person2.value=20;

    System.out.println(person1.name + " " + person1.value);
  }
}
