package com.demografiando.chap4;

public class StringbuilderExample {
  public static void main(String... args) {
    StringBuilder sb1 = new StringBuilder("My string builder test"); // Mutable
    System.out.println(sb1);
    sb1 = new StringBuilder(100); //Capacity
    System.out.println(sb1.length());
    CharSequence charArray = "Javier"; //{'J','A','V','I','E','R'};
    sb1 = new StringBuilder(charArray); //CharSequence
    System.out.println(sb1);
    sb1 = new StringBuilder(); //Empty constructor
    System.out.println(sb1);

    sb1 = new StringBuilder("String to test StringBuilder methods");
    System.out.println(sb1);

    sb1.charAt(4);
    System.out.println("charAt(4): " + sb1.charAt(4));

    sb1.indexOf("meth");
    System.out.println("indexOf(\"meth\"): " + sb1.indexOf("meth"));
    sb1.indexOf("Meth");
    System.out.println("indexOf(\"Meth\"): " + sb1.indexOf("Meth"));
    sb1.indexOf("String", 15);
    System.out.println("indexOf(\"String\", 15): " + sb1.indexOf("String", 15));
    sb1.indexOf("String", 30);
    System.out.println("indexOf(\"String\", 30): " + sb1.indexOf("String", 30));

    sb1.substring(15); //StringIndexOutOfBoundsException
    System.out.println("sb1.substring(15);: " + sb1.substring(15));
    /*sb1.substring(100);
    System.out.println("sb1.substring(100): " + sb1.substring(100)); //Exception*/
    //sb1.insert(15, 23.45d);
    System.out.println("sb1.insert(15, 23.45d): " + sb1.insert(15, 23.45d).insert(20, " "));

    System.out.println("sb1.reverse(): " + new StringBuilder(sb1.substring(2, 15)).reverse());

    sb1.subSequence(2, 9); //It does not modify the stringbuilder
    System.out.println("sb1.subSequence(2, 9): " + sb1);

  }
}
