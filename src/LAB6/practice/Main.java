package LAB6.practice;

public class Main
{
    public static void main(String[] args)
    {
        class2 farid = new class2();
        farid.show();
    }
}

class class1
{
    int age = 28;
    String name1 = "Babar Azam";

    void show()
    {
        System.out.println("Hello " + name1 + " your age : " + age);
    }
}

class class2 extends class1
{
    int num2 = 25;

    @Override
    void show()
    {
        super.show();
        System.out.println("Age: (2nd class) : " + num2);
    }
}
