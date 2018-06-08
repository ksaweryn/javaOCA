package com.demografiando.chap3;

class Person {
    private String name;
    Person(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setName(String val) {
        name = val;
    }
}

class Test1{
  public static void resetValueOfMemberVariable(Person p) {
    p.setName("Rodriguez");
  }

  public static void main(String args[]) {
    Person person1 = new Person("Jhon");
    System.out.println(person1.getName());
    resetValueOfMemberVariable(person1);
    System.out.println(person1.getName());
  }
}
