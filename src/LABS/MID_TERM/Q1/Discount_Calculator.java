package LABS.MID_TERM.Q1;

import java.util.Scanner;

public class Discount_Calculator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double og_bill;
        double new_bill;

        System.out.print("Enter your Shopping Bill: ");
        og_bill = scanner.nextDouble();

        if (og_bill < 1000 && og_bill >= 0) {
            new_bill = og_bill;
            System.out.println("NO DISCOUNT APPLIED");
            System.out.println("Original Bill : " + og_bill);
            System.out.println("New      Bill : " + new_bill);

        } else if (og_bill >= 1000 && og_bill <= 4999) {
            new_bill = og_bill - 0.05 * og_bill;
            System.out.println("5% DISCOUNT APPLIED");
            System.out.println("Original Bill : " + og_bill);
            System.out.println("New      Bill : " + new_bill);

        } else if (og_bill >= 5000 && og_bill <= 9999) {
            new_bill = og_bill - 0.1 * og_bill;
            System.out.println("10% DISCOUNT APPLIED");
            System.out.println("Original Bill : " + og_bill);
            System.out.println("New      Bill : " + new_bill);

        } else if (og_bill >= 10000 && og_bill <= 19000) {
            new_bill = og_bill - 0.15 * og_bill;
            System.out.println("15% DISCOUNT APPLIED");
            System.out.println("Original Bill : " + og_bill);
            System.out.println("New      Bill : " + new_bill);

        } else if (og_bill > 20000) {
            new_bill = og_bill - 0.25 * og_bill;
            System.out.println("25% DISCOUNT APPLIED");
            System.out.println("Original Bill : " + og_bill);
            System.out.println("New      Bill : " + new_bill);

        }else{
            System.out.println("Wrong INPUT bill must be POSITIVE");
        }
    }
}
