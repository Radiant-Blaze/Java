package Final_Project.Beta.Product_Manipulation;

import Final_Project.Beta.Display.Front;
import Final_Project.Beta.Display.Main;

import java.io.*;
import java.util.Scanner;

public class Update_Products extends Main
{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void Display()
    {
        Start_Lines();
        Line();

        What_Will_You_Do_Today();
        Line();

        Display_Products displayProducts = new Display_Products();
        displayProducts.Display();

        System.out.println("1. Update by Name");
        System.out.println("2. Update by ID");
        Selection();

        System.out.println("Returning to main screen");
        Thread_Sleep();

        Front front = new Front();
        front.Display();
    }

    @Override
    public void Check_Condition()
    {
        boolean checking = true;

        while (checking)
        {
            Enter_Choice();

            switch (choice)
            {
                case 1 : Update_By_Name(); checking = false;            break;
                case 2 : Update_By_ID();   checking = false;            break;
                default: System.out.println("Enter 1 or 2 only");       break;
            }
        }
    }

    public void Update_By_Name()
    {
        System.out.print("Enter the product name to update: ");
        String nameToUpdate = scanner.nextLine().toLowerCase();
        Line();
        Update_Product(nameToUpdate, -1); // -1 means ID not used
    }

    public void Update_By_ID()
    {
        System.out.print("Enter the product ID to update: ");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine();
        Line();
        Update_Product(null, idToUpdate); // null means name not used
    }

    public void Update_Product(String nameToUpdate, int idToUpdate) {
        boolean repeat = true;

        while (repeat) {
            try {
                File inputFile = new File(file_Name);
                File tempFile = new File("Temp.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String line;
                boolean updated = false;

                while ((line = reader.readLine()) != null) {
                    if (line.length() >= 5 && Character.isDigit(line.charAt(0))) {
                        int id = Integer.parseInt(line.substring(0, 5).trim());
                        String name = line.substring(5, 35).trim().toLowerCase();
                        double oldPrice = Double.parseDouble(line.substring(35, 45).trim());
                        String oldExp = line.substring(45, 65).trim();
                        String oldMfg = line.substring(65, 85).trim();
                        int oldQty = line.length() >= 90 ? Integer.parseInt(line.substring(85).trim()) : 0;

                        boolean match = (nameToUpdate != null && name.equals(nameToUpdate)) ||
                                (idToUpdate != -1 && id == idToUpdate);

                        if (match) {
                            System.out.println("📦 Current Data:");
                            System.out.println("Name: " + name);
                            System.out.println("Price: " + oldPrice);
                            System.out.println("MFG: " + oldMfg);
                            System.out.println("EXP: " + oldExp);
                            System.out.println("Qty: " + oldQty);
                            Line();

                            System.out.print("New Price (Enter to skip): ");
                            String priceInput = scanner.nextLine();
                            double price = oldPrice;
                            if (!priceInput.isEmpty()) {
                                try { price = Double.parseDouble(priceInput); }
                                catch (NumberFormatException e) { System.out.println("❌ Invalid! Using old price."); }
                            }

                            System.out.print("New MFG Date (dd-mm-yyyy, Enter to skip): ");
                            String mfg = scanner.nextLine();
                            if (!mfg.isEmpty() && !Date_Format_Checker(mfg)) {
                                System.out.println("❌ Invalid! Using old MFG date.");
                                mfg = oldMfg;
                            } else if (mfg.isEmpty()) mfg = oldMfg;

                            System.out.print("New EXP Date (dd-mm-yyyy, Enter to skip): ");
                            String exp = scanner.nextLine();
                            if (!exp.isEmpty() && !Date_Format_Checker(exp)) {
                                System.out.println("❌ Invalid! Using old EXP date.");
                                exp = oldExp;
                            } else if (exp.isEmpty()) exp = oldExp;

                            System.out.print("New Quantity (Enter to skip): ");
                            String qtyInput = scanner.nextLine();
                            int qty = oldQty;
                            if (!qtyInput.isEmpty()) {
                                try { qty = Integer.parseInt(qtyInput); }
                                catch (NumberFormatException e) { System.out.println("❌ Invalid! Using old quantity."); }
                            }

                            String updatedLine = String.format("%-5d%-30s%-10.2f%-20s%-20s%-5d\n", id, name, price, exp, mfg, qty);
                            writer.write(updatedLine);
                            updated = true;
                        } else {
                            writer.write(line + "\n");
                        }
                    } else {
                        writer.write(line + "\n");
                    }
                }

                reader.close();
                writer.close();

                if (updated) {
                    inputFile.delete();
                    tempFile.renameTo(inputFile);
                    System.out.println("✅ Product updated.");
                } else {
                    tempFile.delete();
                    System.out.println("❌ Product not found.");
                }

            } catch (IOException e) {
                System.out.println("❌ Error updating product.");
            }

            Line();
            System.out.print("Update another product? (y/n): ");
            String again = scanner.nextLine().toLowerCase();
            repeat = again.equals("y");

            if (repeat) {
                Line();
                if (nameToUpdate != null) {
                    System.out.print("Enter next product name to update: ");
                    nameToUpdate = scanner.nextLine().toLowerCase();
                } else {
                    System.out.print("Enter next product ID to update: ");
                    try {
                        idToUpdate = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Invalid ID, exiting update loop.");
                        break;
                    }
                }
            }
        }
    }

    public boolean Date_Format_Checker(String date)
    {
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    @Override
    public void Start_Lines() {System.out.println("------------------ Product Update Section ------------------");}
}
