package com.demografiando.chap4;

public class ArrayExample {

  /* Creating arrays involve three steps, as follows:
    1.- Declaring the array
    2.- Allocating the array
    3.- Initialiazing the array elements
  */

  public static void main(String[] args) {
    //One dimentional array
    test(new String[] {"A", "B", "C"}); //Object array
    testPrimitive(new int[] {1, 2, 3, 4}); //Primitive array
    //The three declaration are the same
    int[] intMultiDimensional[]; //Multidimensional array
    int[][] intMultiDimensional2; //By default is null
    int intMultiDimensional3[][]; //If I do int[3] variable name won't compile
    // array allocation -> it defines the memory size
    intMultiDimensional = new int[2][3];
    intMultiDimensional2 = new int[3][]; //It is also valid to define one of the dimensions of the array
    //intMultiDimensional3 = new int[][]; //it won't compile
    intMultiDimensional3 = new int[Math.max(2, 3)][4]; //Size allocation only accepts integer values or methods returing an int value
    //Array initialization
    intMultiDimensional[0][0] = 1;
    try {
      intMultiDimensional[10][10] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      //import java.lang.ArrayIndexOutOfBoundsException;
      System.out.println("ArrayIndexOutOfBounds-Exception");
    }

    int intArray[];
    intArray = new int[]{0, 1};

    // /int intArray2[];
    //intArray2 = {0, 1}; //it won't compile because you need keyword 'new'
  }

  public static void test(Object[] args) {
    System.out.println(args[1]);
  }

  public static void testPrimitive(int[] args) {
    System.out.println(args[1]);
  }
}
