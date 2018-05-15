package chap2;

public class ArgumentPrinter {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No argumnets passed");
      System.exit(0);
    }

    for (int i = 0; i < args.length ; i+=2) {
      System.out.print(args[i]);
    }
    System.out.print("\n");
  }
}
