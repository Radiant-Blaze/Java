package Final_Project.Beta.Display;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Main
{
    //IMPORTANT VARIABLES
    public boolean running = true;
    public int     choice;
    public static String file_Name = "Products.txt";

    //Methods
    Scanner scanner = new Scanner(System.in);


    public abstract void Display            ();
    public abstract void Check_Condition    ();
    public abstract void Start_Lines        ();

    public void End_Lines                   ()      {System.out.println("------------------------------------------------------------\n");}
    public void What_Will_You_Do_Today      ()      {System.out.println("What will you do today?");}
    public void Line                        ()      {System.out.println();}
    public void Buffer_Remover              ()      {System.out.println();}

    public void Thread_Sleep()
    {
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println("Interrupted (Thread error)");
        }
    }
    public void Selection()
    {
        Line();
        System.out.println("Remember to type  \"NUMBERS\" ONLY ");
        End_Lines();
        System.out.print("Please Select the following: ");

        Check_Condition();
        running = false;
    }

    public void Enter_Choice()
    {
        boolean checking = true;

        while (checking)
        {
            try {
                choice = scanner.nextInt();
                System.out.println();
            } catch (InputMismatchException e)
            {
                System.out.println("Wrong input! Input must be an Integer!");
                End_Lines();
                scanner.nextLine(); // Clear invalid input
                System.out.print("Enter your Choice: ");
                continue;
            }

            checking = false;
        }
    }

}
