import java.util.Scanner;

public class Library {
    private Book[] books;
    private int count;

    // Constructor to initialize the books array
    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to display all books
    public void displayBook() {
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
            System.out.println();
        }
    }

    // Method to search a book by title
    public void searchBookByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Method to find the most expensive book
    public void findMostExpensiveBook() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }

        Book mostExpensiveBook = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = books[i];
            }
        }
        System.out.println("Most Expensive Book:");
        mostExpensiveBook.displayBook();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5);

        // Allow the user to enter book details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            Book book = new Book(bookId, title, author, price);
            library.addBook(book);
        }

        // Display all books
        System.out.println("\nAll Books in the Library:");
        library.displayBook();

        // Search for a book by title
        System.out.print("\nEnter the title of the book to search: ");
        scanner.nextLine();  // Consume newline
        String searchTitle = scanner.nextLine();
        library.searchBookByTitle(searchTitle);

        // Find the most expensive book
        System.out.println("\nFinding the most expensive book:");
        library.findMostExpensiveBook();

        scanner.close();
    }
}