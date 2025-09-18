package tutorial4;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryBookList {
    public static void main(String[] args) {
        Book[] books = {
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("Harry Potter", "J.K. Rowling"),
            new Book("Inferno", "Dan Brown"),
            new Book("Angels & Demons", "Dan Brown"),
            new Book("Rich Dad Poor Dad", "Robert Kiyosaki")
        };

        String searchAuthor = "Dan Brown";
        System.out.println("Books by " + searchAuthor + ":");
        for (Book b : books) {
            if (b.author.equals(searchAuthor)) {
                System.out.println("- " + b.title);
            }
        }
    }
}
