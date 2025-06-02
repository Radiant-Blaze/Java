package Java.Intermediate.OOPs.IMPORTANT.Abstraction_Better;

public class Game1 extends Blueprint
{
    Game1(String name, int HP)
    {
        super(name,HP);
    }
    @Override
    void Character_Gender()
    {
        System.out.println(Main_Character_name + " is a Boy");
    }

    @Override
    void Health()
    {
        System.out.println(Main_Character_name + " have " + HP + " HP left");
    }
}
