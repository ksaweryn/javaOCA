package chap2;

import java.util.ArrayList;

public class BoxingUnboxing {

  public static void main(String args[]) {

    Double d1 = new Double(27.28);
    System.out.println(d1.compareTo(30.00)); //Autoboxing

    ArrayList<Double> list = new ArrayList<Double>();
    list.add(10.23); //Autoboxing
    list.add(11.24);
    Double total = 0.0; //Autoboxing
    for (Double d : list) {
      total += d; //Unboxing - Wrapper is inmutable, a new object is created
    }
    System.out.println(total); //Unboxing
  }

}
