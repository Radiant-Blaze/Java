package Java.Programs.Basic1.Calculator;

import java.util.Scanner;

public class calculator 
{

    public static void main(String[] args) 
    {
    
        double num1;
        double num2;

        int num1_cpy;
        int num2_cpy;

        double add;
        double sub;
        double mul;
        
        int div_int;
        int rem;

        char select;


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter operation -> ( + - * / )"); 
        System.out.print(" Selection : ");
        select = scanner.next().charAt(0);


        if (select == '+')
        {

            System.out.print("\n Enter 1st num : ");
            num1 = scanner.nextDouble();
    
            System.out.print(" Enter 2nd number : ");
            num2 = scanner.nextDouble();

            add = num1 + num2;

            System.out.printf(" The addition of %f and %f is = %f ", num1, num2, add);

        }else if (select == '-')
        {

            System.out.print("\n Enter 1st num : ");
            num1 = scanner.nextDouble();
    
            System.out.print(" Enter 2nd number : ");
            num2 = scanner.nextDouble();

            sub = num1 - num2;

            System.out.printf(" The subtraction of %f and %f is = %f ", num1, num2, sub);

        }else if (select == '*')
        {

            System.out.print("\n Enter 1st num : ");
            num1 = scanner.nextDouble();
    
            System.out.print(" Enter 2nd number : ");
            num2 = scanner.nextDouble();

            mul = num1 * num2;

            System.out.printf(" The multiplication of %f and %f is = %f ", num1, num2, mul);

        }else if (select == '/')
        {
            System.out.print("\n Enter 1st num : ");
            num1_cpy = scanner.nextInt();
    
            System.out.print(" Enter 2nd number : ");
            num2_cpy = scanner.nextInt();

            div_int = num1_cpy / num2_cpy;
            rem = num1_cpy % num2_cpy;

            if(num2_cpy == 0)
            {
                System.out.println(" Error denominator must not be 0");
            }else
            {

            System.out.printf(" The division  of %d and %d is = %d ", num1_cpy, num2_cpy, div_int);
            System.out.printf(" The remainder of %d and %d is = %d ", num1_cpy, num2_cpy, rem);

            }

        }

        scanner.close();
    }
    
}
