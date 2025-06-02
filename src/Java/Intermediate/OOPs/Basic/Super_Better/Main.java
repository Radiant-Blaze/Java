package Java.Intermediate.OOPs.Basic.Super_Better;

public class Main
{
    public static void main(String[] args)
    {

        Dog mother = new Dog("lisa",8);
        Puppy pup  = new Puppy("Rex",1);
        Puppy afdv = new Puppy();

        mother.Print_Info();
        afdv.Snuggle();
        pup.Print_Info();
        pup.Snuggle();
    }

}
