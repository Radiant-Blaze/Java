package Java.Programs.Basic3.Banking_app;

import java.util.Scanner;

public class Description
{
    Description(double balance)
    {
        Scanner scanner = new Scanner(System.in);

        int check;
        boolean running = true;

        while (running)
        {
            System.out.println("----------Banking app----------\n");
            System.out.printf("Total balance = %.2f\n",balance);
            System.out.println("Choice");
            System.out.println(" 1. Withdraw");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. Exit\n");
            System.out.print("Enter the choice : ");
            check = scanner.nextInt();

            if(check == 1)
            {
                Withdraw withdraw = new Withdraw(balance);
                balance = withdraw.Return_Balance();

            }else if(check == 2)
            {
                Deposit deposit = new Deposit(balance);
                balance = deposit.Return_Balance();

            } else if (check == 3)
            {
                running = false;
            }
        }

        scanner.close();
    }
}
