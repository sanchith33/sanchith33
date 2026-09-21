class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming", "James", 500);
        LibraryBook b2 = new LibraryBook("Python Programming", "Guido", 600);

        b1.displayBook();
        System.out.println();

        b2.displayBook();
        System.out.println();

        LibraryBook.displayBookCount();
    }
}
