public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1,"The Great Gatsby");
        Book book2 = new Book(2, "1984");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
