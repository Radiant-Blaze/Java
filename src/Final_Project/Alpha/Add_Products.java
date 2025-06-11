package Final_Project.Alpha;

public class Add_Products extends Display_Parent
{

    @Override
    public void Display()
    {
        Start_Lines();
    }

    @Override
    public void check_Condition() {

    }

    @Override
    public void Start_Lines()
    {
        System.out.println("---------------Welcome to Add Product Section---------------\n");
        System.out.println("Previous Stock: ");
        Line();

        System.out.println("What will you do today?");
        Line();

        System.out.println("1. Add a new product");
        System.out.println("2. Add an existing product");
        End_Lines();

        System.out.println("");
    }

    public static void main(String[] args)
    {
        Add_Products a = new Add_Products();
        a.Display();
    }
}
