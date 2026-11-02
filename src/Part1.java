// Represents a book with a title and an author
class Book {
    // Private fields to ensure data encapsulation
    private String title;
    private String author;

    // Constructor to initialize a new Book object
    public Book (String title, String author) {
        this.title = title; // 'this' differentiates the field from the parameter
        this.author = author;
    }

    // Prints the book details to the console
    public void displayInfo() {
        System.out.println("    Book    ");
        System.out.println("Name: " + title);
        System.out.println("Author: " + author);
    }

    // Getter for the book title
    public String getTitle() { return title; }

    // Setter to update the book title
    public void setTitle(String title) { this.title = title; }

    // Getter for the book author
    public String getAuthor() { return author; }

    // Setter to update the book author
    public void setAuthor(String author) { this.author = author; }
}

// Main class to test the Book class functionality
class Part1 {
    public static void main(String[] args) {
        // Instantiate a new Book object with initial data
        Book myBook = new Book("Guard", "Gorg");

        // Display the initial information
        myBook.displayInfo();

        // Modify the book's title using the setter method
        myBook.setTitle("Fortune");

        // Display the updated information
        myBook.displayInfo();
    }
}
