package Java.Programs.Basic1.Calculator;

import java.util.Scanner;

public class calculator_easy
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        double add,sub,mul,div;

        System.out.print(" Enter first num : ");
        num1 = scanner.nextDouble();

        System.out.print(" Enter second num : ");
        num2 = scanner.nextDouble();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.println(" Add = " + add);
        System.out.println(" Sub = " + sub);
        System.out.println(" Mul = " + mul);
        System.out.println(" Div = " + div);

        scanner.close();
    }
}
