public class demoBook extends Book{
    public demoBook(String title, String isbn, int yearPublished, double price) {
        super(title, isbn, yearPublished, price);
    }

    @Override
    protected void buy(String isbn, int quantity, String email, String address) {
       System.out.println("This is a demo book. No purchase can be made");
    }
}
