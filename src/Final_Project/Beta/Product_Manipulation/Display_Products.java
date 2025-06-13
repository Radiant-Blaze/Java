package Final_Project.Beta.Product_Manipulation;

import Final_Project.Beta.Display.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Display_Products extends Main
{

    @Override
    public void Display()
    {
        Start_Lines();
        Line();

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file_Name));

            String  line_Get_From_File = "";
            boolean data_In_File = false;

            while ((line_Get_From_File = bufferedReader.readLine()) != null)
            {
                System.out.println(line_Get_From_File);
                data_In_File = true;
            }

            if (!data_In_File)
            {
                System.out.println("No Products in the file");
            }

            bufferedReader.close();

        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        } catch (IOException e)
        {
            System.out.println("IO exception occured");
        }


        Front front = new Front();
        front.Display();

    }

    @Override
    public void Check_Condition() {

    }

    @Override
    public void Start_Lines() {
        System.out.println("------------------------------All  Available  Products-------------------------------");
    }
}
