package Java.Programs.Basic1.Banking_program;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        boolean running = true;

        while (running) {
            int choice = introduction(scanner);

            switch (choice) {
                case 1:
                    show_balance(balance);
                    break;
                case 2:
                    balance -= withdraw_cash(scanner, balance);
                    break;
                case 3:
                    balance += deposit_cash(scanner);
                    break;
                case 4:
                    System.out.println("\nThank you for using the Banking App. Goodbye!");
                    running = false;
                    break;
            }
        }
        scanner.close();
    }

    // Introduction Menu
    static int introduction(Scanner scanner) {
        int choice;
        
        while (true) {
            System.out.println("\n---------------------");
            System.out.println("    BANKING PROGRAM   ");
            System.out.println("---------------------");
            System.out.println("\nWelcome! Enter your choice:");
            System.out.println(" 1. Show Balance");
            System.out.println(" 2. Withdraw Cash");
            System.out.println(" 3. Deposit Cash");
            System.out.println(" 4. Exit");
            
            System.out.print("Choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("⚠️ Invalid choice! Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Show Balance
    static void show_balance(double balance) {
        System.out.printf("\n💰 Your current balance: $%.2f\n", balance);
    }

    // Withdraw Cash
    static double withdraw_cash(Scanner scanner, double balance) {
        double cash;

        while (true) {
            System.out.printf("\n💰 Balance: $%.2f\n", balance);
            System.out.print("Enter amount to withdraw: ");

            if (scanner.hasNextDouble()) {
                cash = scanner.nextDouble();

                if (cash > 0 && cash <= balance) {
                    return cash;
                } else {
                    System.out.printf("⚠️ Invalid amount! Enter a value between $0 and $%.2f.\n", balance);
                }
            } else {
                System.out.println("⚠️ Invalid input! Please enter a valid amount.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Deposit Cash
    static double deposit_cash(Scanner scanner) {
        double cash;

        while (true) {
            System.out.print("\nEnter amount to deposit: ");

            if (scanner.hasNextDouble()) {
                cash = scanner.nextDouble();

                if (cash > 0) {
                    return cash;
                } else {
                    System.out.println("⚠️ Invalid amount! Please enter a positive value.");
                }
            } else {
                System.out.println("⚠️ Invalid input! Please enter a valid amount.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
