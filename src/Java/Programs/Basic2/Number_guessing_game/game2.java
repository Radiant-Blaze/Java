package Java.Programs.Basic2.Number_guessing_game;

import java.util.Random;
import java.util.Scanner;

public class game2 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess= 0;
        int attempts = 0;
        int number = random.nextInt(1,101);

        System.out.println(" Number Guessing game");

        while( guess != number)
        {

            System.out.print(" Enter any number from 1-100 : ");
            guess = scanner.nextInt();

            if (guess < number)
            {
                System.out.println(" Guess too low");
            }else if (guess > number)
            {
                System.out.println(" Guess too high");
            }

            attempts++;

        }

        System.out.printf(" you won in %d attempts",attempts);

        scanner.close();
    }
    
}
