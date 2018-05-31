package com.demografiando.chap3;

class Phone {
  double weight;
  void setWeight(double weight) {
    this.weight = weight;//Watch out with the use of the keyword "this"
    //if it is done in with this the result is 10, but without the this word the result is zero
  }

  double getWeight(){
    return weight;
  }
}

class TestMethods {
  public static void main(String... args) {
    Integer weight;
    int weight2;
    Phone p = new Phone();
    //setWeight is void
    //double newWeight = p.setWeight(10.00); //it fails to compile
    p.getWeight();
    p.setWeight(10.00);
    //It fails to compile, incompatible types
    //weight = p.getWeight();
    System.out.println(p.getWeight());
    weight = (int) p.getWeight();//autoboxing is the reason
    weight2 = (int) p.getWeight();
    System.out.println(weight);

  }
}
