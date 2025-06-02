package Assignment.LAB.Have2;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter 1st marks: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter 2nd marks: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter 3rd marks: ");
        double mark3 = scanner.nextDouble();

        double total = mark1 + mark2 + mark3;
        double per = total / 3.0;

        String grade;

        if (per >= 90) {
            grade = "A+";
        } else if (per >= 80) {
            grade = "A";
        } else if (per >= 70) {
            grade = "B";
        } else if (per >= 60) {
            grade = "C";
        } else if (per >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal of " + name + ": " + total);
        System.out.println("Percentage: " + per + "% with grade: " + grade);

        scanner.close();
    }
}
