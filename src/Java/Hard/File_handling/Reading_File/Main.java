package Java.Hard.File_handling.Reading_File;

import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try {
            FileReader reader = new FileReader("src/Java/Hard/File_handling/text.txt");
            int character;

            while ((character = reader.read()) != -1)
            {
                System.out.print((char) character); // Read character-by-character
            }

            reader.close(); // Always close the reader
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
