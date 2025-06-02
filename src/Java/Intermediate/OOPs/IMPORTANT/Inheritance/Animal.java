package Java.Intermediate.OOPs.IMPORTANT.Inheritance;

public class Animal extends Organism
{
    int legs = 0;

    void eat(){
        System.out.println("This animal is eating");
    }

    Animal()
    {
        isAlive = true;
    }
}