class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String mobileNumber;

    public Account(String accountHolder, String accountNumber, double balance, String mobileNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.mobileNumber = mobileNumber;
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Mobile Number: " + mobileNumber);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" ERROR: Cannot deposit negative or zero amount!");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs." + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("ERROR: Cannot withdraw negative or zero amount!");
            return;
        }
        if (amount > balance) {
            System.out.println(" ERROR: Insufficient balance! Available: Rs." + balance);
            return;
        }
        balance -= amount;
        System.out.println(" Withdrawn Rs." + amount);
    }

    public void displayBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    public void changeMobileNumber(String newMobileNumber) {
        System.out.println("Changing mobile number from " + mobileNumber + " to " + newMobileNumber);
        this.mobileNumber = newMobileNumber;
        System.out.println("Mobile number updated successfully!");
    }

    public void displayMobileNumber() {
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

public class Banksysop {
    public static void main(String[] args) {
       
        Account account1 = new Account("Rahul Kumar", "ACC001", 10000, "9876543210");

        System.out.println("\n1. Display Account Details:");
        account1.displayDetails();

        System.out.println("2. Deposit Rs.5000:");
        account1.deposit(5000);

        System.out.println("\n3. Display Updated Balance:");
        account1.displayBalance();

        System.out.println("\n4. Withdraw Rs.3000:");
        account1.withdraw(3000);

        System.out.println("\n5. Display Updated Balance:");
        account1.displayBalance();

        System.out.println("\n6. Change Mobile Number:");
        account1.changeMobileNumber("9999999999");
        System.out.println("\n7. Display Updated Mobile Number:");
        account1.displayMobileNumber();

        System.out.println("\n8. Try Depositing Negative Amount:");
        account1.deposit(-1000);

        System.out.println("\n9. Try Withdrawing Negative Amount:");
        account1.withdraw(-500);

        System.out.println("\n10. Try Withdrawing Amount Greater Than Balance:");
        account1.withdraw(50000);

        Account account2 = new Account("Priya Singh", "ACC002", 5000, "8765432109");

        System.out.println("\n1. Display Account Details:");
        account2.displayDetails();

        System.out.println("2. Deposit Rs.10000:");
        account2.deposit(10000);

        System.out.println("\n3. Withdraw Rs.5000:");
        account2.withdraw(5000);

        System.out.println("\n4. Display Final Account Details:");
        account2.displayDetails();
    }
}