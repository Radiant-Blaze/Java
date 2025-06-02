package Java.Programs.Basic3.Quiz1_solution;

import java.util.concurrent.Callable;

public class Check
{
    int i ;
    Check()
    {
        i = 17;
    }

    public void Show()
    {
        System.out.println(" Number = " + i);
    }

    public void Prefix_Increment()
    {
        ++i;
    }

    public void Postfix_Increment()
    {
        i++;

    }

    public static void main(String[] args)
    {
        Check check = new Check();

        check.Show();
        check.Prefix_Increment();
        check.Postfix_Increment();
        check.Show();

    }
}
