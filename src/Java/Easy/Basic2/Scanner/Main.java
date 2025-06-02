package Java.Easy.Basic2.Scanner;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the length of the rectangle : ");
        length = scanner.nextDouble();


        System.out.print("\n Enter the breadth of the rectangle : ");
        breadth = scanner.nextDouble();

        area = length * breadth;

        System.out.print("\n the area of a rectangle of " + length + " * " + breadth + " = " + area);


        scanner.close();
    }

}
