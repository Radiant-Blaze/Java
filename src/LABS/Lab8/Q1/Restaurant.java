package LABS.Lab8.Q1;

import java.util.Scanner;

public abstract class Restaurant
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select from the following: ");
        System.out.println("1. FastFood     Resturant");
        System.out.println("2. Desi         Resturant");
        System.out.println("3. Chinese      Resturant");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                Restaurant fastFood = new FastFoodRestaurant();
                fastFood.prepareFood();
                break;

            case 2:
                Restaurant desiFood = new DesiRestaurant();
                desiFood.prepareFood();
                break;

            case 3:
                Restaurant chineseFood = new ChineseRestaurant();
                chineseFood.prepareFood();
                break;

            default: System.out.println("Please select between 1-3"); break;
        }

        scanner.close();
    }

    public abstract void prepareFood();
}

class FastFoodRestaurant extends Restaurant
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void prepareFood()
    {
        System.out.println("Welcome to Chad Burger house");
        System.out.println("We have");
        System.out.println("1. Burger");
        System.out.println("2. Cheeze Burger");
        System.out.println("3. Double Burger");
        System.out.print("Selection: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1: System.out.println("Thank you for purchasing Burger");          break;
            case 2: System.out.println("Thank you for purchasing Cheeze Burger");   break;
            case 3: System.out.println("Thank you for purchasing Double Burger");   break;

        }

        scanner.close();
    }
}

class DesiRestaurant extends Restaurant
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void prepareFood()
    {
        System.out.println("Welcome to Haris Pakwan House");
        System.out.println("We have");
        System.out.println("1. Naan Bread");
        System.out.println("2. Chicken Karahi");
        System.out.println("3. Beef Biryani");
        System.out.print("Selection: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: System.out.println("Thank you for purchasing Naan Bread");      break;
            case 2: System.out.println("Thank you for purchasing Chicken Karahi");  break;
            case 3: System.out.println("Thank you for purchasing Beef Biryani");    break;

        }

        scanner.close();
    }
}

class ChineseRestaurant extends Restaurant
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void prepareFood()
    {
        System.out.println("Welcome to Wong 21");
        System.out.println("We have");
        System.out.println("1. Won tons (6 pc only)");
        System.out.println("2. Shrimp Fried Rice");
        System.out.println("3. Veg fried Rice");
        System.out.print("Selection: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: System.out.println("Thank you for purchasing Won tons");            break;
            case 2: System.out.println("Thank you for purchasing Shrimp Fried Rice");   break;
            case 3: System.out.println("Thank you for purchasing Veg fried Rice");      break;

        }

        scanner.close();
    }
}