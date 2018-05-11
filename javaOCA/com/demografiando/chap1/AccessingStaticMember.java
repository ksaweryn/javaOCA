package com.demografiando.chap1;

class Emp {
  String name;
  static int bankVault;
  static int getBankVault(){
    return bankVault;
  }
}

class Office {
  public static void main(String args[]){
    Emp emp = null; //Initialized to null;
    System.out.println(emp.bankVault);
    System.out.println(emp.getBankVault());
  }
}
