package com.demografiando.chap3;
/**
  * Class to show the forms to overload methods
  *
  */
class Grade {
  double calAverage(int marks1, int marks2){
    return (marks1 + marks2) / 2.0;
  }

  double calAverage(int marks1, int marks2, int marks3) {
    return (marks1 + marks2) / 3.0;
  }

  double calAverage(int marks1, double marks2) {
    return (marks1 + marks2) / 2.0;
  }

  double calAverage(double marks2, int marks1) {
    return (marks1 + marks2) / 2.0;
  }

  double calAverage(char marks1, char marks2) {
    return (marks1 + marks2) / 2.0;
  }

  double calAverage(int[] marks) {
    return (marks[0] + marks[1]) / 2.0;
  }

  //it fails to compile, basically int[] has the same internal representation as int...
  /*double calAverage(int... marks) {
    return (marks[0] + marks[1]) / 2.0;
  }*/
}

class OverloadError {
    int average(int x, double y) {
      return (int) ((x + y) / 2);
    }

    double average(double x, int y) {
      return (x + y) / 2;
    }
    //Reference is ambiguous, it fails to compile
    public static void main(String... args) {
      average(2, 3);
      average2(2d, 3);
    }

    //They aren't overloaded It fails to compile, ambiguous .
    //They can't have the same name
    int average2(double x, int y) {
      return (int) ((x + y) / 2);
    }

    double average2(double x, int y) {
      return (x + y) / 2;
    }
    //Commented it compiles
}
