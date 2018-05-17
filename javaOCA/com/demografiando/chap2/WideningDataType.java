package com.demografiando.chap2;

public class WideningDataType {
  static byte b1 = 10;
  static byte b2 = 10;
  static final byte b5 = 126;
  static final byte b6 = 127;
  // It fails to compile. Incompatible types.
  //short s1 = b1 + b2;
  public static void main (String... args){
    byte b3 = 10;
    byte b4 = 10;
    short s1 = b5+b6;
    System.out.println(b3+b4); //By widening it is int
    System.out.println(((Object)s1).getClass().getName()); //By final nonaccess modifier it is short
    //The lack of final modifier the result is int
    System.out.println(((Object)(b1+b2)).getClass().getName());
  }
}
