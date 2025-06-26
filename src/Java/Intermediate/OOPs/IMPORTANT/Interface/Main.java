package Java.Intermediate.OOPs.IMPORTANT.Interface;

public class Main {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //                     that implementing classes MUST define.
        //                     Supports multiple inheritance-like behavior.

        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Baby_Rabbit babyRabbit = new Baby_Rabbit();

        rabbit.flee();
        babyRabbit.flee();

//        hawk.hunt();
//        fish.flee();
//        fish.hunt();

    }
}