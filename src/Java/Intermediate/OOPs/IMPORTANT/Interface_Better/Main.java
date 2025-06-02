package Java.Intermediate.OOPs.IMPORTANT.Interface_Better;

public class Main
{
    public static void main(String[] args)
    {
        Raven   raven   = new Raven();
        Penguin penguin = new Penguin();

        raven.Fly();
        raven.walk();
        penguin.Eat();

        //penguin.Fly();        // will not work as it doesn't implement that method
                                // we can use extends with implements
    }
}
