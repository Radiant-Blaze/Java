package Final_Project.Beta.Product_Manipulation;

import Final_Project.Beta.Display.Front;
import Final_Project.Beta.Display.Main;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Add_Products extends Main
{
    Scanner           scanner    = new Scanner(System.in);
    DateTimeFormatter timeFormat =     DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    /*
     * ID                 = 5
     * Name               = 30
     * price              = 10
     * Manufacturing Date = 20
     * Expiry Date        = 20
     * total size         = 85 characters long
     * */

    String name;
    String manufacturing_Date;
    String expiry_Date;
    Double price;
    int    quantity;

    String Line_To_Be_Written_In_The_File;




    @Override
    public void Display()
    {
        while (running)
        {
            Start_Lines();
            Line();

            What_Will_You_Do_Today();
            Line();
            try
            {
                while (true)
                {
                    System.out.println("🕒 Current Time: " + LocalDateTime.now().format(timeFormat)); // Line 45
                    Line();

                    System.out.print("Enter the product's Name: ");
                    name = scanner.nextLine().toLowerCase();
                    Line();

                    if (Duplicate_Name_check(name))
                    {
                        System.out.println("❌ This product name already exists. Please enter a different name.");
                        Line();
                    } else
                    {
                        break;
                    }
                }

                Line();

                System.out.print("Enter the product's Price: ");
                price = scanner.nextDouble();
                Line();

                System.out.print("Enter the product's Quantity: ");
                quantity = scanner.nextInt();
                scanner.nextLine();
                Line();

                do {
                    System.out.print("Enter the product's Manufacturing Date (dd-mm-yyyy): ");
                    Line();
                    manufacturing_Date = scanner.nextLine();

                    if (!Date_Format_Checker(manufacturing_Date))
                    {
                        System.out.println("❌ Invalid format! Please enter in dd-mm-yyyy.");
                        Line();
                    }
                } while (!Date_Format_Checker(manufacturing_Date));

                do {
                    System.out.print("Enter the product's Expiry Date (dd-mm-yyyy): ");
                    Line();
                    expiry_Date = scanner.nextLine();

                    if (!Date_Format_Checker(expiry_Date))
                    {
                        System.out.println("❌ Invalid format! Please enter in dd-mm-yyyy.");
                        Line();
                    }
                } while (!Date_Format_Checker(expiry_Date));
                End_Lines();


            }catch (InputMismatchException e)
            {
                System.out.println("Error occured!");
                System.out.println("Please check the following");
                System.out.println("Name                -> String");
                System.out.println("Price               -> Double (CAN CONTAIN DECIMALS)");
                System.out.println("Quantity            -> Integer (ONLY WHOLE NUMBERS)");
                System.out.println("manufacturing date  -> String");
                System.out.println("expiry        date  -> String");
                Buffer_Remover();
            }

            try
            {
                File file = new File("Products.txt");
                boolean isNewFile = !file.exists() || file.length() == 0;

                FileWriter fileWriter = new FileWriter(file, true); // append mode

                if(isNewFile)
                {
                    fileWriter.write("-------------------------------------------------------------------------------------\n");
                    fileWriter.write(" ID |            Name             |  Price  |    Expiry  Date   | Manufacturing Date|\n");
                    fileWriter.write("-------------------------------------------------------------------------------------\n");
                }

                int last_ID = Get_Last_ID();
                int new_ID = last_ID + 1;

                Line_To_Be_Written_In_The_File = String.format("%-5d%-30s%-10.2f%-20s%-20s\n", new_ID, name, price, expiry_Date, manufacturing_Date);


                fileWriter.write(Line_To_Be_Written_In_The_File);
                fileWriter.close();

                Check_Condition();

            } catch (IOException e)
            {
                System.out.println("IO Exception Occurred!");
            }
        }

        System.out.println("Returning to main screen");
        Thread_Sleep();

        Front front = new Front();
        front.Display();

    }

    @Override
    public void Check_Condition()
    {
        boolean check = true;
        while (check)
        {
            System.out.println("Enter new product? (y/n): ");
            String choice = scanner.nextLine().toLowerCase();

            if(choice.equals("y"))
            {
                check   = false;

            }else if (choice.equals("n"))
            {

                System.out.println("Exiting...");
                running = false;
                check   = false;
            }else
            {
                System.out.println("Wrong Input! Try again!");
            }
        }
    }

    static int Get_Last_ID() {
        int last_ID = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file_Name))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() >= 5 && Character.isDigit(line.charAt(0))) {
                    try {
                        int id = Integer.parseInt(line.substring(0, 5).trim());
                        last_ID = id;
                    } catch (NumberFormatException ignored) {}
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
        return last_ID;
    }

    public boolean Duplicate_Name_check(String new_Name)
    {
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file_Name));

            String name_Checker;

            while ((name_Checker = bufferedReader.readLine()) != null )
            {
                if (name_Checker.length() >= 5 && Character.isDigit(name_Checker.charAt(0)))
                {
                    String existing_name = name_Checker.substring(5, 35).trim().toLowerCase();

                    if (existing_name.equals(new_Name.toLowerCase()))
                    {
                        return true;
                    }
                }

            }

        } catch (FileNotFoundException e)
        {
            System.out.println("File not Found");
        } catch (IOException e)
        {
            System.out.println("IO exception occurred");
        }
        return false;
    }

    public boolean Date_Format_Checker(String date)
    {
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    }



    @Override
    public void Start_Lines() {System.out.println("-----------------Welcome  to  add  products-----------------");}
}
