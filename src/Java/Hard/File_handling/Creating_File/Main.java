package Java.Hard.File_handling.Creating_File;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {

        File file = new File("src/Java/Hard/File_handling/text.txt");
        try {
            if (file.createNewFile())
            {
                System.out.println("File created!");
            }else
            {
                System.out.println("File exists!");
            }
        } catch (IOException e)
        {
            System.out.println("IO exception occurred");
            e.printStackTrace();
        }
    }
}
