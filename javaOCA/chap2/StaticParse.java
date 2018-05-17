package chap2;

public class StaticParse {

  public static void main(String args[]){
    Boolean.parseBoolean("true");
    Boolean.parseBoolean("TRUE");
    Boolean.parseBoolean("TruE"); //Parse isn't case sensitive

    Integer.parseInt("7632478");
    Double.parseDouble("2342.34");
    Float.parseFloat("2342.34");
    Short.parseShort("123");
    Byte.parseByte("12");
    Long.parseLong("1223472428472389");

    System.out.println(Long.parseLong("1223472428472389"));

    //There isn't a parse from string to char
    //It fails to compile
    //Character.parseChar("adad");

    /*It compiles but throws NumberFormatException -- Runtime exception*/
    //I can parse any string but
    //Byte.parseByte("1223472428472389"); //It compiles but gives NumberFormatException

    // Boolean.parseBoolean doesn't throw NumberFormatException, it always returns false
    // If the string to parse isn't true
    Boolean.parseBoolean("sdjfhsj34787jdf");
    System.out.println(Boolean.parseBoolean("12.23"));

  }
}
