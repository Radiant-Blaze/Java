package Final_Project.Alpha;

import java.io.*;
import java.text.*;
import java.util.*;

public class Product_Manipulation extends Display_Parent {
    private final String FILE_NAME       = "products.txt";
    private final List<Product> products = new ArrayList<>();

    // ──────────────────────────── Entry Point ────────────────────────────
    public static void main(String[] args) {
        new Product_Manipulation().Display();
    }

    @Override
    public void Start_Lines() {
        System.out.println("------------- Product Manipulation -------------\n");
    }

    @Override
    public void Display() {
        load();
        boolean running = true;

        while (running) {
            printInventory();  Line();
            printMenu();       Line();

            Enter_Choice();

            switch (choice) {
                case 1 -> addNewProduct();
                case 2 -> incrementStock();
                case 3 -> searchByID();
                case 4 -> searchByName();
                case 5 -> deleteProduct();
                case 6 -> updateProduct();
                case 7 -> sortProducts();
                case 0 -> running = false;
                default -> System.out.println("❌ Invalid choice.");
            }

            save();
            if (running) pressEnterToContinue();
        }

        System.out.println("\n👋 Goodbye!");
    }

    @Override
    public void check_Condition() {
        // Not used — handled in Display()
    }

    // ──────────────────────────── Menu ────────────────────────────
    private void printMenu() {
        System.out.println("1. Add new product");
        System.out.println("2. Increment stock");
        System.out.println("3. Search by ID");
        System.out.println("4. Search by name");
        System.out.println("5. Delete product");
        System.out.println("6. Update product");
        System.out.println("7. Sort products");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    // ──────────────────────────── Actions ────────────────────────────
    private void addNewProduct() {
        scanner.nextLine();
        String  name     = readString("Name                : ").toLowerCase();
        String  mfg      = readDate("MFG Date (dd-MM-yyyy): ");
        String  exp      = readDate("EXP Date (dd-MM-yyyy): ");
        double  price    = readDouble("Price (PKR)         : ");
        int     qty      = readInt   ("Quantity            : ");
        boolean discount = readString("Discount? (yes/no)  : ")
                .equalsIgnoreCase("yes");

        if (discount) {
            price *= 0.95;
        }

        int id = nextID();
        products.add(new Product(id, name, mfg, exp, price, qty, discount));
        System.out.println("✅ Product added (ID = " + id + ")");
    }

    private void incrementStock() {
        if (products.isEmpty()) {
            System.out.println("⚠️ No products to update!");
            return;
        }

        int id  = readInt("ID to increment      : ");
        Product p = findByID(id);
        if (p == null) return;

        int addQty = readInt("Add quantity         : ");
        p.qty += addQty;
        System.out.println("✅ Stock updated: " + p.qty + " units");
    }

    private void searchByID() {
        if (products.isEmpty())                        return;

        int id = readInt("ID to search         : ");
        Product p = findByID(id);
        if (p != null) printSingle(p);
    }

    private void searchByName() {
        if (products.isEmpty())                        return;

        String key = readString("Name to search       : ").toLowerCase();
        boolean found = false;

        for (Product p : products) {
            if (p.name.contains(key)) {
                printSingle(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No matching products.");
        }
    }

    private void deleteProduct() {
        if (products.isEmpty())                        return;

        int id = readInt("ID to delete         : ");
        boolean removed = products.removeIf(p -> p.id == id);
        System.out.println(removed ? "✅ Product deleted." : "❌ ID not found.");
    }

    private void updateProduct() {
        if (products.isEmpty())                        return;

        int id = readInt("ID to update         : ");
        Product p = findByID(id);
        if (p == null) return;

        scanner.nextLine();
        System.out.println("-- Leave blank to keep current --");

        String nm = readString("New name (" + p.name + ")      : ");
        if (!nm.isBlank()) p.name = nm.toLowerCase();

        String nmfg = readDateAllowBlank("New MFG (" + p.mfg + ") : ");
        if (!nmfg.isBlank()) p.mfg = nmfg;

        String nexp = readDateAllowBlank("New EXP (" + p.exp + ") : ");
        if (!nexp.isBlank()) p.exp = nexp;

        String pr = readString("New price (" + p.price + ")     : ");
        if (!pr.isBlank()) p.price = Double.parseDouble(pr);

        String qt = readString("New qty (" + p.qty + ")        : ");
        if (!qt.isBlank()) p.qty = Integer.parseInt(qt);

        String ds = readString("Discount? (yes/no) (" + (p.discount ? "yes" : "no") + ") : ");
        if (!ds.isBlank()) {
            p.discount = ds.equalsIgnoreCase("yes");
            if (p.discount) p.price *= 0.95;
        }

        System.out.println("✅ Product updated.");
    }

    private void sortProducts() {
        if (products.isEmpty()) return;

        System.out.println("Sort by: 1) Name  2) Price asc  3) Price desc");
        int opt = readInt("Choice: ");

        switch (opt) {
            case 1 -> products.sort(Comparator.comparing(p -> p.name));
            case 2 -> products.sort(Comparator.comparingDouble(p -> p.price));
            case 3 -> products.sort(Comparator.comparingDouble((Product p) -> p.price).reversed());
            default -> System.out.println("❌ Invalid sort option.");
        }
    }

    // ──────────────────────────── Helpers ────────────────────────────
    private Product findByID(int id) {
        for (Product p : products) {
            if (p.id == id) return p;
        }
        System.out.println("❌ Product ID not found.");
        return null;
    }

    private void printInventory() {
        if (products.isEmpty()) {
            System.out.println("🪹 Inventory is empty.");
            return;
        }

        System.out.printf("%n%-4s│ %-15s│ %-10s│ %-10s│ %-8s│ %-5s│ %-8s%n",
                "ID", "Name", "MFG", "EXP", "Price", "Qty", "Discount");
        System.out.println("---------------------------------------------------------------------");
        for (Product p : products) {
            System.out.printf("%-4d│ %-15s│ %-10s│ %-10s│ %-8.2f│ %-5d│ %-8s%n",
                    p.id, p.name, p.mfg, p.exp, p.price, p.qty, p.discount ? "Yes" : "No");
        }
    }

    private void printSingle(Product p) {
        System.out.println();
        System.out.printf("ID=" + p.id + " | %s | %s | %s | %.2f | %d | %s%n",
                p.name, p.mfg, p.exp, p.price, p.qty, p.discount ? "Yes" : "No");
    }

    private int nextID() {
        return products.stream().mapToInt(p -> p.id).max().orElse(0) + 1;
    }

    private void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ──────────────────────────── I/O Utility ────────────────────────────
    private String readString(String msg) {
        System.out.print(msg);
        return scanner.nextLine().trim();
    }

    private int readInt(String msg) {
        while (true) {
            try {
                String in = readString(msg);
                return Integer.parseInt(in);
            } catch (NumberFormatException e) {
                System.out.println("❌ Enter a valid integer.");
            }
        }
    }

    private double readDouble(String msg) {
        while (true) {
            try {
                String in = readString(msg);
                return Double.parseDouble(in);
            } catch (NumberFormatException e) {
                System.out.println("❌ Enter a valid number.");
            }
        }
    }

    private String readDate(String msg) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);
        while (true) {
            String in = readString(msg);
            try {
                df.parse(in);
                return in;
            } catch (ParseException e) {
                System.out.println("❌ Use format dd-MM-yyyy.");
            }
        }
    }

    private String readDateAllowBlank(String msg) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);
        while (true) {
            String in = readString(msg);
            if (in.isBlank()) return "";
            try {
                df.parse(in);
                return in;
            } catch (ParseException e) {
                System.out.println("❌ Use format dd-MM-yyyy.");
            }
        }
    }

    // ──────────────────────────── Persistence ────────────────────────────
    private void load() {
        products.clear();
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            br.readLine(); // Skip separator
            String line;
            while ((line = br.readLine()) != null) {
                // Split by pipe | and trim each value
                String[] t = Arrays.stream(line.split("\\|"))
                        .map(String::trim)
                        .toArray(String[]::new);

                if (t.length != 7) continue; // Skip malformed lines

                int id = Integer.parseInt(t[0]);
                String name = t[1];
                String mfg = t[2];
                String exp = t[3];
                double price = Double.parseDouble(t[4]);
                int qty = Integer.parseInt(t[5]);
                boolean discount = t[6].equalsIgnoreCase("yes");

                products.add(new Product(id, name, mfg, exp, price, qty, discount));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("⚠️ Error reading file: " + e.getMessage());
        }
    }


    private void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bw.write(String.format("%-4s│ %-15s│ %-10s│ %-10s│ %-8s│ %-5s│ %-8s%n",
                    "ID", "Name", "MFG", "EXP", "Price", "Qty", "Discount"));
            bw.write("---------------------------------------------------------------------\n");
            for (Product p : products) {
                bw.write(String.format("%-4d│ %-15s│ %-10s│ %-10s│ %-8.2f│ %-5d│ %-8s%n",
                        p.id, p.name, p.mfg, p.exp, p.price, p.qty, p.discount ? "Yes" : "No"));
            }
        } catch (IOException ex) {
            System.out.println("⚠️ Error saving: " + ex.getMessage());
        }
    }

    // ──────────────────────────── Data Class ────────────────────────────
    private static class Product {
        int id, qty;
        String name, mfg, exp;
        double price;
        boolean discount;

        public Product(int id, String name, String mfg, String exp, double price, int qty, boolean discount) {
            this.id = id;
            this.name = name;
            this.mfg = mfg;
            this.exp = exp;
            this.price = price;
            this.qty = qty;
            this.discount = discount;
        }
    }
}
