package Final_Project.Beta.Display;

import Final_Project.Beta.Product_Manipulation.Add_Products;
import Final_Project.Beta.Product_Manipulation.Display_Products;
import Final_Project.Beta.Product_Manipulation.Update_Products;

public class Product extends Main
{
    //Scanner scanner = new Scanner(System.in);

    @Override
    public void Display()
    {
        while (running)
        {
            Start_Lines();
            System.out.println("Total Products : ");
            System.out.println("Total quantity : ");
            Line();

            What_Will_You_Do_Today();
            Line();

            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            Line();

            Selection();
        }
    }

    @Override
    public void Check_Condition()
    {
        boolean checking = true;

        while (checking)
        {
            Enter_Choice();

            switch (choice)
            {
                case 1 :

                    System.out.println("Proceeding to Add product section...");
                    Thread_Sleep();

                    Add_Products addProducts = new Add_Products();
                    addProducts.Display();
                    checking = false;
                    break;

                case 2 :
                    System.out.println("Proceeding to Update product section...");
                    Thread_Sleep();

                    Update_Products updateProducts = new Update_Products();
                    updateProducts.Display();
                    checking = false;
                    break;
                case 3 :
                    Display_Products displayProducts = new Display_Products();
                    displayProducts.Display();
                    checking = false;
                    break;
                case 4 : System.out.println(" Exiting");                            running = false;    checking = false;         break;
                default: System.out.println(" Enter between 1-4");                                      checking = false;         break;
            }
        }
    }

    @Override
    public void Start_Lines() {System.out.println("---------------Welcome  to  products  section---------------");}
}
