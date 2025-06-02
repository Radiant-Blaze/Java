package Java.Programs.Basic3.Library_Book_Tracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Library
{
    Library()
    {
        boolean running = true;
        boolean check   = true;

        int id;
        String name;
        String author;
        char choice;
        boolean available = true;


        ArrayList<Book> Books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (running)
        {
            check = true;

            System.out.print("Enter the book name : ");
            name = scanner.nextLine();

            System.out.print("Enter the id of " + name + " : ");
            id = scanner.nextInt();

            System.out.print("Enter the author of " + name + " : ");
            author = scanner.nextLine();
            scanner.next();

            System.out.println(" Is the book available?");
            System.out.println(" Y for yes or N for No");
            System.out.println(" Choice : ");
            choice = scanner.next().charAt(0);
            if (choice == 'Y' || choice == 'y')
            {
                available = true;
            } else if (choice == 'N' || choice == 'n')
            {
                available =false;
            }

            Books.add( new Book(name, author, id, available));

            while (check)
            {
                System.out.println(" y to continue n to exit");
                System.out.print(" Choice : ");
                choice = scanner.next().charAt(0);
                scanner.nextLine();

                if( choice == 'n' || choice == 'N' )
                {
                    running    = false;
                    check      = false;
                }else if ( choice == 'y'|| choice == 'Y' )
                {
                    check = false;
                    continue;
                }else
                {
                    System.out.println(" Wrong input!\n Try again!");
                }

            }

        }

        for (Book Book : Books)
        {
            System.out.println("Book   : " +Book.id);
            System.out.println("Name   : " +Book.name);
            System.out.println("Author : " +Book.author);
            if (available)
            {
                System.out.println("Book is available for taking");
            }else
            {
                System.out.println("Book is NOT available for taking");
            }

        }


        scanner.close();
    }
}
