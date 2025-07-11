import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class inventory {
    private HashMap<String,Book> books;
    public inventory() {
        this.books = new HashMap<>();
    }
    public void addBook(Book book) {
        books.put(book.isbn, book);
    }
    public void removeOutDate(int currentYear, int yearsCount) {
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();
            if (currentYear - book.yearPublished > yearsCount) {
                iterator.remove();
                System.out.println("Removed outdated book: " + book.title);
            }
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book != null) {
            book.buy(isbn, quantity, email, address);
        } else {
            System.out.println("Book not found in inventory.");
        }
    }
}
