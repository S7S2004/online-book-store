public abstract class Book {
   protected String title;
   protected String isbn;
   protected int yearPublished;
   protected double price;
    protected Book(String title, String isbn, int yearPublished, double price) {
        this.title = title;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    protected abstract void buy(String isbn,int quantity,String email,String address);
}
