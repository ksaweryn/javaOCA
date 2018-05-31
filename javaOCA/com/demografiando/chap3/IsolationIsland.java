package com.demografiando.chap3;

class Exam {
  private String name;
  private Exam other;

  public Exam(String name) {
    this.name = name;
  }

  public void setExam(Exam exam) {

  }
}

class IslandoOfIsolation {
  public static void main (String args[]) {
    Exam php = new Exam("PHP");
    Exam java = new Exam("Java");

    php.setExam(java);
    java.setExam(php);

    php = null;
    java = null;
  }
}
