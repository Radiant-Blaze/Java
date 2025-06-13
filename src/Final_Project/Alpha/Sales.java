package Final_Project.Alpha;

public class Sales extends Display_Parent
{

    @Override
    public void Display()
    {
        Start_Lines();
        Line();

        System.out.println("Products Available: ");
        Line();

    }

    @Override
    public void check_Condition() {

    }

    @Override
    public void Start_Lines() {System.out.println("---------------Welcome to Sales Section---------------\n");}
}
