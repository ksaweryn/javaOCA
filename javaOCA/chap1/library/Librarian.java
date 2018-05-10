package chap1.library;

public class Librarian {

  public Librarian(){
    Book book = new Book();
    book.author = "ABC";
    book.modifyTemplate();
    book.issueCount = 1;
    book.issueHistory();
  }

}
