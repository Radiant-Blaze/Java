package Java.Intermediate.OOPs.Basic.Method_Better.Method_Overriding;

public class Baby extends Parent
{
    String name;
    Baby(String Baby_name)
    {
        super(Baby_name);
        this.name = Baby_name;
    }

    @Override
    void Eat()
    {
        System.out.println(" " + name + " is drinking milk");
    }
}
