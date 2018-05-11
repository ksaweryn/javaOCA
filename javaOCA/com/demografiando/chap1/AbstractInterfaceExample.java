package com.demografiando.chap1;

//Nonaccess modifier
class AbstractInterfaceExample {
  private String name;
  private void displayName() {
    //UniversityInterface person = new UniversityInterface();
  }
}

interface UniversityInterface {
  //JVM adds abstract to interface
  abstract void printGreetings();
}

abstract interface UniversityAbstractInterface {
//this is equivalent to interface UniversityAbstractInterface
//it is redundant to add the Nonaccess modifier abstract to an interface
}
