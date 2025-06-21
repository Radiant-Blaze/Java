package Java.Intermediate.OOPs.IMPORTANT.Immutable_Classes.Main;

final class abc
{
     private final int ID;
     private final String name;

    abc(int id, String name)
    {
        this.ID = id;
        this.name = name;
    }

    void Display()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " +ID);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        abc abc = new abc( 12 ,"Dr. House Gregory MD." );
        abc.Display();
    }
}
