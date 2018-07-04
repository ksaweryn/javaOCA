package com.demografiando.chap4;

public class StringConcatenation {
  public static void main(String args[]) {
    String a1 = " Java OCA";
    int a = 10;
    int b = 12;
    //it evaluates from left to right, thus it first adds then concatenates the string
    System.out.println(a + b + a1);
    System.out.println(a + (b + a1));
    //it first concatenates a string then it keeps concatenating
    System.out.println("" + a + b + a1);

    String a2;
    //It does not compile, if a string variable has not been initialized
    a2 = null;
    a2 += "Java";
    //It prints nullJava
    System.out.println(a2);

    

  }
}
