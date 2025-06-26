package Assignment.Theory.Assignment_3;
import java.util.*;

// 1. User, Customer, DeliveryAgent
class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

class Customer extends User {
    public Customer(String name, String email, String password) {
        super(name, email, password);
    }
}

class DeliveryAgent extends User {
    private Vehicle vehicle;
    private static int agentCounter = 0;

    public DeliveryAgent(String name, String email, String password, Vehicle vehicle) {
        super(name, email, password);
        this.vehicle = vehicle;
        agentCounter++;
    }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }

    public static int agentCount() { return agentCounter; }
}

// 2. Vehicle hierarchy
abstract class Vehicle {
    protected String type;
    public String getType() { return type; }
}

class Scooter extends Vehicle {
    public Scooter() { this.type = "Scooter"; }
}

class Bicycle extends Vehicle {
    public Bicycle() { this.type = "Bicycle"; }
}

// 3. FoodItem
class FoodItem {
    private String itemName;
    private double price;
    private String category;

    public FoodItem(String itemName, double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
}

// 4. Order
class Order {
    private List<FoodItem> foodItems;
    private Customer customer;
    private DeliveryAgent deliveryAgent;
    private Date orderTime;
    private double totalAmount;
    private String deliveryAddress;

    public Order(Customer customer, DeliveryAgent deliveryAgent, List<FoodItem> foodItems, String address) {
        this.customer = customer;
        this.deliveryAgent = deliveryAgent;
        this.foodItems = foodItems;
        this.deliveryAddress = address;
        this.orderTime = new Date();
        this.totalAmount = calculatePrice();
    }

    public double calculatePrice() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }

    public double getTotalAmount() { return totalAmount; }
    public String getDeliveryAddress() { return deliveryAddress; }
}

// 5. PaymentMethod Interface and Implementations
interface PaymentMethod {
    void processPayment(double amount);
}

class WalletPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via Wallet.");
    }
}

class CardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via Card.");
    }
}

class CashPayment implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " via Cash.");
    }
}

// 6. OrderService Interface and Implementation
interface OrderService {
    void placeOrder(Order order);
    void cancelOrder(Order order);
    void completeOrder(Order order);
}

class OrderManager implements OrderService {
    private List<Order> orderList = new ArrayList<>();

    public void placeOrder(Order order) {
        orderList.add(order);
        System.out.println("Order placed for " + order.getTotalAmount() + " PKR");
    }

    public void cancelOrder(Order order) {
        orderList.remove(order);
        System.out.println("Order canceled.");
    }

    public void completeOrder(Order order) {
        System.out.println("Order completed and delivered to " + order.getDeliveryAddress());
    }
}

// 7. Main class with hardcoded data
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali", "ali@example.com", "pass123");
        DeliveryAgent agent = new DeliveryAgent("Khan", "khan@delivery.com", "del123", new Scooter());

        List<FoodItem> cart = new ArrayList<>();
        cart.add(new FoodItem("Burger", 500, "MainCourse"));
        cart.add(new FoodItem("Fries", 200, "Snacks"));

        Order order = new Order(customer, agent, cart, "Street 12, Lahore");

        PaymentMethod payment = new CardPayment();
        payment.processPayment(order.getTotalAmount());

        OrderManager manager = new OrderManager();
        manager.placeOrder(order);
        manager.completeOrder(order);

        System.out.println("Total registered agents: " + DeliveryAgent.agentCount());
    }
}
