package com.demografiando.chap1;

class FinalVariable {
  final int VALUE = 99;//It is constant

  void printValue() {
    System.out.println(VALUE);
    //fails compilation!
    VALUE = 100;
    System.out.println(VALUE);
  }

}
