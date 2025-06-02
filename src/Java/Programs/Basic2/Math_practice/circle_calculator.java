package Java.Programs.Basic2.Math_practice;

import java.util.Scanner;

public class circle_calculator
{

    public static void main(String[] args) 
    {
    
        double radius = 0;
        double circumference = 0;
        double area = 0;
        double volume = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the radius of the circle : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        volume        = ( 4.0 /3.0 ) * Math.PI * Math.pow( radius , 3 );
        area          =  Math.PI * Math.pow( radius , 2 );

        System.out.println();

        System.out.println(" The circumference      of the circle having radius " + radius + " is = " + circumference);
        System.out.println(" The volume             of the circle having radius " + radius + " is = " + volume);
        System.out.println(" The area               of the circle having radius " + radius + " is = " + area);

        scanner.close();

    }

}
