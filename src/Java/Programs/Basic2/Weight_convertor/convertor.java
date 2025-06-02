package Java.Programs.Basic2.Weight_convertor;

import java.util.Scanner;

public class convertor 
{
    
    

    public static void main(String[] args)
    {
        
        double weight = 0;
        double conversion = 0;
        int choice = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Weight convertor\n");
        
        System.out.println(" Enter the following number : ");
        System.out.println(" 1. kg  -> lbs");
        System.out.println(" 2. lbs -> kg");
        System.out.println();
        
        System.out.print(" Enter choice : ");
        choice = scanner.nextInt();

        if(choice == 1)
        {

            System.out.print("\n Enter the weight in kg(s) : ");
            weight = scanner.nextDouble();

            conversion = weight * 2.20462;

            System.out.printf(" The weight in lb(s) is :  %.2f",conversion);

        }else if (choice == 2)
        {

            System.out.print("\n Enter the weight in lb(s) : ");
            weight = scanner.nextDouble();

            conversion = weight * 0.453592;

            System.out.printf(" The weight in kg(s) is :  %.2f",conversion);

        }else
        {
            System.out.println(" Wrong choice enter again!");
        }

        scanner.close();

    }

}
