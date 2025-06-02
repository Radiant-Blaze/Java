package Java.Programs.Basic2.Mathlib_game;

import java.util.Scanner;

public class game
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.err.println(" Mathlib game\n");

        String name;
        System.out.print(" Enter the name of first character : ");
        name = scanner.nextLine();

        String name2;
        System.out.print(" Enter the second character : ");
        name2 = scanner.nextLine();

        String place;
        System.out.print(" Enter the place they will stay for some time : ");
        place = scanner.nextLine();

        String action;
        System.out.print(" Enter the thing they will do at " + place + " : ");
        action = scanner.nextLine();

        String villain;
        System.out.print(" Enter the villain : ");
        villain = scanner.nextLine();

        System.out.println("");
        System.out.println( " " + name + " was walking along the street");
        System.err.println(" Where he found a " + name2);
        System.out.println(" " + name + " greeted " + name2 );
        System.out.println(" They walked together and reached " + place);
        System.out.println(" where they " + action);
        System.out.println(" But the " + villain + " got them");
        System.out.println(" Rip " + name + " & " + name2);
        System.out.println(" Now standing across the dead body of " + villain + " I became the honored one");



        scanner.close();
    }
}
