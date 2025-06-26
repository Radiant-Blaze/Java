package Practice_Final.Q4;

public class Shipping
{

    static double calculateCost(double weight)
    {
        return weight * 10;
    }

    static double calculateCost(double weight, double distance)
    {
        return weight * distance * 0.5;
    }

    static double calculateCost(double weight, double distance, double customsFee)
    {
        return (weight * distance * 0.5) + customsFee;
    }

    public static void main(String[] args)
    {
        System.out.println("Delivery Cost : " + calculateCost(50));
        System.out.println("Delivery Cost : " + calculateCost(20,50));
        System.out.println("Delivery Cost : " + calculateCost(20,50,100));
    }
}
