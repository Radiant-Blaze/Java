package Final_Project.Alpha;

public abstract class Display_Parent
{
    boolean running = true;
    int choice;

    public abstract void Display();
    public abstract void check_Condition();

    public abstract void Start_Lines();
    public void End_Lines()
    {
        System.out.println("------------------------------------------------------------\n");
    }
    public void Line()
    {
        System.out.println();
    }

    public void Selection()
    {
        Line();
        System.out.println("Remember to type  \"NUMBERS\" ONLY ");
        End_Lines();
        System.out.print("Please Select the following: ");

        check_Condition();
        running = false;
    }
}
