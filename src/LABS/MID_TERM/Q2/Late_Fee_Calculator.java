package LABS.MID_TERM.Q2;
import java.util.Scanner;

public class Late_Fee_Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] student = {0,0,0,0,0};
        int days, total=0;

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Enter your late days Student " + (i+1)  + " : ");
            days = scanner.nextInt();

            student[i] = days*2;
        }

        for (int i = 0 ; i < 5 ; i++)
        {
            total = total + student[i];
        }

        for (int i = 0; i < 5 ; i++)
        {
            System.out.println("Late fees of Student " + (1+1) + " : " + student[i] );
        }
        System.out.println("Total fees colected : " + total);

        scanner.close();
    }
}
