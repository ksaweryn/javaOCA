package com.demografiando.chap3;

//Encapsulated class
class Phone {
  private double weight; //Instance variable is not accessible outside class

  // Exposing object funcionality using public methods
  public void setWeight(double val) {
    if(val >= 0 && val <= 1000) {
      weight = val;
    }
  }

  // Exposing object funcionality using public methods
  public double getWeight() {
    return weight;
  }
}

//Consumer class
class Home {
  public static void main(String args[]) {
    Phone ph = new Phone();
    ph.setWeight(-12.23); //it's 0.0
    System.out.println(ph.getWeight());
    ph.setWeight(1010); //it's 0.0
    System.out.println(ph.getWeight());
    ph.setWeight(12.23); //It's ok
    System.out.println(ph.getWeight());
  }
}
