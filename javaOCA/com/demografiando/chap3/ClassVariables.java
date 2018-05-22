package com.demografiando.chap3;

class ClassVariables {

}

class TestPhone {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    Phone p2 = new Phone();

    System.out.println(p1.softKeyboard);
    System.out.println(p2.softKeyboard);

    Phone.softKeyboard = true; //Accesing to class variable
    System.out.println(p1.softKeyboard);
    System.out.println(p2.softKeyboard);
    System.out.println(Phone.softKeyboard);

  }
}
