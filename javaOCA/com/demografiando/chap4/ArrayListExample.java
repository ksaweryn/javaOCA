package com.demografiando.chap4;

import java.util.ArrayList; //Import the package
import java.util.ListIterator;

public class ArrayListExample {
  public static void main(String args[]) {
    ArrayList<StringBuilder> myArrayList = new ArrayList<StringBuilder>();
    ArrayList<Integer> myArrayListInt = new ArrayList<>(); //this is redundant no necessary

    myArrayList.add(new StringBuilder("One"));
    myArrayList.add(new StringBuilder("Two"));
    myArrayList.add(new StringBuilder("Three"));
    myArrayList.add(new StringBuilder("Four"));

    myArrayListInt.add(0);
    myArrayListInt.add(1);
    myArrayListInt.add(2);
    myArrayListInt.add(3, 3);
    myArrayListInt.set(2, 22);
    //myArrayListInt.addAll(4, {4, 5, 6});

    for (Integer i : myArrayListInt) {
      System.out.println(i);
    }

    ListIterator<Integer> iterator = myArrayListInt.listIterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    myArrayListInt.set(2, 22);
    for (Integer i : myArrayListInt) {
      System.out.println(i);
    }

    for (StringBuilder element : myArrayList) {
      element.append("10");
    }

    ListIterator<StringBuilder> iterator2 = myArrayList.listIterator();
    while (iterator2.hasNext()) {
        System.out.println(iterator2.next());
    }

    ArrayList<StringBuilder> clonedArray = (ArrayList<StringBuilder>) myArrayList.clone();

    clonedArray.set(0, clonedArray.get(0).append("TESTING")); //Modifies the mutable element
    clonedArray.set(1, new StringBuilder("DOS")); //Creates a new object ergo a new reference

    iterator2 = clonedArray.listIterator();
    while (iterator2.hasNext()) {
        System.out.println(iterator2.next());
    }
    iterator2 = myArrayList.listIterator();
    while (iterator2.hasNext()) {
        System.out.println(iterator2.next());
    }
  }
}

class BankAccount {
  String acctNumber;
  int accType;

  public boolean equals(Object obj) {
  //public boolean equals(BankAccount obj) {
    /*if (obj != null) {
      return (acctNumber.equals(obj.acctNumber) && accType == obj.accType);
    } else {
      return false;
    }*/
    if (obj instanceof BankAccount) {
      BankAccount b = (BankAccount) obj;
      return (acctNumber.equals(b.acctNumber) && accType == b.accType);
    } else {
      return false;
    }
  }
}

class TestMethodEquals {
  public static void main(String... args) {
    BankAccount b1 = new BankAccount();
    b1.acctNumber = "01";
    b1.accType = 1;
    ArrayList <BankAccount> list = new ArrayList();
    list.add(b1);
    BankAccount b2 = new BankAccount();
    b2.acctNumber = "01";
    b2.accType = 1;
    System.out.println(list.contains(b2));
  }
}
