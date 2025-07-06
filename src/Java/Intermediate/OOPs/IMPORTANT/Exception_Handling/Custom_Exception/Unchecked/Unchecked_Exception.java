package Java.Intermediate.OOPs.IMPORTANT.Exception_Handling.Custom_Exception.Unchecked;

import java.util.Scanner;

class Custom_exception extends RuntimeException
{
    Custom_exception()
    {
        System.out.println("Custom Unchecked (runtime time) Exception occurred");
    }
}

public class Unchecked_Exception
{
    public static void main(String[] args)
    {
        throw new Custom_exception();
    }
}
