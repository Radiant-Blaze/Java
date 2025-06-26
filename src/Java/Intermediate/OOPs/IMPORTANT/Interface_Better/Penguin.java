package Java.Intermediate.OOPs.IMPORTANT.Interface_Better;

public class Penguin extends Eat implements Run, Bird
{
    @Override
    public void run()
    {
        System.out.println(" The penguin is running");
    }

    @Override
    public void walk()
    {
        System.out.println(" The penguin is walking");
    }
}
