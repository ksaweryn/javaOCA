package com.demografiando.chap3;

class Person {
  static double weight;

  static double getWeight(){
    if (weight <= 0) return 0;
    return weight;
  }

  static void setWeight(double tmp){
    if (tmp <= 0) return;
    weight = tmp;
  }

  static void printWeight(){
    //return;
    //It fails to compile - unreachable statement
    System.out.println(getWeight());
    return;
  }

  public static void main(String... args){
    setWeight(0);
    //System.out.println(getWeight());
    printWeight();
    setWeight(10);
    //System.out.println(getWeight());
    printWeight();

  }
}
