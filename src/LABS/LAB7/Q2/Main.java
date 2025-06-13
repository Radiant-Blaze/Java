package LABS.LAB7.Q2;

import java.util.Scanner;

public abstract class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select from the following: ");
        System.out.println("1. Standard delivery");
        System.out.println("2. Express delivery");
        System.out.println("3. Pickup delivery");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                Main standard = new StandardDelivery();
                standard.Delivery();
                break;

            case 2:
                Main express = new ExpressDelivery();
                express.Delivery();
                break;

            case 3:
                Main pickup = new PickupDelivery();
                pickup.Delivery();
                break;

            default:
                System.out.println("Enter between 1-3 only");
        }

        scanner.close();
    }

    public abstract void Delivery();
}

class StandardDelivery extends Main
{

    @Override
    public void Delivery()
    {
        System.out.println("Standard delivery: Will arrive in 3-5 days.");
    }
}

class ExpressDelivery extends Main
{

    @Override
    public void Delivery()
    {
        System.out.println("Express delivery: Will arrive within 24 hours.");
    }
}

class PickupDelivery extends Main
{

    @Override
    public void Delivery()
    {
        System.out.println("Pickup scheduled: Be ready at your address.");
    }
}