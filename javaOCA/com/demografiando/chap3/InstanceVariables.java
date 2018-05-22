package com.demografiando.chap3;

class InstanceVariables {

}

class Phone {
  private boolean tested; //Instance variable
  public void setTested(boolean val){
    tested = val; //variable 'tested' is accessible inside the method
  }
  public boolean isTested(){
    return tested;
  }
}
