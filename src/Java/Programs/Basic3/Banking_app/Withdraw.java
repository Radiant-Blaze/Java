package Java.Programs.Basic3.Banking_app;

import java.util.Scanner;

public class Withdraw {
    private double updatedBalance;

    Withdraw(double balance) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Banking app----------\n");
        System.out.printf("Total balance = %.2f\n", balance);
        System.out.println(" Enter the amount of money to withdraw ");
        System.out.print("Choice : ");
        double user_get = scanner.nextDouble();

        if (user_get > balance || user_get <= 0) {
            System.out.println("Invalid amount. Must be greater than 0 and less than or equal to balance.");
            updatedBalance = balance;
        } else {
            updatedBalance = balance - user_get;
        }
    }

    double Return_Balance() {
        return updatedBalance;
    }
}
