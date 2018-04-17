package ocp._1.reviewQuestions._2;
/*
    2. What is the result of compiling the following class?

    A. The code compiles.
    B. The code does not compile because hashCode() is incorrect.
    C. The code does not compile because equals() does not override the parent method
    correctly.
    D. The code does not compile because equals() tries to refer to a private field.
    E. The code does not compile because the ClassCastException is not handled or
    declared.
    F. The code does not compile for another reason.

    Result A. The code compiles.
*/
public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode(){
        return ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return this.ISBN == book.ISBN;
    }
}
