package Java.Intermediate.OOPs.Basic.Constructors.Overloaded;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Alice");
        User user3 = new User("Bob", "secure123");
        User user4 = new User("Charlie", "pass456", 25);

        user1.info();
        System.out.println();
        user2.info();
        System.out.println();
        user3.info();
        System.out.println();
        user4.info();
    }
}