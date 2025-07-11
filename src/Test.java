public class Test {
    public static void main(String[] args) {
        inventory inv = new inventory();
        inv.addBook(new demoBook("oop c++Grokking Algorithms", "1234567890", 2023, 0.0));
        inv.addBook(new EBook("DSA for beginner", "0987654321", 2022, 9.99, "PDF"));
        inv.addBook(new paperBook("Grokking Algorithms", "1122334455", 2020, 19.99,64));
        inv.addBook(new paperBook("CP algorithm", "2233445566", 2010, 14.99,128));
        inv.buyBook("1234567890", 2,"s7s@fawry", "123 Main St");
        inv.buyBook("0987654321", 1,"s7s@fawry", "456 Elm St");
        inv.buyBook("0987654321", 2,"s7s@fawry", "456 Elm St");
        inv.buyBook("1122334455", 3,"s7s@fawry", "789 Oak St");
        inv.buyBook("1122334455", 70,"s7s@fawry", "79 ak St");
        inv.removeOutDate(2025,3);
    }
}