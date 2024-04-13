package Assignments4;

public class BankAccount {
     private int accountnumber;
    private String accountholdername;
   private  double balance;
    private String accounttype;

    public BankAccount(int accountnumber, String accountholdername, double balance, String accounttype) {
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
        this.accounttype = accounttype;
    }
    public void Deposit(double amount)
    {
        if(amount>0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + "into account" + this.accountnumber);
        }
        else{
        System.out.println("Please enter the positive number");
    }
    }
    public void Withdraw(double amount)
    {
        if(amount>0 && amount<= this.balance) {
            System.out.println("withdrawed " + amount + "into account" + this.accountnumber);
        }
        else {
            System.out.println("your account is empty");
        }
    }
    public void DisplayDetails()
    {
        System.out.println("Account Number"  + this.accountnumber);
        System.out.println("Account holder name" + this.accountholdername);
        System.out.println("Account balance" + this.balance);
        System.out.println("Account Type" + this.accounttype);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(2569874, "reet", 8950, "saving");
        acc1.DisplayDetails();
        acc1.Withdraw(500);
        acc1.Deposit(900);
    }




}
