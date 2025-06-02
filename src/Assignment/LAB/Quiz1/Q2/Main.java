package Assignment.LAB.Quiz1.Q2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        int operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operators ");
        System.out.print("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \nChoice : ");
        operator = scanner.nextInt();

        switch(operator){
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            default -> System.out.println("Invalid operator!");
        }

        System.out.println("The operation of "+ num1 + " and " + num2 + " = " + result);

        scanner.close();
    }
}
