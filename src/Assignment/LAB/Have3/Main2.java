package Assignment.LAB.Have3;

import java.util.Scanner;

public class Main2
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        if ( Character.isAlphabetic( letter ) )
        {
            System.out.println("Letter " + letter + " is alphabet");

            switch (letter)
            {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letter + " is a vowel");
                default -> System.out.println(letter + " is a consonant");
            }

        } else
        {
            System.out.println(letter + " is not a letter");
        }

        scanner.close();
    }
}
