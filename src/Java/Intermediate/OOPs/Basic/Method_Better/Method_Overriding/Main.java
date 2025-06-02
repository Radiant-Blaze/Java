package Java.Intermediate.OOPs.Basic.Method_Better.Method_Overriding;

public class Main
{
    public static void main(String[] args)
    {

        Parent alex   = new Parent("Alex");
        Baby   george = new Baby("George");

        alex.Eat();
        george.Eat();

    }
}
