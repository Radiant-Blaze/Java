package Practice_Final.Q4;

public class Add
{
    void add(int a, int b)
    {
        System.out.println("Answer : " + (a+b) );
    }

    void add(double a, double b)
    {
        System.out.println("Answer : " + (a+b) );
    }

    public static void main(String[] args)
    {
        Add add = new Add();
        add.add(2,5);
        add.add(3.5,9.5);
    }
}
