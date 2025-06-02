package Assignment.LAB.Have2;

import java.util.Scanner;

public class Main3
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String user = "admin";
        String pass = "123456";

        System.out.print(" Enter username : ");
        String user_get = scanner.nextLine();

        System.out.print(" Enter password : ");
        String pass_get = scanner.nextLine();

        if(user.equals(user_get) && pass.equals(pass_get))
        {
            System.out.println(" Welcome " + user);
        }else
        {
            System.out.println(" Wrong input!");
        }

        scanner.close();

    }

}
