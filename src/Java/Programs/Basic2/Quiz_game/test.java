package Java.Programs.Basic2.Quiz_game;

import java.util.Scanner;

public class test 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        char choice;
        int points = 0;

        String[] questions ={
                                " Q1) Which colour is imaginary",
                                " Q2) Who is the father of C++",
                                " Q3) What is the capital of France?",
                                " Q4) Which planet is known as the Red Planet?"
                            };
        
        String[][] mcqs    ={
                                { " a) purple" ," b) red", " c) blue", " d) black" },
                                { " a) Tom Holland" ," b) Chris Pratt", " c) Bjarne Stroustrup", " d) George Washington" },
                                { " a) Berlin", " b) Madrid", " c) Paris", " d) Rome" },
                                { " a) Earth", " b) Mars", " c) Jupiter", " d) Venus" }
                            };

        char[] answers   ={
                                'a' , 'c' , 'c' , 'b'
                            };

        for(int i=0; i< questions.length; i++)
        {

            System.out.println(questions[i]);

            for(int j=0; j< questions.length; j++)
            {

                System.out.println(mcqs[i][j]);

            }

            System.out.print(" Enter your choice : ");
            choice = scanner.nextLine().toLowerCase().charAt(0);

            if( choice == answers[i])
            {
                System.out.println(" Correct answer!");
                points++;

            }else
            {

                System.out.println(" Wrong Answer!");

            }

            System.out.println();
        }
        System.out.println(" The point earned are : " + points + " / " + questions.length );

     
        
        scanner.close();
    }
    
}
