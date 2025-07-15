import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Thu Vien Khong co sach ");
            return;
        }
        System.out.println(":Danh sach sach trong thu vien:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}