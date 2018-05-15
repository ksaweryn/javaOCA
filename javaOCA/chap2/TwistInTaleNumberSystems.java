package chap2;

public class TwistInTaleNumberSystems {
  long var1 = 0_100_267_760;
  /*long var2 = 0_x_4_13; //It fails to compile 0_x not valid
  long var3 = 0b_x10_BA_75;//It fails to compile 0b_x is not a valid combination
  long var4 = 0b_10000_10_11;//It fails to compile not valid use of underscore
  long var5 = 0xa10_AG_75;//It fails to compile*/
  static long var6 = 0x1_0000_10;
  static long var7 = 100_______12_12;// It compiles even with the several underscore

  public static void main (String args[]) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println (baseDecimal + octVal);
        System.out.println (hexVal + binVal);
        System.out.println (var6);
        System.out.println (var7);
    }
}
