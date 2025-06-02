package Java.Programs.Intermediate2.Countdown_Timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int duration;
        System.out.print("Enter the countdown : ");
        duration = scanner.nextInt();


        Timer       timer = new Timer();
        TimerTask   task  = new TimerTask()
        {
            int duration_here = duration;

            @Override
            public void run()
            {
                System.out.println( duration_here+ " seconds remaining");
                duration_here--;

                if (duration_here == -1)
                {
                    System.out.println("TIMER'S UP!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,0,1000);
    }
}
