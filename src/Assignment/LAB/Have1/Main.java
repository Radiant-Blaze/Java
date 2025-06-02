package Assignment.LAB.Have1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        /* IMPORTANT
         * clear screen if in vs. code by typing cls and entering it
         * otherwise the escape sequence used below will misbehave altering the behavior
         */

        String name;
        int Roll_no;
        double pf, pf_lab, ap, eng, cal, tot, per, Cgpa;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Name : ");
        name = Scanner.nextLine();

        System.out.print("Roll no. : CYS-");
        Roll_no = Scanner.nextInt();

        System.out.println("\nEnter MARKS\n");
        System.out.print("Programming Fundamentals: ");
        pf = Scanner.nextDouble();

        System.out.print("Programming Fundamentals Lab: ");
        pf_lab = Scanner.nextDouble();

        System.out.print("Applied Physics: ");
        ap = Scanner.nextDouble();

        System.out.print("English: ");
        eng = Scanner.nextDouble();

        System.out.print("Calculus: ");
        cal = Scanner.nextDouble();

        /*  Mam this snippet I used for clearing screen
         * from stack overflow that mimics the behavior of
         * system("cls") from C language
         */

        /* the behavior caused by this snippet is due to the
         * fact we are clearing from the top boundary of terminal
         * ANSI is confusing
         * also do cls too if running another program again
         */

        System.out.print("\033[H\033[2J");
        System.out.flush();

        tot = pf + pf_lab + ap + eng + cal;
        per = (tot / 500) * 100;


        if (per >= 90)
        {
            Cgpa = 4.0;
        }else if (per >= 80)
        {
            Cgpa = 3.7;
        }else if (per >= 70)
        {
            Cgpa = 3.0;
        }else if (per >= 60)
        {
            Cgpa = 2.5;
        }else if (per >= 50)
        {
            Cgpa = 2.0;
        }else
        {
            Cgpa = 0.0;
        }

        // WE CAN USE printf for cleaner view

        System.out.println("--------------------------------------------");
        System.out.println("             DHA SUFFA UNIVERSITY           ");
        System.out.println("--------------------------------------------");
        System.out.println("\n                  Transcript                ");
        System.out.println("--------------------------------------------");
        System.out.println("\nName : " + name + "    Roll no. : CYS-" + Roll_no);
        System.out.println("--------------------------------------------");
        System.out.println("Subjects                          Marks     ");
        System.out.println("--------------------------------------------");
        System.out.printf("Programming Fundamentals             %.2f\n", pf);
        System.out.printf("Programming Fundamentals Lab         %.2f\n", pf_lab);
        System.out.printf("Applied Physics                      %.2f\n", ap);
        System.out.printf("English                              %.2f\n", eng);
        System.out.printf("Calculus                             %.2f\n", cal);
        System.out.println("--------------------------------------------");
        System.out.printf("Total Marks  : %.2f / 500.0\n", tot);
        System.out.printf("Percentage   : %.2f%%\n", per);
        System.out.printf("CGPA         : %.2f\n", Cgpa);

        Scanner.close();
    }
}
