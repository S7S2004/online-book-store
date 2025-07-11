public class paperBook extends Book {
    private int stock;
    public paperBook(String title, String isbn, int yearPublished, double price, int stock) {
        super(title, isbn, yearPublished, price);
        this.stock = stock;
    }
    @Override
    protected void buy(String isbn, int quantity, String email, String address) {
        if (this.isbn.equals(isbn)) {
            if (quantity <= stock) {
                stock -= quantity;
                System.out.println("purchase successful " + quantity + " copies of " + title + "with total paid amount : " + price * quantity + " and have been sent to the ShippingService to shipped to " + address);
            } else {
                System.out.println("insufficient stock for " + title + " only " + stock + " copies available");
            }
        } else {
            System.out.println("ISBN mismatch. Cannot process the purchase.");
        }
    }
}
