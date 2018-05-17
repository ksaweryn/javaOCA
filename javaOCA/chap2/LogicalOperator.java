package chap2;

public class LogicalOperator {

  public static void main (String[] args){

    int int1 = 10, int2 = 20,  int3 = 30;


    System.out.println(leftValidation() | rightValidation()); // true
    System.out.println(leftValidation() & rightValidation()); // false
    // the two || is shor circuit and | validates both logical operators

    // Module has precedence over multiplication
    System.out.println(int1 % int2 * int3 + int1 / int2); //300

  }

  private static Boolean leftValidation(){
    System.out.println("Left Validation");
    return true;
  }

  private static Boolean rightValidation(){
    System.out.println("Right Validation");
    return false;
  }


}
