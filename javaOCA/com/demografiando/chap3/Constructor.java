package com.demografiando.char3;

class Employee {
  int age;
  String name;

  Employee() {
    age = 20;
    name = "Javier";
    System.out.println("Constructor");
  }
}

class Office {
  public static void main (String[] args) {
    Employee emp = new Employee();
  }
}
