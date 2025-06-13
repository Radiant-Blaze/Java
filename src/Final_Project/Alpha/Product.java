package Final_Project.Alpha;

public class Product {
    String id, name, mfgDate, expDate;
    double price;
    boolean discount;

    public Product(String id, String name, String mfgDate, String expDate, double price, boolean discount) {
        this.id = id;
        this.name = name.toLowerCase();
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.price = discount ? price * 0.95 : price;  // Apply 5% discount
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-20s | %-12s | %-12s | PKR %-8.2f | Discount: %-3s",
                id, name, mfgDate, expDate, price, (discount ? "Yes" : "No"));
    }
}
