package Java.Hard.File_handling.Writing_File;

import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("src/Java/Hard/File_handling/text.txt");
            writer.write("Do you have any bread?🤔\n");
            writer.write("Why yes, would you like some?🙂‍↕️\n");
            writer.write("I should say so, it's the yeast you could do!😏\n");
            writer.write("[stabs him with a dull bread knife]😡🔪");
            writer.write("\n");
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e)
        {
            System.out.println("IO exception occurred");
            e.printStackTrace();
        }
    }
}
