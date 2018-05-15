package com.demografiando.chap2;

public class WideningDataType {
  byte b1 = 10;
  byte b2 = 10;
  static final byte b5 = 20;
  static final byte b6 = 10;
  // It fails to compile. Incompatible types.
  //short s1 = b1 + b2;
  public static void main (String... args){
    byte b3 = 10;
    byte b4 = 10;
    short s1 = b5+b6;
    System.out.println(b3+b4); //By widening it is int
    System.out.println(s1); //By final nonaccess modifier it is short
  }
}
