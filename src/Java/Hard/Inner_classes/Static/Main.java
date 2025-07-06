package Java.Hard.Inner_classes.Static;

public class Main
{
    static class Display
    {
        void display()
        {
            System.out.println("Static inner class object called");
            System.out.println("Can be called without referencing the parent");
        }
    }

    public static void main(String[] args)
    {
        Display display = new Display();
        display.display();
    }
}
