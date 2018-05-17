package com.demografiando.chap2;

public class CreateObjectByWrapper {
  public static void main (String[] args) {
    Boolean b1 = true;
    Boolean b2 = new Boolean("false");
    Boolean b3 = Boolean.valueOf("TrUe");

    System.out.println(b1 + " " + b2 + " " + b3);

    Character c1 = 'C';
    Character c2 = new Character('f');
    //Character doesn't accept strings
    System.out.println(c1 + " " + c2);

    Byte by1 = 10;
    Byte by2 = new Byte((byte) 10);//Literal value is always int
    Byte by3 = Byte.valueOf("10");
    System.out.println(by1 + " " + by2 + " " + by3);

    Integer int1 = 10;
    Integer int2 = new Integer(234);
    Integer int3 = Integer.valueOf("2341242");
    Integer int4 = new Integer("23432432");

    System.out.println(int1 + " " + int2 + " " + int3 + " " + int4);

    Double d1 = 10.98;
    Double d2 = new Double(234d);
    Double d3 = Double.valueOf("2341242.9876");
    Double d4 = new Double("23432432.987");

    System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

    Short s1 = 10876;
    Short s2 = new Short((short) 5678); //If I do not cast the literal value is integer
    Short s3 = Short.valueOf("1234");
    Short s4 = new Short("1234");

    System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

  }

}
