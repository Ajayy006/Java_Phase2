import java.util.*;
class Bank
{
    int accountNumber;
    String accountHolder;
    double mobileNumber;
    String accounttype;
    double initialbalance;
}
public class Mainmeth
{
    public static void main(String[] args)
    {
       Bank b1 = new Bank();
       Bank b2 = new Bank();
       final String Bankname = "Mariamman Indian Bank";
       b1.accountNumber = 123456;
       b1.accountHolder = "Mariamman";
       b1.mobileNumber = 98765410;
       b1.accounttype = "Savings";
       b1.initialbalance = 10000.0;
       b2.accountNumber = 789012;
       b2.accountHolder = "Umapathy";
       b2.mobileNumber = 87654329;
       b2.accounttype = "Current";
       b2.initialbalance = 15000.0;
       System.out.println("Bank name is: "+Bankname);
       System.out.println("Account number: "+b1.accountNumber);
         System.out.println("Account holder name: "+b1.accountHolder);  
        System.out.println("Mobile number: "+b1.mobileNumber);
        System.out.println("Account type: "+b1.accounttype);
        System.out.println("Balance: "+b1.initialbalance);
        System.out.println("Account number: "+b2.accountNumber);
        System.out.println("Account holder name: "+b2.accountHolder);
        System.out.println("Mobile number: "+b2.mobileNumber);
        System.out.println("Account type: "+b2.accounttype);
        System.out.println("Balance: "+b2.initialbalance);

    }
}