package Java.Intermediate.OOPs.IMPORTANT.Exception_Handling.Try_Catch_Finalize;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("With try-catch");
        System.out.print("Enter integer data: ");

        int data;

        try {data = scanner.nextInt();}
        catch (InputMismatchException e) {System.out.println("Wrong datatype input!");}
        finally {System.out.println("Exiting");}

        scanner.nextLine(); //java is dumb clear \n input

        System.out.println();
        System.out.println("Without try-catch");
        System.out.print("Enter integer data: ");
        data = scanner.nextInt();
        System.out.println("Will only show if exception not occurred");
    }
}
