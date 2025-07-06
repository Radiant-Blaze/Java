package Java.Hard.Inner_classes.Anonymous;

abstract class Display
{
    abstract void display();
}

public class Main
{
    public static void main(String[] args)
    {
        Display dog = new Display()
        {
            @Override
            void display()
            {
                System.out.println("Anonymous class");
                System.out.println("bark bark\n");
            }
        };

        Display cat = new Display()
        {
            @Override
            void display()
            {
                System.out.println("Anonymous class");
                System.out.println("meow meow");
            }
        };


        dog.display();
        cat.display();
    }
}