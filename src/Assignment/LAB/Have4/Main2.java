package Assignment.LAB.Have4;

public class Main2 {

    public static void main(String[] args)
    {

        Car abc = new Car();

        abc.showDetails();

    }

}

class Car
{

    String Brand = "Toyota";
    String Color = "Red";
    int Year = 2020;

    void showDetails()
    {
        System.out.println(" Brand :" + Brand + "\n Color : " + Color + "\n Year : " + Year);
    }



}

