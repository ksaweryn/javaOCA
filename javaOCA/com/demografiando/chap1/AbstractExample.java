package com.demografiando.chap1;

//Nonaccess modifier
class AbstractExample {
  private String name;
  private void displayName() {

  }
}

abstract class University {
  //It fails to compile!
  AbstractExample person = new AbstractExample();

}
