package Final_Project.Alpha;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Display_Parent
{
    Scanner scanner = new Scanner(System.in);

    boolean running = true;
    int choice;

    public abstract void Display();
    public abstract void check_Condition();
    public abstract void Start_Lines();

    public void End_Lines() {System.out.println("------------------------------------------------------------\n");}
    public void Line() {System.out.println();}

    public void Selection()
    {
        Line();
        System.out.println("Remember to type  \"NUMBERS\" ONLY ");
        End_Lines();
        System.out.print("Please Select the following: ");

        check_Condition();
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
