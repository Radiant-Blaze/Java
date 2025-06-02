package Java.Intermediate.OOPs.IMPORTANT.Abstraction_Better;

public class Game2 extends Blueprint
{
    Game2(String name, int HP)
    {
        super(name,HP);
    }
    @Override
    void Character_Gender()
    {
        System.out.println(Main_Character_name + " is a Girl");
    }

    @Override
    void Health()
    {
        System.out.println(Main_Character_name + " have " + HP + " HP left");
    }

    @Override
    void move()
    {
        System.out.println(Main_Character_name + " is flying");
    }
}

