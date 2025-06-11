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
            Start_Lines();
            System.out.println("Today's income: ");
            System.out.println("Net     income: ");
            System.out.println("Balance       : ");
            Line();

            System.out.println("What will you do today?");
            Line();

            System.out.println("1. Process Sale");
            System.out.println("2. Check Stock");
            System.out.println("3. Change stock");
            System.out.println("4. Report Monthly/Weekly/Daily");
            Selection();

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
                System.out.println();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Wrong input! Input must be an Integer!");
                End_Lines();
                scanner.nextLine(); // Clear invalid input
                System.out.print("Enter your Choice: ");
                continue;
            }

            switch (choice)
            {
                case 1: System.out.println("We will go to process sale!"); End_Lines();
                        check = false; break;

                case 2: System.out.println("We will go to check stocks"); End_Lines();
                        check = false; break;

                case 3: System.out.println("We will go to change stock"); End_Lines();
                        check = false; break;

                case 4: System.out.println("We will go to check report!"); End_Lines();
                        check = false; break;

                default: System.out.println("Wrong input detected, please select between 1-4"); End_Lines();
                        System.out.print("Enter your Choice: "); break;
            }
        }
    }

    @Override
    public void Start_Lines()
    {
        System.out.println("---------------Welcome to ABC Supermarket App---------------\n");
    }


    public static void main(String[] args)
    {
        Display_Main a = new Display_Main();
        a.Display();
    }

}
