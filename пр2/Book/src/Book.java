public class Book {
    String bookName;
    String authorName;
    int bookYear;
    public Book(String bookName, String authorName, int bookYear){
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookYear = bookYear;
    }
    String getBookName(){
        return bookName;
    }
    String getAuthorName(){
        return authorName;
    }
    int getBookYear(){
        return bookYear;
    }
    void setBookName(String bookName){
        this.bookName = bookName;
    }
    void setAuthorName( String authorName){
        this.authorName = authorName;
    }
    void setBookYear(int bookYear){
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return bookName + " " + authorName + " " + bookYear;
    }
}
