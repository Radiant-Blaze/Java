package Java.Intermediate.OOPs.IMPORTANT.Anonymous;

public class Main
{
    public static void main(String[] args)
    {

        Dog dog = new Dog();
        Dog scoobydoo = new Dog() // we override by using anonymous class here (ONLY FOR A SINGLE OBJECT)
        {
            @Override
            void Speak()
            {
                System.out.println("Scooby Doo goes *Raggy RUN* 🐕");
            }
        };

        dog.Speak();
        scoobydoo.Speak();
    }
}
