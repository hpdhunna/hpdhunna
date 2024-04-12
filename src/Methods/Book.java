package Methods;

public class Book {
    String author;
    int year;
    String genre;
    String name;

    public Book(String author, String genre, int year, String name) {
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.name = name;
    }

    public void book1() {
        System.out.println("The author of the book is" + author);
        System.out.println("The year of the book is" + year);
        System.out.println("The genre of the book is" + genre);
        System.out.println("The name of the book is" + name);
    }

    public static void main(String[] args) {
        Book book = new Book("james", "non fiction", 2014, "good to great");
        book.book1();

    }
}