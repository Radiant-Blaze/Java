package Java.Easy.Basic2.Loops.Family_While;

import java.util.Scanner;

public class While_Dowhile
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // EXAMPLE 1

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // EXAMPLE 2

        String response = "";

        while(!response.equals("Q")){
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit");

        // EXAMPLE 3

        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");

        // EXAMPLE 4

        int number = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked number: " + number);

        scanner.close();
    }

}
