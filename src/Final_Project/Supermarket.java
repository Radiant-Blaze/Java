package FInal_Project;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class ProductManager
{
    abstract void addProduct();
    abstract void displayProducts();
    abstract void deleteProduct();
    abstract void updateProduct();
    abstract void checkout();
}

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity)
    {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setters with validation
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }

    public String toFileString() {
        return id + "," + name + "," + price + "," + quantity;
    }
}

public class Supermarket extends ProductManager {
    private static ArrayList<Product> products = new ArrayList<>();
    private static final String FILE_NAME = "products.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----------------ABC Supermarket---------");
        System.out.println("--------Welcome---------");

        loadProducts();
        while (true) {
            System.out.println("\nWhat will you do today?");
            System.out.println("1. Checkout");
            System.out.println("2. Product Section (FOR EMPLOYEES ONLY)");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice >= 1 && choice <= 3) {
                    redirectPause();
                }

                Supermarket manager = new Supermarket();
                switch (choice) {
                    case 1:
                        manager.checkout();
                        break;
                    case 2:
                        manager.productSection();
                        break;
                    case 3:
                        if (exitProgram()) {
                            saveProducts();
                            System.out.println("Good Bye!");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine();
            }
        }
    }

    private static void redirectPause() {
        System.out.println("Redirecting to the page...");
        try {
            Thread.sleep(1000); // 1-second pause
        } catch (InterruptedException e) {
            System.out.println("Pause interrupted: " + e.getMessage());
        }
    }

    private static void loadProducts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);
                    products.add(new Product(id, name, price, quantity));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void saveProducts() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product p : products) {
                writer.write(p.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    @Override
    public void checkout() {
        displayProducts();
        System.out.print("\nEnter product ID or Name to buy (or 'exit' to return): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            redirectPause();
            return;
        }

        try {
            Product selected = findProduct(input);
            if (selected == null) {
                System.out.println("Product not found!");
                return;
            }

            System.out.print("Enter quantity to buy: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            if (qty <= 0) {
                System.out.println("Invalid quantity!");
                return;
            }

            if (qty > selected.getQuantity()) {
                System.out.println("Not enough stock! Available: " + selected.getQuantity());
                return;
            }

            selected.setQuantity(selected.getQuantity() - qty);
            double total = qty * selected.getPrice();
            System.out.println("Purchased " + qty + " " + selected.getName() + "(s) for PKR " + total);
            saveProducts();
            displayProducts(); // Display table after checkout
            redirectPause();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid quantity.");
            scanner.nextLine();
        }
    }

    private void productSection() {
        while (true) {
            displayProducts();
            System.out.println("\nProduct Section (Employees Only)");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Delete Product");
            System.out.println("4. Update Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice >= 1 && choice <= 5) {
                    redirectPause();
                }

                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        displayProducts();
                        break;
                    case 3:
                        deleteProduct();
                        break;
                    case 4:
                        updateProduct();
                        break;
                    case 5:
                        redirectPause();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine();
            }
        }
    }

    @Override
    public void addProduct() {
        try {
            System.out.print("Enter product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            // Immediate validation for zero or negative ID
            if (id <= 0) {
                throw new IllegalArgumentException("Product ID must be positive");
            }

            if (findProduct(String.valueOf(id)) != null) {
                System.out.println("Product ID already exists!");
                return;
            }

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            products.add(new Product(id, name, price, quantity));
            saveProducts();
            System.out.println("Product added successfully!");
            displayProducts(); // Display table after adding
            redirectPause();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data types.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }

    @Override
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        System.out.println("\nProduct List:");
        System.out.println("╔══════╦══════════════════════════════╦══════════╦══════════╗");
        System.out.println("║ ID   ║ Name                         ║ Price    ║ Quantity ║");
        System.out.println("╠══════╬══════════════════════════════╬══════════╬══════════╣");

        for (Product p : products) {
            System.out.printf("║ %-4d ║ %-28s ║ $%-7.2f ║ %-8d ║%n",
                    p.getId(),
                    p.getName().length() > 28 ? p.getName().substring(0, 25) + "..." : p.getName(),
                    p.getPrice(),
                    p.getQuantity());
        }

        System.out.println("╚══════╩══════════════════════════════╩══════════╩══════════╝");
    }

    @Override
    public void deleteProduct() {
        System.out.print("Enter product ID or Name to delete: ");
        String input = scanner.nextLine();

        Product product = findProduct(input);
        if (product == null) {
            System.out.println("Product not found!");
            return;
        }

        products.remove(product);
        saveProducts();
        System.out.println("Product deleted successfully!");
        displayProducts(); // Display table after deleting
        redirectPause();
    }

    @Override
    public void updateProduct() {
        System.out.print("Enter product ID or Name to update: ");
        String input = scanner.nextLine();

        Product product = findProduct(input);
        if (product == null) {
            System.out.println("Product not found!");
            return;
        }

        try {
            System.out.print("Enter new name (or press Enter to keep '" + product.getName() + "'): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                product.setName(name);
            }

            System.out.print("Enter new price (or -1 to keep $" + product.getPrice() + "): ");
            double price = scanner.nextDouble();
            if (price >= 0) {
                product.setPrice(price);
            }

            System.out.print("Enter new quantity (or -1 to keep " + product.getQuantity() + "): ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            if (quantity >= 0) {
                product.setQuantity(quantity);
            }

            saveProducts();
            System.out.println("Product updated successfully!");
            displayProducts(); // Display table after updating
            redirectPause();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data types.");
            scanner.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Product findProduct(String input) {
        try {
            int id = Integer.parseInt(input);
            for (Product p : products) {
                if (p.getId() == id) {
                    return p;
                }
            }
        } catch (NumberFormatException e) {
            for (Product p : products) {
                if (p.getName().equalsIgnoreCase(input)) {
                    return p;
                }
            }
        }
        return null;
    }

    private static boolean exitProgram() {
        System.out.print("Are you sure you want to exit? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            redirectPause();
            return true;
        }
        return false;
    }
}