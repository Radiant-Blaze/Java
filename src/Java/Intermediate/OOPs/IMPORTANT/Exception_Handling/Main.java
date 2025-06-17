package Java.Intermediate.OOPs.IMPORTANT.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        System.out.print("Enter ID: ");

        try
        {
            id = scanner.nextInt();

            if (id < 0)
            {
                throw new ArithmeticException("ID can't be less than 1");
            }

        }catch (InputMismatchException e)
        {
            System.out.println("Wrong input enter int datatype");
        }finally
        {
            System.out.println("Exiting");
        }

        System.out.println("ID = " + id);
    }

}
