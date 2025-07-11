public class EBook extends Book {
    private String filetype;
    public EBook(String title, String isbn, int yearPublished, double price, String filetype) {
        super(title, isbn, yearPublished, price);
        this.filetype = filetype;
    }
    @Override
    protected void buy(String isbn, int quantity, String email, String address) {
        if (this.isbn.equals(isbn)) {
            System.out.println("purchase successful " + quantity + " copies of " + title + " with total paid amount: " + price * quantity + " and have been sent to the MailService to be sent to email: " + email);
        } else {
            System.out.println("ISBN mismatch. Cannot process the purchase.");
        }
    }
}
