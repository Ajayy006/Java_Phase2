import java.util.*;
class cons
{
    int accountnumber;
    String accountHoldername;
    double mobilenumber;
    String accounttype;
    double balance;
    cons(int accountnumber,String accountHoldername,double mobilenumber,String accounttype,double balance)
    {
        this.accountnumber=accountnumber;
        this.accountHoldername=accountHoldername;
        this.mobilenumber=mobilenumber;
        this.accounttype=accounttype;
        this.balance=balance;
    }
}
public class ConstructorReq
{
    public static void main(String[] args)
    {
        cons c1 = new cons(123456,"Mariamman",9876543210.0,"Savings",10000.0);
        System.out.println("Account number: "+c1.accountnumber);
        System.out.println("Account holder name: "+c1.accountHoldername);
        System.out.println("Mobile number: "+c1.mobilenumber);
        System.out.println("Account type: "+c1.accounttype);
        System.out.print("Balance:"+c1.balance); 
    }
}