package Java.Intermediate.OOPs.IMPORTANT.Exception_Handling.throws_keyword;

class Custom_exception extends Exception
{
    Custom_exception()
    {
        System.out.println("Custom Checked (compile time) Exception occurred");
    }
}

public class Main
{
    public static void main(String[] args) throws Custom_exception
    {
        throw new Custom_exception();
    }
}
