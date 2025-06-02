package Assignment.LAB.Have2;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String eligible = (age < 18) ? "Not eligible" : "Eligible";

        System.out.println(eligible);

        scanner.close();
    }
}
