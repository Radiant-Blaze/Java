package Java.Programs.Intermediate1.Shopping_cart;

import java.util.Scanner;

public class shopping
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        float price;
        float total;

        System.out.print(" Hello what item would you like to buy : ");
        item = scanner.nextLine();

        System.out.print(" Enter the quantity of " + item + " : ");
        quantity = scanner.nextInt();

        System.out.print(" ENter the price of " + item + " : ");
        price = scanner.nextFloat();

        total = quantity * price ;

        System.out.println(" The total of " + quantity + " of " + item + " is = " + total);

        scanner.close();
    }
}

