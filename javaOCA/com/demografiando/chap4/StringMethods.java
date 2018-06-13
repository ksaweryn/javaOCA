package com.demografiando.chap4;

class StringMethods {
  public static void main (String[] args) {
    String s1 = "Testing string methods";
    //chartAt
    System.out.println(s1.charAt(6));
    System.out.println(s1.charAt(2));
    //indexOf
    System.out.println(s1.indexOf('t'));
    System.out.println(s1.indexOf("es"));
    System.out.println(s1.indexOf("J"));
    System.out.println(s1.indexOf('J'));
    System.out.println(s1.indexOf("T"));
    System.out.println(s1.indexOf("t", 6));
    //substring
    System.out.println(s1.substring(6));
    System.out.println(s1.substring(6, 10));
    //trim()
    System.out.println("\n\tJavier Borja\n\tbefore trim");
    System.out.println("\n\tJavier Borja\n\t".trim());
    //replace()
    System.out.println(s1.replace('s','J'));
    System.out.println(s1.replace("string","STRING"));
    


  }
}
