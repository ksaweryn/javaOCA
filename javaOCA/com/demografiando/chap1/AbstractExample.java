package com.demografiando.chap1;

//Nonaccess modifier
class AbstractExample {
  private String name;
  private void displayName() {

  }
}

abstract class University {
  //It fails to compile!
  //AbstractExample person = new AbstractExample();
  abstract void printGreetings();
  //this implementation is possible because of Java 8, previous versions of Java
  //did not allow to generate a body in a method of the abstract class
  protected void testJava8() {
    System.out.println("Hello Abstract World");
  }
}
