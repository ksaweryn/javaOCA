package com.demografiando.chap2;

class IntegerExample {
  static int x = 10_00_00;
  static int y = 1_000_000;
  static int octal = 0456;
  static int hexadecimal = 0X12B;
  static int binary = 0b1_01010101_0101;

  static long longNumber = 872367L;

  public static void main (String... args) {
    System.out.println(x);
    System.out.println(y);
    System.out.println(octal);
    System.out.println(hexadecimal);
    System.out.println(binary);
    System.out.println(longNumber);

    //It fails to compile:
    //x = 1000_;
    octal = 0_456; //This compiles;
    //hexadecimal = 0x_23F;
    //binary = 0B_10101010;
    //longNumber = 1231312_L;
    System.out.println(x);
    System.out.println(octal);
    System.out.println(hexadecimal);
    System.out.println(binary);

    //x = Integer.parseInt("10_897"); //It compiles but fails to execute;
  }
}
