package chap3;

class Phone {
    String phoneNumber = "123456789";
    void setNumber () {
        String phoneNumber; //it stores intermedial values product of calculations
        phoneNumber = "987654321";
    }
}
class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println (p1.phoneNumber);
        System.out.println (total());
        System.out.println (10.00f);
    }

    public static strictfp float total(){
      return 10.00f;
    }
}
