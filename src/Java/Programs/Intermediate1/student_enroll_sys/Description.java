package Java.Programs.Intermediate1.student_enroll_sys;

import java.util.ArrayList;
import java.util.Scanner;

public class Description
{
    

    Description()
    {
        Scanner scanner = new Scanner(System.in);

        int     i = 0;
        boolean is_Running = true;
        boolean check      = true;
        char    choice     = 'a';

        int     age         = -1;
        int     year        = -1;
        double  gpa         = -1;
        String  name        = "ERROR";

        ArrayList< Student > Student_list = new ArrayList<>();
        
        while (is_Running) 
        {

            check =true;
            
            System.out.print(" Enter student \" " + (i + 1 ) + " \" : ");
            name = scanner.nextLine();

            System.out.print("Enter the year of enrollment: ");
            year = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Enter the GPA of " + name + ": ");
            gpa = scanner.nextDouble();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Enter the age of " + name + ": ");
            age = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline


            Student_list.add( new Student( age, year, gpa, name ) );

            i++;
            

            while (check) 
            {
                System.out.println(" y to continue n to exit");
                System.out.print(" Choice : ");
                choice = scanner.next().charAt(0);
                scanner.nextLine();

                if( choice == 'n' )
                {
                    is_Running = false;
                    check      = false;
                }else if ( choice == 'y' )
                {
                    check = false;
                    continue;
                }else
                {
                    System.out.println(" Wrong input!\n Try again!");
                }
                    
                }

                
        }

        for (Student s : Student_list) 
                {
                    System.out.println(" \n--- Student ---");
                    System.out.println(" Name = " + s.name);
                    System.out.println(" Year = " + s.year);
                    System.out.println(" Age  = " + s.age);
                    System.out.println(" GPA  = " + s.gpa);
                }

        scanner.close();
    }
    
}
