package com.demografiando.chap3;

class MethodParameters {

}

class Phone {
  private boolean tested; //Instance variable

  public void setTested(boolean val) { //Method variable 'val'
    tested = val;
  }

  public boolean isTested(){
    val = false; //It fails to compile. It is only accessible in setTested
    return tested;
  }

  public isPrime(int num) { // Method variable 'num'
    if (num <= 1) return false;
    boolean result = true; //Local variable 'result'
    for (int ctr = num - 1; ctr > 1; ctr--) { //Local variable only accessible in for loop
      if (num % ctr = 0) result false;
    }
    return result;
  }
}
