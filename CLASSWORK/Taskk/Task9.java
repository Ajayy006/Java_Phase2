import java.util.*;
class Bank
{
    String accountHolder;
    String accountNumber;
    double balance;
    String mobileNumber;
    String accounttype;
    public void displayDetails() {
        System.out.println("\t Mariamman Indian Bank" );
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accounttype);
    }
}
    public class Task9
    {
        public static void main(String[] args)
        {
            Bank b1 = new Bank();
            b1.accountHolder = "Ishowspeed";
            b1.accountNumber = "10101010";
            b1.mobileNumber = "9876543210";
            b1.balance = 10000.0;
            b1.accounttype = "Savings";
            b1.displayDetails();
            System.out.print("Enter Withdraw Amount: ");
            Scanner sc = new Scanner(System.in);
            double withdrawAmount = sc.nextDouble();
            if (withdrawAmount <= 0) 
            {
                System.out.print("Invalid Withdraw Amount.");
            }
            else if (withdrawAmount > b1.balance) 
            {
                System.out.print("Insufficient Balance.");
            }
            else 
            {
                b1.balance -= withdrawAmount;
                System.out.print("Withdrawn Amount: Rs." + withdrawAmount);
                System.out.print("\nUpdated Balance: Rs." + b1.balance);
            }
     }
    }


    