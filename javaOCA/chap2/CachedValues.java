package chap2;

public class CachedValues {
  public static void main(String args[]){
    Long s1 = Long.valueOf("123");
    Long s2 = Long.valueOf(123L);
    Integer i1 = Integer.valueOf("123");
    //Even s1 and s2 are two differente objects they both have the same reference
    //That's becasue de cached value of valurOf() method
    System.out.println(s1 == s2); //TruE
    //System.out.println(s1 == i1); //IT fails to compile two different types

    Long s3 = new Long(123L);

    System.out.println(s3 == s2); //False


  }
}
