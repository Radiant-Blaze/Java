package Java.Intermediate.OOPs.IMPORTANT.Exception_Handling.Custom_Exception.Checked;

import java.util.Scanner;

class Custom_exception extends Exception
{
    Custom_exception()
    {
        System.out.println("Custom Checked (compile time) Exception occurred");
    }
}

public class Checked_Exception
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Generate exception? (Y/N) : ");
        char choice = scanner.next().charAt(0);

        try {
            if (choice == 'y' || choice == 'Y') {
                throw new Custom_exception();
            }
        } catch (Custom_exception e) {
            System.out.println("Handled custom exception.");
        }
    }

}