package chap1.building;

import chap1.library.Book;

public class StoryBook extends Book {

  public StoryBook() {
    author="ABC";
    modifyTemplate();
    //issueCount = 2;
    //issueHistory();

  }

  public Book newBookInstance(){
    Book book = new Book();
    // It does not compile
    // the attribute and method have the default access modifier
    // it only works within the package
    // book.issueCount = 1;
    // book.issueHistory();
    // It does not compile
    // A new instance avoids the use of protected members of a class
    // book.author="DEF";
    return book;
  }

}

private interface Material {

}
