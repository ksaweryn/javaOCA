package chap1.building;

import chap1.library.Book;

public class House {

  House () {
    Book book = new Book();
    String value = book.isbn;
    book.printBook();
    //it does not compile for protected instances author and method modifyTemplate
    //book.author="ABC";
    //book.modifyTemplate();
    //It fails to compile error 
    //book.issueHistory();

  }

}
