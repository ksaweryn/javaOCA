package com.demografiando.chap2;

public class CharExample {

  static char c1 = 'D';//Double couted fails to compile
  static char c2 = 122;
  static char c3 = '\u0122'; //unicode goes from\u0000 to \uffff
  //static char c4 = -122; //It fails to compile;
  static char c5 = (char) -122; //It fails to compile;

  public static void main (String... args) {
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c5);
  }
}
