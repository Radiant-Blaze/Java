package Java.Intermediate.OOPs.Basic.Super_Better;

public class Puppy extends Dog
{
    String pup_name = "Harry Potter";

    Puppy(String name_of_pup, int age_of_pup)
    {
        super(name_of_pup ,age_of_pup);

        this.pup_name = name_of_pup;
    }

    Puppy()
    {
        super();
    }

    void Snuggle()
    {
        System.out.println(" " + pup_name + " is snuggling");
    }
}
