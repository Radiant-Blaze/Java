package Java.Programs.Intermediate2.Menu_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Restaurant_Order_Menu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> menu = new HashMap<>();

        menu.put("SANDWICH"         , 1.00);
        menu.put("COLA"             , 0.50);
        menu.put("WHITE COLA"       , 0.50);
        menu.put("NORMAL BURGER"    , 1.00);
        menu.put("CHEEZE BURGER"    , 1.50);
        menu.put("SPECIAL BURGER"   , 3.00);
        menu.put("SPECIAL DEAL"     , 10.00);

        boolean     check = true, loop;
        char        choice;
        String      user_input;
        double      total=0;

        ArrayList<String> items = new ArrayList<>();

        while (check)
        {
            loop = true;

            for(String dish : menu.keySet())
            {
                System.out.printf("Value of %15s is : $ %5.2f\n", dish, menu.get(dish));
            }

            System.out.print("\nEnter the items by name : ");
            user_input = scanner.nextLine().toUpperCase();

            // Optional: Check if item exists
            if (menu.containsKey(user_input))
            {
                System.out.println("Added " + user_input + " to your cart.");
                total += menu.get(user_input);
                items.add(user_input);

            } else
            {
                System.out.println("Item not found!");
            }

            while (loop)
            {
                System.out.println("\nExit?");
                System.out.println("Y to exit, N to continue");
                System.out.print("Choice : ");

                choice = scanner.next().charAt(0);  // Read the character
                scanner.nextLine();  // Consume leftover newline

                if(choice == 'y' || choice == 'Y')
                {
                    check = false;
                    loop = false;

                } else if(choice == 'n' || choice == 'N') // Fixed typo here
                {
                    check = true;
                    loop = false;

                } else
                {
                    System.out.println("Enter a correct choice!");
                }
            }
        }

        System.out.println("You ordered : ");
        for (String item : items)
        {
            System.out.printf("A %15s having price : $ %5.2f\n", item, menu.get(item));
        }

        System.out.printf("Total of your order : %7.2f",total);

        scanner.close();
    }
}
