package readers;

public class Book {
    String name_of_book;
    String author_of_book;

    public Book() {

    }

    public Book(String name_of_book, String author_of_book) {
        this.name_of_book = name_of_book;
        this.author_of_book = author_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public void setAuthor_of_book(String author_of_book) {
        this.author_of_book = author_of_book;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public String getAuthor_of_book() {
        return author_of_book;
    }
}
