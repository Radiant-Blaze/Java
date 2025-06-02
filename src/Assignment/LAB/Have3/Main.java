package Assignment.LAB.Have3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number : ");
        int choice = scanner.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(choice +" * " + i + " = " + choice*i);
        }

        scanner.close();
    }

}

