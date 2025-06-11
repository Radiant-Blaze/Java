package Final_Project.Alpha;

//import java.util.Scanner;

public class Add_Products extends Display_Parent
{
    //Scanner scanner = new Scanner(System.in);

    @Override
    public void Display()
    {
        Start_Lines();
        System.out.println("Previous Stock: ");
        Line();

        System.out.println("What will you do today?");
        Line();

        System.out.println("1. Add a new product");
        System.out.println("2. Add an existing product");
        Selection();
    }

    @Override
    public void check_Condition()
    {
        Enter_Choice();
    }

    @Override
    public void Start_Lines()
    {
        System.out.println("---------------Welcome to Add Product Section---------------\n");
    }

    public static void main(String[] args)
    {
        Add_Products a = new Add_Products();
        a.Display();
    }
}
