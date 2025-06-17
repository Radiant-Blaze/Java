package Java.Intermediate.OOPs.IMPORTANT.Garbage_Collection.Type1;

class Object
{
    void Display()
    {
        System.out.println("Hello World");
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Object object = new Object();
        object.Display();

        object = null;      //Garbage Collection

        try
        {
            object.Display();

        }catch (NullPointerException e)
        {
            System.out.println("Object does not exist");
        }
    }
}
