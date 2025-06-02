package Java.Intermediate.OOPs.IMPORTANT.Abstraction_Better;

public class Main
{
    public static void main(String[] args)
    {
        //Blueprint abc = new Blueprint()   // We can't use this as this is an abstract method

        Game1 LEGO = new Game1("Heisenberg",80);
        Game2 GTFO = new Game2("Hana",75);

        LEGO.Character_Gender();            //ABSTRACT METHOD is defined     in child classes
        LEGO.Health();                      //ABSTRACT METHOD is defined     in child classes
        LEGO.move();                        //CONCRETE METHOD is not defined in child class

        GTFO.Character_Gender();            //ABSTRACT METHOD is defined in child classes
        GTFO.Health();                      //ABSTRACT METHOD is defined in child classes
        GTFO.move();                        //CONCRETE METHOD is defined in child class
    }

}
