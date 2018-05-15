package chap2;

public class Binary {

  public static void main (String[] args) {
    int number = Integer.parseInt(args[0]);
    getBinary(logBaseTwo(number), number);
  }

  public static int logBaseTwo(int number) {
    return (int) Math.ceil(Math.log(number) / Math.log(2));
  }

  public static void getBinary(int exponent, int number) {
    String r = "";
    int remanent = number;

    for (int i = exponent-1; i >= 0; i--) {
      r = String.valueOf(remanent % 2) + r;
      remanent /= 2;
    }

    System.out.println(r);
  }
}
