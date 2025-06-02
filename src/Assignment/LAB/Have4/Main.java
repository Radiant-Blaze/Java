package Assignment.LAB.Have4;

public class Main {

    public static void main(String[] args)
    {

        car abc = new car();

        abc.Color = "blue";
        abc.Brand = "Honda";
        abc.Year  = 2017;

        abc.showDetails();

    }

}

class car
{

    String Brand = "Toyota";
    String Color = "Red";
    int Year = 2020;

    void showDetails()
    {
        System.out.println(" Brand :" + Brand + "\n Color : " + Color + "\n Year : " + Year);
    }



}

