package Java.Intermediate.OOPs.IMPORTANT.Abstraction_Better;

public abstract class Blueprint
{
    String Main_Character_name;
    int HP;
    abstract void Character_Gender(); //ABSTRACT method -> must be defined in the child classes
    abstract void Health();              //ABSTRACT method -> must be defined in the child classes

    Blueprint(String name, int Health)  //CONCRETE method -> you can define it in child class if you want
    {
        this.Main_Character_name =name;
        this.HP = Health;
    }

    void move()
    {
        System.out.println(Main_Character_name + " is moving");
    }

}
