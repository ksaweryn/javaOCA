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
  }
}
