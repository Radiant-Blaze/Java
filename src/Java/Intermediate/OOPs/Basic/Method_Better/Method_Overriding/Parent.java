package Java.Intermediate.OOPs.Basic.Method_Better.Method_Overriding;

public class Parent
{
    String name;

    Parent(String parent_name)
    {
        this.name = parent_name;
    }

    void Info()
    {
        System.out.println(" Hello " + name);
    }

    void Eat()
    {
        System.out.println(" " + name + " is eating food");
    }
}
