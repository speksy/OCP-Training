package ocp._1.reviewQuestions._10;
/*
    10. The following code appears in a file named Book.java. What is the result of compiling the
    source file?

    A. The code compiles successfully, and one bytecode file is generated: Book.class.
    B. The code compiles successfully, and two bytecode files are generated: Book.class and
    BookReader.class.
    C. The code compiles successfully, and two bytecode files are generated: Book.class and
    Book$BookReader.class.
    D. A compiler error occurs on line 3.
    E. A compiler error occurs on line 5.

    Result: C. The code compiles successfully, and two bytecode files are generated: Book.class and
    Book$BookReader.class.

* */
public class Book {
   private int pageNumber;

   private class BookReader {
       public int getPage(){
           return pageNumber;
       }
   }
}
