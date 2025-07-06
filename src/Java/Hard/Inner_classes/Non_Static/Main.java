package Java.Hard.Inner_classes.Non_Static;

public class Main
{
    void dispaly()
    {
        System.out.println("Outer class display method\n");
    }
    class Display
    {
        void display()
        {
            System.out.println("Inner class display method called");
            System.out.println("This method can only be called if the parent object is created");
        }
    }

    public static void main(String[] args)
    {
        Main main = new Main();     //parent object created
        main.dispaly();

        Main.Display display = main.new Display();      //child object can only be created by the reference of parent
        display.display();
    }
}
