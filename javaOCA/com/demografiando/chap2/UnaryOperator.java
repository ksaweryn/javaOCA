package com.demografiando.chap2;

public class UnaryOperator {

  public static void main (String[] args) {
    double a = 10.0;
    double b = 9.0;
    float c = 10f;
    float d = 9f;

    System.out.println(a * ++b);
    System.out.println(c * --d);
    System.out.println(a + " " + b + " " + c + " " + d);

    int e = 10;
    e = e++ + e + e-- - e-- + ++e;
    System.out.println(e);

    float f = 10.01f;
    float g = 9.09f;

    System.out.println(f + --g);

  }
}
