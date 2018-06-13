package com.demografiando.chap4;

class StringExample {
  public static void main (String args[]) {

    String s1 = new String("Paul");
    String s2 = new String("Paul");
    //False because new String("Paul") is an object
    System.out.println(s1 == s2);

    String s3 = "Harry"; //JVM adds this string to the pool
    String s4 = "Harry";
    //True because = "Harry" is a literal stored in a pool of Strings
    System.out.println(s3 == s4);

    String s5 = new String("morning");
    System.out.println("morning" == s5); //False

    //Different ways to create String using the String constructor
    char[] c1 = new char[] {'J','A','V','I','E','R'};
    String s6 = new String(c1);
    System.out.println(s6);
    StringBuilder sb1 = new StringBuilder("String builder");
    StringBuffer sb2 = new StringBuffer("String buffer");
    String s7 = new String(sb1);
    String s8 = new String(sb2);
    System.out.println(s7);
    System.out.println(s8);

    String s9 = null;
    s9 = "Test";
    s9 = "Test2";
    System.out.println(s9);
  }
}
