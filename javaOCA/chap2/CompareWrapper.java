package chap2;

public class CompareWrapper {

  public static void main(String args[]){
    //$ values
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);

    Integer i3 = 10;
    Integer i4 = 10;

    Integer i5 = Integer.valueOf(10);
    Integer i6 = Integer.valueOf(10);

    System.out.println(i1 == i2); //False -> new instances are always diff references
    System.out.println(i3 == i4); //True -> $ values
    System.out.println(i5 == i6); //True -> $ values
    System.out.println(i1 == i3); //False ->new instance vs literal value
    System.out.println(i1 == i6); //False -> new instances vs $ value
    System.out.println(i3 == i5); //True -> $ values

    // Compare equality with equals()

    System.out.println(i1.equals(i2)); //For all cases true
    System.out.println(i3.equals(i4));
    System.out.println(i5.equals(i6));
    System.out.println(i1.equals(i3));
    System.out.println(i1.equals(i6));
    System.out.println(i3.equals(i5));

    //Outside $ values range

    i1 = new Integer(1000);
    i2 = new Integer(1000);

    i3 = 1000;
    i4 = 1000;

    i5 = Integer.valueOf(1000);
    i6 = Integer.valueOf(1000);

    // All false
    System.out.println(i1 == i2);
    System.out.println(i3 == i4);
    System.out.println(i5 == i6);
    System.out.println(i1 == i3);
    System.out.println(i1 == i6);
    System.out.println(i3 == i5);

    //All true
    System.out.println(i1.equals(i2));
    System.out.println(i3.equals(i4));
    System.out.println(i5.equals(i6));
    System.out.println(i1.equals(i3));
    System.out.println(i1.equals(i6));
    System.out.println(i3.equals(i5));

    // Compare diff wrapper classes

    Double d1 = 10.00;
    Float f1 = 10.00f;

    //System.out.println(d1 == f1); //It fails to compile!
    System.out.println(d1.equals(f1)); // Return False

    d1 = Double.valueOf("10");
    f1 = Float.valueOf("10");

    //System.out.println(d1 == f1); //It fails to compile!
    System.out.println(d1.equals(f1)); // Return False


  }
}
