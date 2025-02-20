package FirstProject.src.com.mindsprint.project1.assignment;

import java.util.Scanner;

public class Library {
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the library with a fixed size
    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBook();
        }
    }

    // Method to search for a book by title
    public void searchBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                books[i].displayBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title '" + title + "' not found.");
        }
    }

    // Method to find the most expensive book
    public void findMostExpensiveBook() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }

        Book mostExpensiveBook = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = books[i];
            }
        }
        System.out.println("Most expensive book:");
        mostExpensiveBook.displayBook();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5); // Create a library to hold 5 books

        // Input book details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            // Create a new book and add it to the library
            Book book = new Book(bookId, title, author, price);
            library.addBook(book);
        }

        // Display all books
        System.out.println("\nAll books in the library:");
        library.displayAllBooks();

        // Search for a book by title
        System.out.print("Enter a title to search for: ");
        scanner.nextLine(); // Consume newline
        String searchTitle = scanner.nextLine();
        library.searchBookByTitle(searchTitle);

        // Find and display the most expensive book
        library.findMostExpensiveBook();

        scanner.close();
    }
}