package com.demografiando.chap2;

public class CharExample {

  static char c1 = 'D';//Double couted fails to compile
  static char c2 = 122;
  static char c3 = '\u0122'; //unicode goes from\u0000 to \uffff
  //static char c4 = -122; //It fails to compile;
  static char c5 = (char) -122; //It compiles, the compiler chops off the negative;
  static int i1 = (char) 1;

  public static void main (String... args) {
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c5);
      System.out.println(c5+c3);//At the end e/char is an unsigned number
      System.out.println(i1);


  }
}
