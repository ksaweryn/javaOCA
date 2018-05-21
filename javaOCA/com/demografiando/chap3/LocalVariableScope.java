package com.demografiando.chap3;

class LocalVariableScope {

}

class Student {
  // Instance variable
  private double marks1, marks2, marks3;
  private double maxMarks = 100;

  public double getAverage() {
    double avg = 0; //Local Variable
    avg = ((marks1 + marks2 + marks3) / maxMarks*3) * 100;
    return avg;
  }

  public double getAverageII() {

      if (maxMarks > 0) {
        //It fails to compile
        double avg = 0; //Local Variable to if-else constructor
        avg = ((marks1 + marks2 + marks3) / maxMarks*3) * 100;
      } else {
        // it is not in the scope. It belongs to if section
        avg = 0;
      }
      return avg;
  }

  public void fowardReference() {
    int a = b; //It fails to compile b is not accessible before its declaration
    int b = 10;
  }

  public void setAverage(double val /*Method parameter*/){
    // It fails to compile because avg is declared inside getAverage. avg is out of the scope of setAverage
    //avg = val;
  }
}
