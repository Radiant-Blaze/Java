package Practice_Final.Q3;

public class Bank
{
    static double calculateInterest(double principal, double rate)
    {
        return (principal * rate) / 100;
    }

    static double calculateInterest(double principal, double rate, int time)
    {
        return (principal * rate * time) / 100;

    }

    static double calculateInterest(double monthlyDeposit, int months, double rate)
    {
        return (monthlyDeposit *  months * rate) / 100;
    }

    public static void main(String[] args)
    {
        System.out.println("Savings Account Interest        : " + calculateInterest(2500.00, 5.9));
        System.out.println("Fixed Deposit Interest          : " + calculateInterest(2500.00, 8.0, 2));
        System.out.println("Recurring Deposit Interest      : " + calculateInterest(12.00, 22, 6.5));
    }

}
