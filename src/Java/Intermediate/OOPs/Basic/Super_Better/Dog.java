package Java.Intermediate.OOPs.Basic.Super_Better;

public class Dog
{
    String dog_name ;
    int dog_age;

    Dog(String name, int age)
    {
        this.dog_age  = age;
        this.dog_name = name;
    }

    Dog()
    {

        System.out.println("Non parametrized");
    }

    void Print_Info()
    {
        System.out.println(" " + dog_name + " is " + dog_age + " years old.");
    }

}
