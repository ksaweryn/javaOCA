package chap1.library;

public class CourseBook extends Book{

  public CourseBook() {
    author = "ABC";
    modifyTemplate();
    issueCount = 1;
    issueHistory();
    //It fail to compile. Below is private
    //countPages();

  }
}
