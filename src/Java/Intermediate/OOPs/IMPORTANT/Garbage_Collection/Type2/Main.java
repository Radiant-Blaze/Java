package Java.Intermediate.OOPs.IMPORTANT.Garbage_Collection.Type2;

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
        Object object1 = new Object();
        Object object2 = new Object();

        object1 = object2;

        object1.Display();  //refers to heap space of object 1
        object2.Display();
    }

}
