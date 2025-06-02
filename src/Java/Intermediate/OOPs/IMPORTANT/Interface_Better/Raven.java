package Java.Intermediate.OOPs.IMPORTANT.Interface_Better;

public class Raven extends Eat implements Fly,Run
{
    @Override
    public void Fly()
    {
        System.out.println(" The raven is flying");
    }

    @Override
    public void run()
    {
        System.out.println(" the raven is walking");
    }

    @Override
    public void walk()
    {
        System.out.println(" The raven is walking");
    }
}
