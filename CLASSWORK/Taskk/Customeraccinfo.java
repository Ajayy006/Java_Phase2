import java.util.*;
class details
{
    int accountnumber;
    String accountHoldername;
    double mobilenumber;
    String accounttype;
    double balance; 
    void display()
    {
        System.out.println("Account number: "+accountnumber);
        System.out.println("Account holder name: "+accountHoldername);
        System.out.println("Mobile number: "+mobilenumber);
        System.out.println("Account type: "+accounttype);
        System.out.print("Balance:"+balance); 
    }
}
class Customeraccinfo
{
    public static void main(String[] args)
    {
        details d1 = new details();
        d1.display();
        d1.accountnumber=123456;
        d1.accountHoldername="Mariamman";
        d1.mobilenumber=9876543210.0;
        d1.accounttype="Savings";
        d1.balance=10000.0;
        details d2 = new details();
        d2.display();
        d2.accountnumber=789012;
        d2.accountHoldername="Umapathy";
        d2.mobilenumber=8765432109.0;
        d2.accounttype="Current";
        d2.balance=15000.0;
    }
}