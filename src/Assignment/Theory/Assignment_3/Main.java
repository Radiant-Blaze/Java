package Assignment.Theory.Assignment_3;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        DeliveryAgent agent1 = new DeliveryAgent(1, "Hamid Mir", "hamid@gmail.com", "123");
        DeliveryAgent agent2 = new DeliveryAgent(2, "Aoi Hiro", "aoi@gmail.com", "456");

        Customer customer1 = new Customer("Tahir Shamsi", "tahir@gmail.com", "abc", agent1, "Karachi DHA Phase 1");

        System.out.println("Available Agents: " + DeliveryAgent.getAgentCount());
        DeliveryAgent.showVehicleCount();

        customer1.placeOrder(); // Start order process
    }
}

// ---------------- ENUM ----------------
enum FoodCategory {
    MAIN_COURSE, SNACK
}

// ---------------- USER CLASS ----------------
class User {
    private String name, email, password;

    public User(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

// ---------------- CUSTOMER ----------------
class Customer extends User {
    private String address;
    private DeliveryAgent agent;

    public Customer(String name, String email, String password, DeliveryAgent agent, String address) {
        super(name, email, password);
        this.agent = agent;
        this.address = address;
    }

    public void placeOrder() {
        OrderManager orderManager = new OrderManager(this, agent, address);
        orderManager.placeOrder();
    }
}

// ---------------- DELIVERY AGENT ----------------
class DeliveryAgent extends User {
    private static int agentCount = 0;
    private static int scooterCount = 0;
    private static int bicycleCount = 0;

    private String vehicle;

    public DeliveryAgent(int vehicleType, String name, String email, String password) {
        super(name, email, password);
        agentCount++;
        if (vehicleType == 1) {
            vehicle = "Scooter";
            scooterCount++;
        } else if (vehicleType == 2) {
            vehicle = "Bicycle";
            bicycleCount++;
        } else {
            vehicle = "Unknown";
        }
    }

    public static int getAgentCount() {
        return agentCount;
    }

    public static void showVehicleCount() {
        System.out.println("Scooters: " + scooterCount);
        System.out.println("Bicycles: " + bicycleCount);
    }

    public void displayAgentInfo() {
        System.out.println("Agent Name: " + getName());
        System.out.println("Vehicle   : " + vehicle);
    }

    public void acceptOrder(Order order) {
        System.out.println("Order accepted by Agent: " + getName());
    }
}

// ---------------- FOOD ITEM ----------------
class FoodItem {
    private String name;
    private double price;
    private FoodCategory category;

    public FoodItem(String name, double price, FoodCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " (" + category + ") - Rs. " + price;
    }
}

// ---------------- ORDER CLASS ----------------
class Order {
    private ArrayList<FoodItem> items = new ArrayList<>();
    private LocalDateTime orderTime;
    private double totalAmount;
    private Customer customer;
    private DeliveryAgent agent;
    private String deliveryAddress;

    public Order(Customer customer, DeliveryAgent agent, String deliveryAddress) {
        this.customer = customer;
        this.agent = agent;
        this.deliveryAddress = deliveryAddress;
        this.orderTime = LocalDateTime.now();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public void calculateTotal() {
        totalAmount = 0;
        for (FoodItem item : items) {
            totalAmount += item.getPrice();
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void printSummary() {
        System.out.println("\n================= ORDER SUMMARY =================");
        System.out.printf("%-5s | %-20s | %-12s | %-10s\n", "No.", "Item Name", "Category", "Price (Rs.)");
        System.out.println("---------------------------------------------------------------");

        int index = 1;
        for (FoodItem item : items) {
            String name = item.toString().split(" \\(")[0]; // Extract clean name
            String cat = item.toString().split("\\(")[1].split("\\)")[0]; // Extract category
            double price = item.getPrice();
            System.out.printf("%-5d | %-20s | %-12s | %-10.2f\n", index++, name, cat, price);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-40s : Rs. %.2f\n", "Total Amount", totalAmount);
        System.out.printf("%-40s : %s\n", "Delivery Address", deliveryAddress);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTime = orderTime.format(formatter);
        System.out.printf("%-40s : %s\n", "Order Time", formattedTime);

        System.out.println("===============================================================");
    }
}
// ---------------- PAYMENT INTERFACE ----------------
interface PaymentMethod {
    void processPayment(double amount);
}

class WalletPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " via Wallet.");
    }
}

class CardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " via Card.");
    }
}

class CashPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " in Cash.");
    }
}

// ---------------- ORDER SERVICE ----------------
interface OrderService {
    void placeOrder();
    void cancelOrder();
    void completeOrder();
}

// ---------------- ORDER MANAGER ----------------
class OrderManager implements OrderService {
    private Customer customer;
    private DeliveryAgent agent;
    private String address;
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public OrderManager(Customer customer, DeliveryAgent agent, String address) {
        this.customer = customer;
        this.agent = agent;
        this.address = address;
        this.order = new Order(customer, agent, address);
    }

    private FoodItem[] menu = {
            new FoodItem("Burger", 300, FoodCategory.MAIN_COURSE),
            new FoodItem("Fries", 150, FoodCategory.SNACK),
            new FoodItem("Cold Drink", 80, FoodCategory.SNACK),
            new FoodItem("Cheese Burger", 500, FoodCategory.MAIN_COURSE),
            new FoodItem("Salad", 200, FoodCategory.SNACK)
    };

    @Override
    public void placeOrder() {
        boolean running = true;
        while (running) {
            System.out.println("\n================= FOOD MENU =================");
            System.out.printf("%-5s | %-20s | %-12s | %-10s\n", "No.", "Item Name", "Category", "Price (Rs.)");
            System.out.println("---------------------------------------------------------------");

            for (int i = 0; i < menu.length; i++) {
                String name = menu[i].toString().split(" \\(")[0]; // clean name
                String cat = menu[i].toString().split("\\(")[1].split("\\)")[0]; // extract category
                double price = menu[i].getPrice();
                System.out.printf("%-5d | %-20s | %-12s | %-10.2f\n", (i + 1), name, cat, price);
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println("Press 0 to finish order");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                running = false;
            } else if (choice > 0 && choice <= menu.length) {
                order.addItem(menu[choice - 1]);
                System.out.println("Added to order.");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("\n1. Cancel Order\n2. Complete Order");
        int decision = scanner.nextInt();

        if (decision == 1) {
            cancelOrder();
        } else if (decision == 2) {
            completeOrder();
        }
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }

    @Override
    public void completeOrder() {
        order.calculateTotal();
        order.printSummary();

        agent.acceptOrder(order);
        agent.displayAgentInfo();

        System.out.println("\nSelect Payment Method:\n1. Wallet\n2. Card\n3. Cash");
        int payChoice = scanner.nextInt();

        PaymentMethod payment;

        switch (payChoice) {
            case 1: payment = new WalletPayment(); break;
            case 2: payment = new CardPayment(); break;
            case 3: payment = new CashPayment(); break;
            default:
                System.out.println("Invalid. Defaulting to Cash.");
                payment = new CashPayment();
        }

        payment.processPayment(order.getTotalAmount());
        System.out.println("Thank you for your order!");
    }
}
