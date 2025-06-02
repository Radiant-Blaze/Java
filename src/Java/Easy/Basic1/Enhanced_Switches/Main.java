package Java.Easy.Basic1.Enhanced_Switches;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday 😩");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😀");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
