package Java.Programs.Basic1.Compound_interest_calculator;

import java.util.Scanner;

public class interest
{

    public static void main(String[] args) 
    {

        double principal = 0;
        double rate = 0;
        int compounded = 0;
        int years = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the principle amount : ");
        principal = scanner.nextDouble();

        System.out.print( "Enter the interest rate in % : ");
        rate = scanner.nextDouble() / 100;

        System.out.print(" Enter the number of times compounded per year : ");
        compounded = scanner.nextInt();

        System.out.print(" Enter the number of years : ");
        years = scanner.nextInt();

        total = principal * Math.pow(1 + rate / compounded, compounded * years);

        System.out.printf("\n\n The total amount after interest is : $ %.2f",total);

        scanner.close();

    }
    
}
