package Java.Programs.Basic2.Food_user_input;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.print("Enter the food you like to eat (n to quit): ");
            String input = scanner.nextLine();

            if (input.equals("n")) {
                running = false;
            } else {
                foods.add(input); // Only add if it's not "n"
            }
        }

        System.out.println("\nFoods you entered:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
