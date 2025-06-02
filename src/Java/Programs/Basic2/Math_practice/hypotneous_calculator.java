package Java.Programs.Basic2.Math_practice;

import java.util.Scanner;

public class hypotneous_calculator
{
    
   

    public static void main(String[] args) 
    {
    
        double perpendicular = 0;
        double base = 0;
        double hypotneous = 0;


        //hypo c = Math.sqrt( pow(a,2) + pow(b,2) )

        Scanner scanner = new Scanner(System.in);

        System.out.print( " Enter the base of triangle : ");
        base = scanner.nextDouble();

        System.out.print(" Enter the perpendicular of the triangle : ");
        perpendicular = scanner.nextDouble();


        hypotneous = Math.sqrt( Math.pow(base,2) + Math.pow(perpendicular,2) );

        System.out.println(" The hypotneous of the triangle is : " + hypotneous);

        scanner.close();
    }

}
