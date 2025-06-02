package Java.Intermediate.OOPs.Basic.Constructors.Normal;

public class Main
{

    public static void main(String[] args)
    {
        
        Student std1 = new Student("Goku", 40, 2.1);
        Student std2 = new Student("Bulma", 56, 4.0);
        Student std3 = new Student("Gohan", 24, 3.5);

        std1.info();
        std2.info();
        std3.info();

        System.out.println("\n " + std3.name);
    }
    
}
