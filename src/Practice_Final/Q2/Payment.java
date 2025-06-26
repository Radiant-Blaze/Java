package Practice_Final.Q2;

public abstract class Payment
{
    abstract void Make_Payment();

    public static void main(String[] args)
    {
        Payment creditCardPayment = new CreditCardPayment();
        Payment upiPayment = new UPIPayment();
        Payment paypalPayment = new PayPalPayment();

        creditCardPayment.Make_Payment();
        upiPayment.Make_Payment();
        paypalPayment.Make_Payment();
    }
}

class CreditCardPayment extends Payment
{
    @Override
    void Make_Payment()
    {
        System.out.println("Payment done by Credit card");
    }
}

class UPIPayment extends Payment
{
    @Override
    void Make_Payment()
    {
        System.out.println("payment done by UPI");
    }
}

class PayPalPayment extends Payment
{

    @Override
    void Make_Payment()
    {
        System.out.println("Payment done by PayPal");
    }
}