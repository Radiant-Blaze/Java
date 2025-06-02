package Java.Intermediate.OOPs.IMPORTANT.Inheritance;

public class Main
{

    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        //dog.eat();
        //plant.photosynthesize();
        //cat.speak();
        
        /*if(cat.isAlive == true)
        {
            System.out.println(" cat is alive");
        }else
        {
            System.out.println(" Cat is dead");
        }*/

        System.out.println(cat.isAlive);

    }
    
}
