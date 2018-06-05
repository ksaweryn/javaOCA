package com.demografiando.chap3;

class Employee {
  Employee(){
    System.out.println("Employee:constructor"); //Third
  }
  {
    System.out.println("Employee:initializer"); //Second
  }
  static {
    System.out.println("Employee:static initializer"); //First
  }
}

class TestEmp {
  public static void main(String[] args){
    Employee e = new Employee();
  }
}
