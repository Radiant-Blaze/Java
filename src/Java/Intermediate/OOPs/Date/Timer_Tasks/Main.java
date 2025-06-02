package Java.Intermediate.OOPs.Date.Timer_Tasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {
        Timer      timer = new Timer();
        TimerTask  task  = new TimerTask()
        {
            int count = 1;

            @Override
            public void run()
            {
                count ++;
                System.out.println("Hello " + (count-1) + " seconds have passed");

                if(count == 11)
                {
                    System.out.println("TIMER STOPPED");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,1000,1000);

    }
}
