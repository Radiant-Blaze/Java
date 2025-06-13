package LABS.LAB7.Q1;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();

        main.pay("12345-6789-12564");
        main.pay(123456789);
        main.pay(20.00);
    }

    public void pay(String credit_Card_Number)
    {
        System.out.println("Bill payed by using " + credit_Card_Number);
    }

    public void pay(int mobile_Number)
    {
        System.out.println("Bill payed by using " + mobile_Number);
    }

    public void pay(double cash)
    {
        System.out.println("Bill payed by using " + cash);

    }

}

