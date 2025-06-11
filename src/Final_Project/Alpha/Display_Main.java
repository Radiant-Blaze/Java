package Final_Project.Alpha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display_Main extends Display_Parent
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void Display()
    {
        while (running)
        {
            System.out.println("----Welcome to ABC Supermarket----");
            System.out.println("Today's income: ");
            System.out.println("Net     income: ");
            System.out.println("Balance       : ");
            System.out.println();
            System.out.println("What will you do today?");
            System.out.println();
            System.out.println("1. Process Sale");
            System.out.println("2. Check Stock");
            System.out.println("3. Change stock");
            System.out.println("4. Report Monthly/Weekly/Daily");
            System.out.println("----------------------------------");
            System.out.print("Enter your Choice: ");

            check_Condition();
            running = false;

        }
    }

    @Override
    public void check_Condition()
    {
        boolean check = true;
        while (check)
        {
            try
            {
                choice = scanner.nextInt();
            } catch (InputMismatchException e)
            {
                System.out.println("Wrong input! Input  ust be in Integer!");
                System.out.print("Enter your Choice: ");
                scanner.nextLine();
                continue;
            }

            if(choice == 1)
            {
                System.out.println("We will go to process sale!");
                check = false;

            }else if (choice == 2)
            {
                System.out.println("We will go to check stocks");
                check = false;

            } else if (choice == 3)
            {
                System.out.println("We will go to change stock");
                check = false;

            } else if (choice == 4)
            {
                System.out.println("We will go to check report!");
                check = false;

            }else
            {
                System.out.println("Wrong input detected please select between 1-4");
                System.out.print("Enter your Choice: ");
            }
        }

    }

    public static void main(String[] args)
    {
        Display_Main a = new Display_Main();
        a.Display();
    }

}
