package chap1.library;

public class Book {
  public String isbn;
  protected String author;
  int issueCount; //default access

  public void printBook(){

  }

  protected void modifyTemplate() {
    countPages();
  }

  void issueHistory() { //default access

  }

  private void countPages(){

  }
}
