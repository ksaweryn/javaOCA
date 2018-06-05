package com.demografiando.chap3;

class Employee {
  int age;
  String name;

  Employee(int newAge) {
    this(newAge, null);
  }

  //It fails to compile
  Employee(String name) {
    //Employee(0, name); I can't use the constructor's name inside a constructor
    //System.out.println("Hello World!");
    this.(0, name); // It must be the first statement
    this.(10, name);// It can't be a second call to another constructor
  }

  Employee() {
    age = 20;
    name = "Javier";
    System.out.println("Constructor");
  }

  Employee(int newAge, String newName) {
    age = newAge;
    name = newName;
    System.out.println("Constructor");
  }

  //This is not a Constructor, it's a method because it has a return type
  static void Employee() {
    System.out.println("Method not Constructor");
  }

  void Employee(String newName) {
    System.out.println("Method not Constructor " + newName);
  }

}

class Office {
  public static void main (String... args) {
    Employee emp = new Employee();
    System.out.println(emp.age);
    emp = new Employee(30, "Fernando");
    System.out.println(emp.age);
    Employee.Employee();
    emp.Employee();
    emp.Employee("Shunkito");
    emp = new Employee(25);
    System.out.println(emp.name);

  }
}
