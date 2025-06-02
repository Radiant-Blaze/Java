package LABS.MID_TERM.Q3;

public class BankAccount
{
    String customerName, address, accountType;
    double balance;
    int contactNumber, accountNumber;
    BankAccount(String customerName, String address, String accountType, double balance, int contactNumber, int accountNumber)
    {
        this.accountNumber  = accountNumber;
        this.accountType    = accountType;
        this.customerName   = customerName;
        this.address        = address;
        this.balance        = balance;
        this.contactNumber  = contactNumber;
    }

    void displayAccount()
    {
        System.out.println(" Hello           : " + customerName);
        System.out.println(" Account Number  : " + accountNumber);
        System.out.println(" Account Type    : " + accountType);
        System.out.println(" Address         : " + address);
        System.out.println(" Contact number  : " + contactNumber);
        System.out.println(" Your balance is : " + balance);
        System.out.println();
    }

    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount("Farhan Tariq","House 12","Debit",250000,12345891,123789);
        BankAccount bankAccount2 = new BankAccount("Ahmed Ali","House 13","Debit",200000,623586,359000);
        BankAccount bankAccount3 = new BankAccount("Zaid Khan","House 14","Credit",150000,2659654,624853);
        BankAccount bankAccount4 = new BankAccount("Mizra Baig","Apart 1","Credit",550000,546632,48756325);

        bankAccount.displayAccount();
        bankAccount2.displayAccount();
        bankAccount3.displayAccount();
        bankAccount4.displayAccount();
    }


}
